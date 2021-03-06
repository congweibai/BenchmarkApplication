package dcops.benchmark;

import static dcops.benchmark.ConstraintGenerator.printFileFXs;
import static dcops.benchmark.ConstraintGenerator.readFile;
import static dcops.benchmark.ConstraintGenerator.readFileCsv;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class CustomAlgorithm {
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
    public List<Double> SumCVs ;
    public List<Double> Fs ;
    public double b;
    public double b1;

    public CustomAlgorithm(int NP, int D, int numF, double CR, double ab[][], int lowerParam, int upperParam) {
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
        for (int i = 0; i < D; i++) {
            lowerLimit[i] = lowerParam;
            upperLimit[i] = upperParam;
        }
        population = new ArrayList();
        for (int i = 0; i < this.NP; i++) {
            population.add(new Individual(D));
            for (int j = 0; j < this.D; j++) {
                population.get(i).x[j] = Math.random() * (upperLimit[j] - lowerLimit[j]) + lowerLimit[j];

            }
            population.get(i).getFitness(this.numF, t, ab,false);
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

    public boolean detect_change(Individual ind,double ab[][]) {
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
        //both Individuals are feasible 
        if (vecU.SumR == 0 && ind2.SumR == 0) {
            if (vecU.fx <= ind2.fx) {
                return vecU;
            } else {
                return ind2;
            }
        }
        //If one of them is feasible
        if (vecU.SumR == 0 && ind2.SumR > 0) {
            return vecU;
        }
        if (vecU.SumR > 0 && ind2.SumR == 0) {
            return ind2;
        }
        //both of them are infeasible  
        if (vecU.SumR <= ind2.SumR) {
            return vecU;
        }
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
    public void changeTime(int eval, int freq, int MAX_EVAL, int MAX_t, Individual bestOne) {
        if ((eval % freq == 0) && (eval < MAX_EVAL) && (eval > 1000) && t <MAX_t ) { //eval%frequency==0 

            Fs.add(bestOne.fx);//put fixed 
            SumCVs.add(bestOne.SumR);//put fixed
            t++;
        }
    }
    public void PrintPop(List <Individual> pop){
        for(int i =0; i< pop.size(); i++){
                System.out.println(i+".-  "+pop.get(i).fx+"  "+pop.get(i).SumR );
        }
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
        Individual worst =population.get(0).clone();
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

    List <Double> getAverage(List<Double> values){
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
    
    public static void main(int changesParam, int dimensionParam, int runsParam, int constraintParam, int lowerParam, int upperParam, int functionParam[], int algorithmParam[], int frequencyParam, int freqDistParam, int accuracyParam, int soverRunsParam) {
        //COMMENT OUT BELOW BLOCK WHEN ALGORITHM IMPLEMENTED
        if (1==1) {
            throw new RuntimeException("Algorithm not Initialised");
        }
        //
        
        String[] Sfuncion = {"Sphere", "Rastrigin", "Ackley", "Rosenbrock", "Power", "Custom"};
        DecimalFormat df = new DecimalFormat("0.000");

        //variables
        int MAX_Functions = 6, runs = runsParam;// variables for the experiments 
        int NP = 20, frequency = frequencyParam, D = dimensionParam, eval, numVec = 3, gen;
        double TIMEs = changesParam, t = 0, CR = 0.2, F, betamin = .2, betamax = .8;
        int MAX_EVAL = (int) ((TIMEs * frequency) * 2) + 1000;
        int middleNP = NP / 2;
        List<List<Double>> ListFXs;
        List<List<Double>> ListSumCV;
        List<List<Double>> ListSumCVs;
        List<List<Double>> ListFs;
        List<List<Double>>ListMError;
        int numChange = changesParam;
        int  MAX_t=numChange-1;
        String name = "Feasibility";   
        System.out.println("Feasibility Rules");
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
                System.out.println("\n Function " + Sfuncion[numF]);
                for (int r = 0; r < runs; r++) {
                    List<Double> FXs = new ArrayList();
                    List<Double> SumCV = new ArrayList();
                    List<Double> Merror = new ArrayList();
                    gen = 0;
                    eval = 0;
                    t = 0;
                    CustomAlgorithm DE = new CustomAlgorithm(NP, D, numF, CR, ab, lowerParam, upperParam);// A random population was created
                    Individual bestOne = new Individual(DE.D);
                    bestOne = DE.population.get(0).clone();
                    for (int i = 1; i < DE.NP; i++) {
                        bestOne = DE.getBest(bestOne, DE.population.get(i)).clone();
                    }
                    while (eval < MAX_EVAL && DE.t < (int) TIMEs) {
                        gen++;
                        //We get the modified error per generation 
                        Merror.add(DE.getModifiedError(bestOne, bestknown[(int)DE.t]));
                        for (int i = 0; i < DE.NP; i++) {
                            if (i == 0 || i == middleNP) { //the detection of change is carried out
                                if (DE.detect_change(DE.population.get(i), ab)) {
                                    //update the population when a change is detected; 
                                    for (int j = 0; j < DE.NP; j++) {
                                        DE.population.get(j).getFitness(numF, DE.t,ab, false);
                                        eval++;
                                        DE.changeTime(eval, frequency, MAX_EVAL, MAX_t, bestOne);
                                    }
                                    //update the bestone
                                    bestOne.getFitness(DE.numF, DE.t, ab, false);
                                    eval++;
                                        DE.changeTime(eval, frequency, MAX_EVAL, MAX_t, bestOne);
                                }
                                eval++;
                                DE.changeTime(eval, frequency, MAX_EVAL, MAX_t, bestOne);
                            }
                            //start to evolve the population
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
                                F = Math.random() * (betamax - betamin) + betamin;
                                if (Math.random() < CR || j == jrand) {
                                    ind.x[j] = vectors.get(0).x[j] + F * (vectors.get(1).x[j] - vectors.get(2).x[j]);
                                    ind.x[j] = Math.max(ind.x[j], DE.lowerLimit[j]);
                                    ind.x[j] = Math.min(ind.x[j], DE.upperLimit[j]);
                                } else {
                                    ind.x[j] = DE.population.get(i).x[j];
                                }
                            }
                            ind.getFitness(numF, DE.t,ab, false);
                            ind = DE.getBest(ind, DE.population.get(i)).clone();
                            DE.CopyIndividual(ind, i);//Replace the information of the ith population for the new individual; 
                            //Verified how if the new individual is the best  
                            bestOne = DE.getBest(bestOne, DE.population.get(i)).clone();
                            eval++;
                            //In case that the frequency is reach, so the time is increased
                            DE.changeTime(eval, frequency, MAX_EVAL, MAX_t, bestOne);
                            if (eval >= MAX_EVAL) {
                                break;//Verify that it works                       
                            }
                        }//end evolve population
                        FXs.add(bestOne.fx);
                        SumCV.add(bestOne.SumR);
                    }// end of MAX_Evaluations (runs)
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
            }
        }//end of the functions
    }
}//end class