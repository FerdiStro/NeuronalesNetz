package Test_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {




        List<List<Integer>> data = new ArrayList<List<Integer>>();
        data.add(Arrays.asList(115, 66));
        data.add(Arrays.asList(175, 78));
        data.add(Arrays.asList(205, 72));
        data.add(Arrays.asList(120, 67));
        List<Double> answers = Arrays.asList(1.0,0.0,0.0,1.0);
        Network network = new Network();
        network.train(data, answers);

        System.out.println("");

        System.out.println( network.predict(167, 73));

        System.out.println( network.predict(105, 67));

        System.out.println(network.predict(120, 72));

        System.out.println( network.predict(143, 67));

        System.out.println( network.predict(130, 66));


    }
}
