package Test_02;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {




    private static final double ONE_PERSON = 1.00;
    private static final double TWO_PERSON = 2.00;



    private static final double GO_OUT = 1.0;
    private static final double CHILL  = 0.0;


//    private static final double MOOD_MIDDLE =  5.00;

    private static double moodActive(){
        Random  random   = new Random( );
        return random.nextDouble(8, 12);
    }
    private static double moodChilli(){
        Random  random   = new Random( );
        return random.nextDouble(0, 2);
    }



    public static void main(String[] args) {


        List<Solution> solutions  = Arrays.asList(
                new Solution(GO_OUT, TWO_PERSON, moodActive()),
                new Solution(GO_OUT, TWO_PERSON, moodActive()),
                new Solution(GO_OUT, TWO_PERSON, moodActive()),
//                new Solution(GO_OUT, TWO_PERSON, MOOD_MIDDLE),
                new Solution(CHILL, TWO_PERSON, moodChilli()),
                new Solution(CHILL, TWO_PERSON, moodChilli()),
                new Solution(CHILL, TWO_PERSON, moodChilli()),
//                new Solution(CHILL, ONE_PERSON, MOOD_MIDDLE),
                new Solution(CHILL, ONE_PERSON, moodChilli()),
                new Solution(GO_OUT, ONE_PERSON, moodActive())
        );

        Network network  =  new Network();
        network.train(1000000,  solutions);
        network.save();

        //CHILL 0.0
        double predict1 = network.predict(TWO_PERSON, 0);
        //CHILL 0.0
        double predict2 = network.predict(ONE_PERSON, 1);
        //GO OUT 1.0
        double predict3 = network.predict(ONE_PERSON, 10.0);
        //GO OUT 1.0
        double predict4 = network.predict(TWO_PERSON, 9.5);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Solution: 0.00" );
        System.out.println(predict1);
        System.out.println();
        System.out.println("Solution: 0.00" );
        System.out.println(predict2);
        System.out.println();
        System.out.println("Solution: 1.00" );
        System.out.println(predict2);
        System.out.println();
        System.out.println("Solution: 1.00" );
        System.out.println(predict3);



        /*
        Input


        Anzahl: float
        Mood: float    0.00  - 10.00







         */


        /*
        Training ()

        for ( x )






         */







    }


}
