/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dcops.benchmark;

import static dcops.benchmark.ConstraintGenerator.readFile;
import static dcops.benchmark.ConstraintGenerator.printFileFXs;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

//* @author maryam

public class DE_Best_knowAdd {
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

    public DE_Best_knowAdd(int NP, int D, int numF, double CR,  double ab[][]) {
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
            lowerLimit[i] = -5;
            upperLimit[i] = 5;
        }
        population = new ArrayList();
        for (int i = 0; i < this.NP; i++) {
            population.add(new Individual(D));
            for (int j = 0; j < this.D; j++) {
                population.get(i).x[j] = Math.random() * (upperLimit[j] - lowerLimit[j]) + lowerLimit[j];

            }
            population.get(i).getFitness(this.numF, t, ab, false);
        }

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
public static void printFileFXsNew(String name, List<Double> listFXs, int times) {
        //String route = "/Users/Josue/Documents/MATLAB/Alarm_MOPSO" + it + ".txt";
        String route = name + ".csv";
        File f;
        int iterations;
        f = new File(route);
        try {
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            for (int i = 0; i < times; i++) {//por función 
                    pw.append(listFXs.get(i)+ ", ");                        

            }
            
            pw.close();
            bw.close();

        } catch (IOException ex) {
            Logger.getLogger(DE_Best_knowAdd.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

    }    
    
//            Fs.add(bestOne.fx);//put fixed 
    //        SumCVs.add(bestOne.SumR);//put fixed
    public static void main(int changesParam, int dimensionParam,  
                            int functionParam[], int Max_EvalParam, int RunsParam) {
        String[] Sfuncion = {"Sphere", "Rastrigin", "Ackley", "Rosenbrock", "Power", "Custom"};
        DecimalFormat df = new DecimalFormat("0.000");
        
        //variables
        int MAX_Functions = 6, runs = RunsParam;// variables for the experiments 
        int NP = 20, D = dimensionParam, eval, numVec = 3, gen;
        double TIMEs = changesParam, t = 0, CR = 0.3, F, betamin = .2, betamax = .8;
        double old[];
        int MAX_EVAL = Max_EvalParam;
        List<Double> ListFXs;
        List<Double> ListSumCV;
        List<List<Double>> ListSolutions;
        List<List<Double>> Solutions;
        int numChange = changesParam;
        String name = "Best_Known";   
        //System.out.println("Get_Best_known_per_time ");
        long start = System.currentTimeMillis();
        for (int numF = 0; numF < MAX_Functions; numF++) {
            if (functionParam[numF] == 1) {
                System.out.println(numF);
                old = new double[runs];
                ListFXs = new ArrayList<Double>();
                ListSumCV = new ArrayList<Double>();//M:added for keeping SumCV
                ListSolutions = new ArrayList<List<Double>>();//M:added for keeping list of f(objective function) after every time change
                String fileName = "ConstraintSet"; 
                double ab[][] = readFile(fileName, numChange, D);
                System.out.println("\n Function " + Sfuncion[numF]);
                for (int time = 0; time < (int) TIMEs; time++) {
                    Arrays.fill(old, 9999999);
                    t = (double) time;
                        List<Double> FXs = new ArrayList();
                        List<Double> SumCV = new ArrayList();
                        Solutions = new ArrayList<List<Double>>();//M:added for keeping list of f(objective function) after every time change
                    System.out.println("\n time " + t);
                    for (int r = 0; r < runs; r++) {
                        List<Double> sol = new ArrayList();
                        gen = 0;
                        eval = 0;
                        DE_Best_knowAdd DE = new DE_Best_knowAdd(NP, D, numF, CR, ab);// A random population was created
                        Individual bestOne = new Individual(DE.D);
                        bestOne = DE.population.get(0).clone();
                        for (int i = 1; i < DE.NP; i++) {
                            bestOne = DE.getBest(bestOne, DE.population.get(i)).clone();
                        }
                        double delta = 0.0;
                        while (eval < MAX_EVAL) {
                            gen++;
                            for (int i = 0; i < DE.NP; i++) {
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
                                //System.out.println("IND GET FITNESS");
                                ind.getFitness(numF, DE.t, ab, false);
                                ind = DE.getBest(ind, DE.population.get(i)).clone();
                                DE.CopyIndividual(ind, i);//Replace the information of the ith population for the new individual; 
                                //Verified how if the new individual is the best  
                                bestOne = DE.getBest(bestOne, DE.population.get(i)).clone();
                                eval++;
                                }//end evolve population
                            if (eval > MAX_EVAL-DE.NP || (Max_EvalParam > 1000000 && (bestOne.fx < 0.00001 || (eval % 5000 == 0 && old[r] - bestOne.fx < 0.0000000000001)))){    
                                System.out.println(bestOne.fx);
                                System.out.println("Eval: " + eval);
                                eval = MAX_EVAL;
                            } else {
                                delta = bestOne.fx - delta;
                            }
                            if (eval % 5000 == 0) {
                                old[r] = bestOne.fx;
                            }
                    }// end of MAX_Evaluations (runs)     
                        for (int s = 0; s < bestOne.x.length; s++) {
                            sol.add(bestOne.x[s]);
                        }
                        Solutions.add(sol);
                        FXs.add(bestOne.fx);
                        SumCV.add(bestOne.SumR); 
                    }//end of runs
                    //after the 30 runs we choose the best of the runs 
                    int ind=0;
                    for (int r = 1; r < runs; r++) {
                        //both are feasible 
                        if(SumCV.get(ind)==0 && SumCV.get(r)==0){
                            if(FXs.get(ind)>FXs.get(r))
                                ind=r;
                        } else {
                            if(SumCV.get(ind)>SumCV.get(r))
                                ind=r;
                        }
                    }
                ListFXs.add(FXs.get(ind));
                ListSumCV.add(SumCV.get(ind));
                ListSolutions.add(Solutions.get(ind)); 
                }//end of times 
                System.out.println("TEST");
            System.out.println(System.currentTimeMillis()-start);
            System.out.println("ListFXs.size()  "+ListFXs.size());
            printFileFXsNew((name + Sfuncion[numF] + "Fxs"), ListFXs,ListFXs.size());
            printFileFXsNew((name + Sfuncion[numF] + "SumCV"), ListSumCV, ListFXs.size());
            printFileFXs((name + Sfuncion[numF] + "Solutions"), ListSolutions, D);//we need the dimension of the problem
            }
        }//end of the functions
    }
}//end class