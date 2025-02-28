import java.util.ArrayList;
import java.util.Collections;

public class QuickSort {

    private static final ArrayList<Integer> sortedArray = new ArrayList<>();

    public static ArrayList<Integer> quickSort(ArrayList<Integer> array) {
        if (array.isEmpty()) return sortedArray;
        else {
            int min = Collections.min(array);
            sortedArray.add(min);
            array.remove(Integer.valueOf(min));
            return quickSort(array);
        }
    }
}

//quicksort([1,3,2,4])                      return 1,2,3,4]
    //quicksort([3,2,4])                return [1,2,3]
        //quicksort([3,4])          return [1,2]
            //quicksort([4])    return [1]