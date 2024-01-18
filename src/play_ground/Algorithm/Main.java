package play_ground.Algorithm;

import play_ground.Algorithm.Search.BinarySearch;
import play_ground.Algorithm.Search.LinearSearch;
import play_ground.Algorithm.Search.SearchAlg;
import play_ground.Algorithm.Sort.BubbleSort;
import play_ground.Algorithm.Sort.SortAlg;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Integer> list  =  new ArrayList<>();
        list.add(1);
        list.add(2300);
        list.add(-2);
        list.add(40);


        SortAlg sortAlg =  new BubbleSort();
        list = sortAlg.sort(list);

        //printList
        for(int i  : list){
            System.out.println(i);
        }

        System.out.println("_________________");


        SearchAlg linerSearch  = new LinearSearch();
        int searchFor = 1;
        Integer place = linerSearch.search(list, searchFor);

        System.out.println(searchFor + " is: " +  place);

        SearchAlg binarySearch =  new BinarySearch();
        place = binarySearch.search(list, searchFor);

        System.out.println(searchFor + " is: " +  place);


    }

}
