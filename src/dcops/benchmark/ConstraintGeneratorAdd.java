/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dcops.benchmark;

/**
 *
 * @author yaneliamecaalducin
 */

import java.io.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;//
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Random;
import java.util.Scanner;
//We create a new class because we are modified the originalConstraintGenerator 
public class ConstraintGeneratorAdd {
    public static String fileName;    
    public static int []randFreq;
    int changesParam; int dimensionParam; int runsParam; int constraintParam; int lowerParam; int upperParam; int functionParam[]; int algorithmParam[]; int frequencyParam; int freqDistParam; int accuracyParam[];
    
    
    public static int[] freqPerm(int[] frequency, int numChange) {
        int []ret = new int[numChange];
        for (int i = 0; i < numChange; i++) {
            ret[i] = frequency[(int)(Math.random()*3)];
            // System.out.println(ret[i]);
        }
        return ret;
    }
    
    public static int[] freqGen(int frequency, int numChange){
        Random r=new Random ();
        int []ret = new int [numChange];
        for (int i = 0; i < numChange; i++) {
            int f = (int)(r.nextGaussian()*30+frequency);
            ret[i] = f;
        }
        return ret;
    }
    
public static void printFile(String name, double [][] matrix, int funciones, int ejecuciones ) {
        String route = name + ".csv";
        File f;
        f = new File(route);
        try {
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            for (int i = 0; i < funciones; i++) {//por función 
                for(int j =0;j<ejecuciones; j++ ){
                    if(j!=ejecuciones-1){
                    pw.append(matrix[i][j] + ", ");
                    }
                    else{
                    pw.append(matrix[i][j] + ", ");                        
                    }
                }
                pw.append("\n");

            }
            pw.close();
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(ConstraintGeneratorAdd.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

public static void printFileFXs(String name, List<List<Double>> listFXs, int runs) {
        String route = name + ".csv";
        File f;
        int iterations;
        f = new File(route);
        try {
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            for (int i = 0; i < runs; i++) {//por función 
                iterations=listFXs.get(i).size();
                for(int j =0;j<iterations ; j++ ){
                    if(j!=iterations-1){
                    pw.append(listFXs.get(i).get(j)+ ", ");
                    }
                    else{
                    pw.append(listFXs.get(i).get(j)+ ", ");                        
                    }
                }
                pw.append("\n");
            }
            pw.close();
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(ConstraintGeneratorAdd.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }    

    public static int [] readFileParam(String fileName){
        fileName = fileName + ".txt";
        int paramsFile[]= new int[2];
        try {
            //Initialise IO capabilities
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            //Skipping the first lines
            int i=0;
            for (int m = 0; m < 5; m++) {
                String lineIter,subString;
                lineIter=bufferedReader.readLine();  
                if(m==1||m==3){  
                  System.out.println("lineIter  "+lineIter+" size "+lineIter.length() );
                int iend = lineIter.indexOf(":");
                subString= lineIter.substring(iend+2,lineIter.length());
                  System.out.println("subString "+subString+" size "+subString.length()+ " iend "+iend);
                paramsFile[i]=Integer.valueOf(subString);
                i++;
              }
            }
    
            
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");  
        } catch (IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");   
        }
            return paramsFile;
    
    }


    public static double[][] readFile(String fileName, int numChange, int numVars){
        String lineIter [] = new String[numChange+1];
        char lineDouble [] = new char[8];
        char lineDoubA [] = new char[5];
        fileName = fileName + ".txt";
        double [][] collection = new double[numChange][numVars+1];
        try {
            //Initialise IO capabilities
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            //Skipping the first lines
            for (int m = 0; m < 5; m++) {
              bufferedReader.readLine();  
            }
    
            int i = 0;
            
                while((lineIter[i] = bufferedReader.readLine()) != null) {
                    char lineParse[] = lineIter[i].toCharArray();
                    
                    //Parse b values
                    for (int j = 6; j < 14; j++) {
                            lineDouble[j - 6] = lineParse[j];
                    }
                    
                    lineIter[i] = new String(lineDouble);
                    collection[i][0] = Double.parseDouble(lineIter[i]);
                    
                    //Parse all the a values using general formula
                    for (int j = 0; j < numVars; j++) {
                        for (int k = 17 + 6*j; k < 22 + 6*j; k++) {
                            lineDoubA[k - (17 + 6*j)] = lineParse[k];
                        }
                        lineIter[i] = new String(lineDoubA);
                        collection[i][j+1] = Double.parseDouble(lineIter[i]);
                    }
                    
                    if (i < 199){
                        i++;
                    }  
                }
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");  
        } catch (IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");   
        }
        return collection;
    }
    public static double[][] readFileCsvFs(String fileName, int runs, int numChange){
        double [][] vector = new double[runs][numChange];
        int i=0;
        try {
            //Initialise IO capabilities
            Scanner scanner = new Scanner(new File(fileName));
            scanner.useDelimiter(",");
             for (int j = 0; j < runs; j++) {
                String str = scanner.nextLine();
                String array []=str.split(",");
//                for (int k = 0; k < numChange; k++) {
                 for (int k = 0; k < array.length -1; k++) {
//                    if(array[k].equals(" "))
//                    {
//                        int test =0;
//                    }
//                    else{
                        vector[j][k]=Double.valueOf(array[k]);
//                 }
//                    System.out.println(array[k]);
                 }  
                
            }
        scanner.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");  
        } catch (IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");   
        }
        return vector;
    }
    
    public static double[] readFileCsv(String fileName, int numChange){
        double [] vector = new double[numChange];
        int i=0;
        try {
            //Initialise IO capabilities
            Scanner scanner = new Scanner(new File(fileName));
             scanner.useDelimiter(",");
        while(scanner.hasNext()&&i<numChange){
            vector[i]= Double.valueOf(scanner.next());
//            System.out.println("vector[i]" + vector[i]);
            i++;    
        }
        scanner.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");  
        } catch (IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");   
        }
        return vector;
    }
    
    public static void printCSV(String name, double [] b, int times) {
        String route = name + ".csv";
        File c;
        c = new File(route);
        try {
            FileWriter cw = new FileWriter(c);
            BufferedWriter bcw = new BufferedWriter(cw);
            PrintWriter cpw = new PrintWriter(bcw);
            DecimalFormat dec = new DecimalFormat("#000.000");
            for (int i = 0; i < times; i++) {
                cpw.append(dec.format(b[i]));
                if (i != times-1) {
                    cpw.append(",");
                }
            }
            cpw.append("\n");
            cpw.close();
            cw.close();
        } catch (IOException ex) {
            Logger.getLogger(ConstraintGeneratorAdd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void printFile(String name, double [] b, double [][] a, int times, int vars, double lk,  double uk) {
        String route = name + ".txt";
        File f;
        f = new File(route);
        try {
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.append("Problem name: "+name +"\n");
            pw.append("Number of times: "+times +"\n");
            pw.append("Lower value of k: "+lk + "  Upper value of k: "+uk+"\n");
            pw.append("Dimension: "+vars +"\n");
            pw.append("Times    b       a \n");
            DecimalFormat dec = new DecimalFormat("#000.000");
            DecimalFormat deca = new DecimalFormat("#0.000");
            for (int i = 0; i < times; i++) {//por función 
                if (i < 9){
                    pw.append((i+1) + "     ");
                } else if (i > 8 && i < 99) {
                    pw.append((i+1) + "    ");                    
                } else if (i > 98) {
                    pw.append((i+1) + "   ");
                }
                if (b[i] >= 0) {
                    pw.append(" ");
                }
                pw.append(dec.format(b[i])+"   ");
                for (int j = 0; j < vars; j++) {
                    
                    pw.append(deca.format(a[i][j]));
                    if (j != vars-1) {
                        pw.append(",");
                    }
                }
                pw.append("\n"); 
            }
            pw.close();
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(ConstraintGeneratorAdd.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }    
    
    public static double [] generatedB(double b0, double a[][], int numChange, double lk, double uk, double minpos, double maxpos, boolean exp3[]){
        double [] b=new double[numChange];
        fileName = "ConstraintSet";
        double lbound = 0;
        double ubound = 0;
        double low = 0;
        double high = 0;
        b[0]=b0;
        for (int i = 1; i < numChange; i++) {                
            if (exp3[i] == true) {    
                lbound = Math.abs((b[i-1] - minpos) / minpos);//ABS not needed but keeps common formula between the two
                ubound = Math.abs((b[i-1] - maxpos) / maxpos);
                low = lk * lbound;
                high = uk* ubound;
                b[i] = b[i-1]+ (Math.random() * (high - low) + low); //Math.random() * (uk -lk) + lk;  
            } else {
                b[i] = b[i-1];
            }
        }
        return b;
    }
    
    public static double[] swapEle(double[] arr, int a, int b){
        double temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return arr;
    }
    public static double getaverage(List<List<Double>>ListMError){
            double average =0;
            for (int i = 0; i < ListMError.size(); i++) {
                for (int j = 0; j < ListMError.get(i).size(); j++) {
                    System.out.print(ListMError.get(i).get(j)+", ");
                    average=ListMError.get(i).get(j)+average;
                }
        }
            average=average/(double)ListMError.size();
            
        return average;
    }
public static double getstd(List<List<Double>>ListMError){
    double std=0, sum=0;
        double xmean =getaverage(ListMError);
        for (int i = 0; i < ListMError.size(); i++) {
                for (int j = 0; j < ListMError.get(i).size(); j++) {
                    
                    sum=sum+Math.pow(ListMError.get(i).get(j)-xmean, 2);
                }        
    }
        System.out.println("Size std "+ListMError.size());
        std=Math.sqrt(sum/(double)ListMError.size());
    return std;
}    

    public static void main(int changesParam, int dimensionParam,  int constraintParam, double lkParam, double ukParam,
            double lowerParam, double upperParam, double b0Param) {//b0=0, uk and lk=15
        double b0=b0Param;
        double lk=lkParam, uk=ukParam; 
        System.out.println("==================");
        System.out.println("changesParam "+changesParam );
        System.out.println("==================");
        
        int numChange = changesParam;
        int numVars = dimensionParam;
        double minpos = lowerParam, maxpos = upperParam;
       
        boolean exp3[] = new boolean[numChange];
        double alt = 0;
        for (int i = 0; i < numChange; i++) {
            alt = Math.random();
            if (alt < 0.5) {
                exp3[i] = false;
            } else {
                exp3[i] = true;
            }
        }
          
        ArrayList numbers = new ArrayList();
        for(int k = 0; k < numVars; k++)
        numbers.add(k);
        Collections.shuffle(numbers);
        //int frequency = 0;//frequencyParam;
        double [][] a = new double[numChange][numVars];
        double sum = 0;
        for (int j = 0; j < numVars; j++) {
            a[0][j] =  Math.random();
            sum+= Math.pow(a[0][j],2);
        }
        sum = Math.sqrt(sum);
        for (int j = 0; j < numVars; j++) {
            a[0][j] = a[0][j]/sum;
        }
        sum = 0;
        for (int j = 0; j < numVars; j++) {
            sum+= Math.pow(a[0][j],2);
        }
        sum = Math.sqrt(sum);
        for (int i = 1; i < numChange; i++) {
            Collections.shuffle(numbers);
            for (int j = 0; j < numVars; j++) {
                a[i][j] =a[i-1][j];
            }

            if (exp3[i] == false){
                for (int k = 0; k < (int)numVars/4; k++){
                    a[i] = swapEle(a[i], (int)numbers.get(k),(int)numbers.get(numVars-k-1));
                }
            }
            //Normalise
            sum = 0;
            for (int k = 0; k < numVars; k++) {
                sum+= Math.pow(a[i][k],2);
            }
            sum = Math.sqrt(sum);
            for (int k = 0; k < numVars; k++) {
                a[i][k] = a[i][k]/sum;
            }
            
        }
        double [] b=generatedB(b0, a, numChange, lk, uk, minpos, maxpos, exp3);
        printFile(fileName, b, a, numChange, numVars, lk, uk);
        printCSV(fileName, b, numChange);
        //This function is for generate Random Frequencies of the change, just it needs to be writed in a file
        //randFreq = freqGen(frequency, numChange);  
        System.out.println("Constraints Generated");
    }
}