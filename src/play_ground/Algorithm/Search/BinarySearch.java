package play_ground.Algorithm.Search;

import java.util.List;

public class BinarySearch implements SearchAlg {
    @Override
    public Integer search(List<Integer> list, Integer searchFor) {



        int low = 0;
        int high = list.size();

        while(low <= high){
            int mid = (high + low) / 2;

            if (list.get(mid) < searchFor) {
                low = mid +1;
            } else if (list.get(mid) > searchFor) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return null;
    }
}
