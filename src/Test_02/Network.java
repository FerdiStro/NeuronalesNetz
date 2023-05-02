package Test_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Network {


    List<Neuron> neurons = Arrays.asList(
            new Neuron("INPUT_1"), new Neuron("INPUT_2"), new Neuron("INPUT_3"), /* input nodes */
            new Neuron("HID_1"), new Neuron("HID_2"), /* hidden nodes */
            new Neuron("OUT")); /* output node */




    public void train(Integer epochs,  List<Solution> solutions ){
        double bestEpoch  = neurons.get(0).getBestEpoch();
        Random  random   = new Random( );
        for(int epoch = 0 ;  epoch != epochs;  epoch ++ ){


            System.out.println("----------------------------------------------------------");
            int propertyNeuronMutate = random.nextInt(0, neurons.size());
            System.out.println("Epoch: " +  epoch);
            neurons.get(propertyNeuronMutate).mutate();
            List<Double> predicts =  new ArrayList<Double>();
            for(Solution solution : solutions){
                double predict = predict(solution.getInput1(), solution.getInput2());
                System.out.println("Prediction:  " +  predict);
                predicts.add(predict);
            }
            Double epochLoss = check(solutions, predicts);
            System.out.println("Epoch-Solution: " +  epochLoss);
            System.out.println("Best: "+  bestEpoch);
            if(bestEpoch <  epochLoss){
                bestEpoch = epochLoss;
                neurons.get(0).setBestEpoch(bestEpoch);
                neurons.get(propertyNeuronMutate).remember();
            }else{
                neurons.get(propertyNeuronMutate).forget();
            }

        }



    }



    public double predict(double input1, double input2){
        return neurons.get(5).work(
                neurons.get(4).work(

                        neurons.get(2).work(input1, input2),

                        neurons.get(1).work(input1, input2)
                ),
                neurons.get(3).work(

                        neurons.get(1).work(input1, input2),

                        neurons.get(0).work(input1, input2)

                )
        );
    }



    public void save(){
        for(Neuron  neuron  : neurons ){
            neuron.save();
        }

    }




    private Double check(List<Solution> solutions, List<Double> predictions){
        double sumSquare      = 0 ;


        for(int i  = 0 ;   i != solutions.size();  i ++ ){
            double correctAnswer = solutions.get(i).getSolution();

            double error   =  correctAnswer  -  predictions.get(i);


            sumSquare += (error * error );

        }
        return sumSquare  / solutions.size();
    }
}
