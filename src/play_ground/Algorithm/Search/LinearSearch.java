package play_ground.Algorithm.Search;

import java.util.List;
import java.util.Objects;

public class LinearSearch implements SearchAlg{
    @Override
    public Integer search(List<Integer> list, Integer searchFor){
        for(int i  = 0; i != list.size();  i++){
            if(Objects.equals(searchFor, list.get(i))){
                return i;
            }
        }
        return null;
    }
}
