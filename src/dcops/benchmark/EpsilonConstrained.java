package dcops.benchmark;

// @author maryam

import static dcops.benchmark.AlgorithmCompare.CompareTable;
import static dcops.benchmark.AlgorithmCompare.algMatrix;
import static dcops.benchmark.ConstraintGeneratorAdd.getaverage;
import static dcops.benchmark.ConstraintGeneratorAdd.getstd;
import static dcops.benchmark.ConstraintGeneratorAdd.printFileFXs;
import static dcops.benchmark.ConstraintGeneratorAdd.readFile;
import static dcops.benchmark.ConstraintGeneratorAdd.readFileCsv;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EpsilonConstrained {
    public List<Individual> population;
    public double CR;
    public int NP;
    public int numF;
    public int D;
    public double[] lowerLimit;
    public double[] upperLimit;
    public double betamin = .20;
    public double betamax = .80;
    public double t = 0;
    //Parameters for epsilon constrained 
    public double epsilon;
    public List<Double> SumCVs ;
    public List<Double> Fs ;
    public double b;
    public double b1;
    double ap = .9;
    double cp = 5;      
    double Tc;
    public static List<List<Double>>ListMError;        

    
    public EpsilonConstrained(int NP, int D, int numF, double CR, double ab[][], double Tc, int lowerParam, int upperParam) {
        this.NP = NP;
        this.numF = numF;
        this.D = D;
        this.CR = CR;
        this.b = b;
        this.b1 = b1;        
        Fs = new ArrayList();
        SumCVs = new ArrayList();        
        lowerLimit = new double[this.D];
        upperLimit = new double[this.D];
        this.Tc=Tc;        
        for (int i = 0; i < D; i++) {
            lowerLimit[i] = lowerParam;
            upperLimit[i] = upperParam;
        }
        //changes this value of epsilon 

        this.epsilon = .1;
        population = new ArrayList();
        for (int i = 0; i < this.NP; i++) {
            population.add(new Individual(D));
            for (int j = 0; j < this.D; j++) {
                population.get(i).x[j] = Math.random() * (upperLimit[j] - lowerLimit[j]) + lowerLimit[j];
            }
           
            population.get(i).getFitness(this.numF, t, ab, false);
        }
    }

    public boolean getDifferenceConstraints(double[] g_old, double[] g_new) {
        for (int i = 0; i < g_old.length; i++) {
            if (g_old[i] != g_new[i]) {
                return true;
            }
        }
        return false;
    }

    public boolean detect_change(Individual ind, double ab[][]) {
        double[] g_old = new double[ind.g.size()];
        double[] g_new = new double[ind.g.size()];
        double fx_old = ind.fx;;
        for (int k = 0; k < ind.g.size(); k++) {
            g_old[k] = ind.g.get(k);
        }
        ind.getFitness(numF, t, ab, false);
        for (int k = 0; k < ind.g.size(); k++) {
            g_new[k] = ind.g.get(k);
        }
        if (ind.fx != fx_old || getDifferenceConstraints(g_old, g_new)) {
            
            return true;
        }
        return false;
    }

    
    public Individual getBest(Individual vecU, Individual ind2) {
        if (vecU.SumR <= epsilon && ind2.SumR <= epsilon) {
            //review if both solutions have the same sum of constraint violation 
            if (vecU.fx <= ind2.fx) {
                return vecU;
            } else {
                return ind2;
            }
        }

        if (vecU.SumR == ind2.SumR) {
            if (vecU.fx <= ind2.fx) {
                return vecU;
            } else {
                return ind2;
            }
        }

        if (vecU.SumR <= ind2.SumR) {
            return vecU;
        }
        return ind2;
    }
    
public Individual getBestOne(Individual vecU, Individual ind2 ){
    //For chose the real value based on FR (the best one for every generation)  
    if(vecU.SumR==0 && ind2.SumR==0){
        if(vecU.fx< ind2.fx)
            return vecU;
        else 
            return ind2;
    }
    //If one of them is feasible
    if(vecU.SumR==0 && ind2.SumR >0)
        return vecU;
    if(vecU.SumR>0 && ind2.SumR==0)
        return ind2;
    //both of them are infeasible  
    if(vecU.SumR < ind2.SumR)
        return vecU;
    return ind2;
}

    public void CopyIndividual(Individual ind, int i) {
        for (int j = 0; j < ind.x.length; j++) {
            population.get(i).x[j] = ind.x[j];
        }
        population.get(i).fx = ind.fx;
        population.get(i).SumR = ind.SumR;
        population.get(i).g = new ArrayList();
        for (int m = 0; m < ind.g.size(); m++) {
            population.get(i).g.add(ind.g.get(m));
        }
    }
    
    public void changeTime(int eval, int freq, int MAX_EVAL, int MAX_t, 
        Individual bestOne) {
        if ((eval % freq == 0) && (eval < MAX_EVAL) && (eval > 1000) && t <MAX_t ) {  
            Fs.add(bestOne.fx);//put fixed 
            SumCVs.add(bestOne.SumR);//put fixed
            t++;
        }
    }

public void updateEpsilon(double generation){
    if(generation<Tc) {
        double totalFeasible=0;
        //Verified the number of individuals that have a violations
        for (int i = 0; i < population.size(); i++) {
            if(population.get(i).SumR==0)
                totalFeasible=totalFeasible+1;
        }
        totalFeasible=totalFeasible/(double)NP;
        if(totalFeasible>ap)//all most the individual are feasibles
            epsilon=0;
        else {
            //generation is equal to t, in the update epsilon formule //takahama paper 
            epsilon = epsilon * Math.pow(1-generation/Tc,cp);
        }
    }
    else
       epsilon=0; 
}

public Individual getWorst(Individual vecU, Individual ind2) {
        //both Individuals are feasible 
        if (vecU.SumR == 0 && ind2.SumR == 0) {
            if (vecU.fx > ind2.fx) {
                return vecU;
            } else {
                return ind2;
            }
        }
        //If one of them is feasible
        if (vecU.SumR == 0 && ind2.SumR > 0) {
            return ind2;
        }
        if (vecU.SumR > 0 && ind2.SumR == 0) {
            return vecU;
        }
        //both of them are infeasible  
        if (vecU.SumR > ind2.SumR) {
            return vecU;
        }
        return ind2;

    } 
public Individual getWorstPop(){
    Individual worst = population.get(0).clone();
    for (int i = 1; i < NP; i++) {
        worst = getWorst(worst.clone(), population.get(i)).clone();
    }
    return worst;    
}

double getModifiedError(Individual best, double bestKnow){
    if(best.SumR>0){//If the best solution isn't feasible is replaced by the worst
        best=getWorstPop();
    }
    return Math.abs(best.fx-bestKnow);
}

List <Double> getAverage(List<Double> values) {
    double average=0;
    List <Double> Laverage = new ArrayList();
    for (int i = 0; i < values.size(); i++) {
        average = average+values.get(i);
    }
    if (average>0)
        average= average/(double)values.size();
    Laverage.add (average);
    return Laverage;
}
    //public static void main(int changesParam, int dimensionParam, int runsParam, int constraintParam, int lowerParam, int upperParam, int functionParam[], int algorithmParam[], int frequencyParam, int freqDistParam, int accuracyParam, int soverRunsParam) {
    public static void main(int changesParam, int dimensionParam,int NpParams, double FParams, double CRParams, int runsParam, int lowerParam, int upperParam, int functionParam[], int frequencyParam) {
       int frequency = frequencyParam; //the frequency is determined by the number of evaluations
        String[] Sfuncion = {"Sphere", "Rastrigin", "Ackley", "Rosenbrock", "Power", "Custom"};
        DecimalFormat df = new DecimalFormat("0.000");
        //variables
        int MAX_Functions = functionParam.length, runs = runsParam;// variables for the experiments 
        int NP = NpParams, D = dimensionParam, eval, numVec = 3, gen;
        //variables for epsilon constrained 
        int PositionE = (int) (.8 * (double) NP);//position for violation of epsilon; 0.2
        double Tc = (0.8) * ((double) (frequency / NP));//  for atleast 100 fisrt generations 
        double ap = .9; //0.9
        double cp = 5; //5
        double TIMEs = changesParam, t = 0, CR = CRParams, F=FParams;
        int MAX_EVAL = (int) ((TIMEs * frequency) * 2) + 1000 ;
        int middleNP = NP / 2;
        List<List<Double>> ListFXs;
        List<List<Double>> ListSumCV;
        List<List<Double>> ListSumCVs;
        List<List<Double>> ListFs;
        int numChange = changesParam;
        int  MAX_t=numChange-1;
        String name = "Epsilon";
        
        System.out.println("Epsilon constrained");
//        for (int i = 0; i < functionParam.length; i++) {
//            System.out.println(functionParam[i]);
//        }
        int tempRow = 0;
        for (int i = 0; i< 4;i++){
            tempRow += algMatrix[0][i];
        }
        int RowCount = tempRow;
        System.out.println("");
        for (int numF = 0; numF < MAX_Functions; numF++) {
            if (functionParam[numF] == 1) {
            ListFXs = new ArrayList<List<Double>>();
            ListSumCV = new ArrayList<List<Double>>();//M:added for keeping SumCV
            ListSumCVs = new ArrayList<List<Double>>();
            ListFs = new ArrayList<List<Double>>();//M:added for keeping list of f(objective function) after every time change
            ListMError = new ArrayList<List<Double>>();
            String fileName = "ConstraintSet";
            double bestknown [] = readFileCsv("Best_Known"+Sfuncion[numF]+"Fxs.csv",numChange);
            double ab[][] = readFile(fileName, numChange, D);
            System.out.println();
            System.out.println("\n Function " + Sfuncion[numF]);
            for (int r = 0; r < runs; r++) {
                gen = 0;
                eval = 0;
                t = 0;
                List<Double> FXs = new ArrayList();
                List<Double> SumCV = new ArrayList();
                List<Double> Merror = new ArrayList();
                EpsilonConstrained DE = new EpsilonConstrained(NP, D, numF, CR, ab, Tc, lowerParam, upperParam);// A random population was created
                Individual bestOne = new Individual(DE.D);
                bestOne = DE.population.get(0).clone();
                for (int i = 1; i < DE.NP; i++) {
                    bestOne = DE.getBestOne(bestOne, DE.population.get(i)).clone();
                }
                //sort based on the constraint violations (descending order) Initialization of epsilon
                Collections.sort(DE.population);
                double epsilon0 = DE.population.get(PositionE).SumR;
                Collections.shuffle(DE.population);//what do you want to do with this???maybe you want to again reorder the pop?!!
                while (eval < MAX_EVAL && DE.t < (int) TIMEs) {
                    gen++;
                    DE.updateEpsilon(gen);
                    //We get the modified error per generation 
                    Merror.add(DE.getModifiedError(bestOne, bestknown[(int)DE.t]));                    
                    for (int i = 0; i < DE.NP; i++) {
                        //start to evolve the population
                        if(i==0 || i==middleNP){ //the detection of change is carried out
                            if(DE.detect_change(DE.population.get(i), ab)){
                                gen=0;
                                for(int j=0;j<DE.NP;j++){
                                    DE.population.get(j).getFitness(numF, DE.t, ab, false);
                                    eval++;
                                    DE.changeTime(eval, frequency, MAX_EVAL, MAX_t, bestOne);
                                }
                                //update the value of the level of epsilon constrained 
                                Collections.sort(DE.population);
                                DE.epsilon=DE.population.get(PositionE).SumR;
                                Collections.shuffle(DE.population);
                                gen=0;//is used for updated epsilon 
                                bestOne.getFitness(DE.numF, DE.t, ab,false);
                                eval++;
                                DE.changeTime(eval, frequency, MAX_EVAL, MAX_t, bestOne);
                            }
                            eval++;
                                DE.changeTime(eval, frequency, MAX_EVAL, MAX_t, bestOne);
                        }
                        //chose three differents vectors 
                        Individual ind = new Individual(DE.D);
                        List<Individual> vectors = new ArrayList();
                        Individual vecU = new Individual(DE.D);
                        int indp;
                        for (int v = 0; v < numVec; v++) {
                            indp = i;
                            while (indp == i) {
                                indp = (int) (Math.random() * (double) NP);
                                if (vectors.contains(DE.population.get(i))) {
                                    indp = i;
                                }
                            }
                            vectors.add(DE.population.get(indp).clone());
                        }//end for choose three random vectors 
                        int jrand = (int) (Math.random() * DE.D);
                        for (int j = 0; j < DE.D; j++) {
                           // F = Math.random() * (betamax - betamin) + betamin;

                            if (Math.random() < CR || j == jrand) {
                                ind.x[j] = vectors.get(0).x[j] + F * (vectors.get(1).x[j] - vectors.get(2).x[j]);
                                ind.x[j] = Math.max(ind.x[j], DE.lowerLimit[j]);
                                ind.x[j] = Math.min(ind.x[j], DE.upperLimit[j]);
                            } else {
                                ind.x[j] = DE.population.get(i).x[j];
                            }

                        }
                        ind.getFitness(numF, DE.t, ab, false);
                        ind = DE.getBest(ind, DE.population.get(i)).clone();
                        DE.CopyIndividual(ind, i);//Replace the information of the ith population for the new individual; 
                        //Verified how if the new individual is the best  
                        bestOne = DE.getBestOne(bestOne, DE.population.get(i)).clone();
                        eval++;
                        //In case that the frequency is reach, so the time is increased
                        DE.changeTime(eval, frequency, MAX_EVAL, MAX_t, bestOne);
                        if (eval >= MAX_EVAL) {
                            break;//verificar que funcione bien                         
                        }
                    }//end evolve population
                    FXs.add(bestOne.fx);
                    SumCV.add(bestOne.SumR);
                }// end of MAX_Evaluations
                ListFs.add(DE.Fs);
                ListFXs.add(FXs);
                ListSumCV.add(SumCV);
                ListSumCVs.add(DE.SumCVs);
                ListMError.add(DE.getAverage(Merror));
            }//end of the runs 
                
                printFileFXs((name + Sfuncion[numF] + "Fs"), ListFs, runs);
                printFileFXs((name + Sfuncion[numF] + "FXs"), ListFXs, runs);
                printFileFXs((name + Sfuncion[numF] + "SumCV"), ListSumCV, runs);
                printFileFXs((name + Sfuncion[numF] + "SumCVs"), ListSumCVs, runs);
                printFileFXs((name + Sfuncion[numF] + "Merror"), ListMError, runs);
                System.out.println("Averge "+getaverage(ListMError));
                AlgorithmCompare.CompareTable.setValueAt("Epsilon", tempRow, 0);
                if(numF == 0){
                    AlgorithmCompare.jTextArea1.append("Epsilon  "+ "Sphere " + "\n");
                    AlgorithmCompare.CompareTable.setValueAt("Sphere", RowCount, 1);
                    
                    double tempAve = getaverage(ListMError);
                    String ave=String.format("%.3f",tempAve);
                    double tempStd = getstd(ListMError);
                    String std=String.format("%.3f",tempStd);               
                    AlgorithmCompare.CompareTable.setValueAt(ave+"(+-" + std +")", RowCount, 2);
                    RowCount++;
                }
                if(numF == 1){
                    AlgorithmCompare.jTextArea1.append("Epsilon  "+ "Rastrigin " + "\n");
                    AlgorithmCompare.CompareTable.setValueAt("Rastrigin", RowCount, 1);
                    
                    double tempAve = getaverage(ListMError);
                    String ave=String.format("%.3f",tempAve);
                    double tempStd = getstd(ListMError);
                    String std=String.format("%.3f",tempStd);
                    AlgorithmCompare.CompareTable.setValueAt(ave+"(+-" + std +")", RowCount, 2);
                    RowCount++;
                }
                if(numF == 2){
                    AlgorithmCompare.jTextArea1.append("Epsilon  "+ "Ackley " + "\n");
                    AlgorithmCompare.CompareTable.setValueAt("Ackley", RowCount, 1);
                    
                    double tempAve = getaverage(ListMError);
                    String ave=String.format("%.3f",tempAve);
                    double tempStd = getstd(ListMError);
                    String std=String.format("%.3f",tempStd);
                    AlgorithmCompare.CompareTable.setValueAt(ave+"(+-" + std +")", RowCount, 2);
                    RowCount++;
                }
                if(numF == 3){
                    AlgorithmCompare.jTextArea1.append("Epsilon  "+ "Rosenbrock " + "\n");
                    AlgorithmCompare.CompareTable.setValueAt("Rosenbrock", RowCount, 1);
                    
                    double tempAve = getaverage(ListMError);
                    String ave=String.format("%.3f",tempAve);
                    double tempStd = getstd(ListMError);
                    String std=String.format("%.3f",tempStd);
                    AlgorithmCompare.CompareTable.setValueAt(ave+"(+-" + std +")", RowCount, 2);
                    RowCount++;
                }
                AlgorithmCompare.jTextArea1.append(getaverage(ListMError) + "(+-"+getstd(ListMError)+")" + "\n");

        }
    }//end of the functions
}
}
