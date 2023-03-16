package Test_02;

import Test_01.Util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Neuron {
    Random random  = new Random();
    private double weight1;
    private double weight2;
    private double bias;


    private double bestEpoch;

    double oldBias;
    double oldWeight1;
    double oldWeight2;

    String neuronName;


    public void save(){
        String fileName = "src/Test_02/src/" + neuronName + ".txt";
        String encoding = "UTF-8";
        try {
            PrintWriter printWriter = new PrintWriter(fileName, encoding);
            printWriter.write(weight1 + "\n");
            printWriter.write(weight2 + "\n");
            printWriter.write(bias+ "\n");
            printWriter.write(bestEpoch+ "\n");
            printWriter.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public Neuron(String name){
        this.neuronName  = name;
        StringBuilder stringBuilder   = new StringBuilder();
        try{
            File file = new File("src/Test_02/src/" + name + ".txt");
            BufferedReader bufferedReader  = new BufferedReader(new FileReader(file));
            String st;
            while ((st  = bufferedReader.readLine()) != null){
                stringBuilder.append(st  + "\n");
            }
            String[] raw = stringBuilder.toString().split("\n");
            weight1 =  Double.parseDouble(raw[0]);
            weight2 = Double.parseDouble(raw[1]);
            bias  =  Double.parseDouble(raw[2]);
            bestEpoch  = Double.parseDouble(raw[3]);
            oldBias = bias;
            oldWeight1 =  weight1;
            oldWeight2  = weight2;
        }catch (Exception e){
            reset();
            save();
        }
    }



    public void remember(){
        oldBias = bias;
        oldWeight1 = weight1;
        oldWeight2 = weight2;
//        System.out.println("Bias: " +  bias);
//        System.out.println("Weight-1: " +  weight1);
//        System.out.println("Weight-2: " +  weight2);
    }

    public void forget(){
        bias = oldBias;

        weight1 = oldWeight1;

        weight2 = oldWeight2;

//        System.out.println("Bias: " +  bias);
//        System.out.println("Weight-1: " +  weight1);
//        System.out.println("Weight-2: " +  weight2);
    }


    public void mutate(){
        int propertyToChange = random.nextInt(0, 3);

        double changeFactor = random.nextDouble(-1, 1);

        if (propertyToChange == 0){

            this.bias = changeFactor;

        } else if (propertyToChange == 1){

            this.weight1 = changeFactor;

        } else {

            this.weight2 = changeFactor;

        };
    }




    public void reset(){
        weight1  = random.nextDouble(-1, 1);
        weight2  = random.nextDouble(-1, 1);
        bias =  random.nextDouble(-1,1);


      oldBias = random.nextDouble(-1, 1);
      oldWeight1 = random.nextDouble(-1, 1);
      oldWeight2 = random.nextDouble(-1, 1);
    }



    public double work(double input1, double input2){
        double preActivation = (weight1 *  input1) + (weight2 *  input2) + this.bias;
        double output =  Util.sigmoid(preActivation);
        return output;
    }


    public double getBestEpoch() {
        return bestEpoch;
    }

    public void setBestEpoch(double bestEpoch) {
        this.bestEpoch = bestEpoch;
    }
}
