package play_ground.Algorithm.Sort;

import java.util.List;

public class BubbleSort implements SortAlg{

    public List<Integer> sort(List<Integer> list){
        int temp = 0;

        for(int i = 0  ; i !=  list.size(); i ++ ){
            for(int j  = 1; j != list.size()-i; j++){
                if(list.get(j-1) > list.get(j) ){
                    temp =  list.get(j-1);
                    list.set(j-1,  list.get(j));
                    list.set(j, temp);
                }
            }
        }
        return list;
    }




}
