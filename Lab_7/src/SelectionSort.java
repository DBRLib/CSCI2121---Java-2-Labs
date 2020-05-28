import java.util.ArrayList;

/**
 * method to sort an ArrayList.
 * @author Deven Ronquillo
 * @version 3/27/17
 */
public class SelectionSort {

    /**
     * sorts an ArrayList.
     *
     * @param data ArrayList to sort.
     */

    public static <T extends Comparable<T>> void sort(ArrayList<T> data){

        sort(data, 0);
    }

    /**
     *
     * @param data ArrayList to sort
     * @param index Index to start at.
     * @param <T> Object type,
     */
    private static <T extends Comparable<T>> void sort(ArrayList<T> data, int index){

        if(index <(data.size() -1)){

            swap(data, index, findMinimum(data, index));
            sort(data,++index);
        }
    }

    /**
     *Swaps two items within an ArrayList.
     * @param data ArrayList
     * @param index1 index of item 1
     * @param index2 index of item 2
     * @param <T> Object type
     */
    private static <T extends Comparable<T>> void swap(ArrayList<T> data, int index1, int index2){

        T temp = data.get(index1);

        data.set(index1, data.get(index2));
        data.set(index2, temp);
    }

    /**
     *
     * @param data ArrayList.
     * @param index  index to start at.
     * @param <T> Object type.
     * @return index of minimum item.
     */
    private static <T extends Comparable<T>> int findMinimum(ArrayList<T> data, int index){

        int minimum = index;

        for(int i = index + 1; i < data.size(); i++){

            if(data.get(minimum).compareTo(data.get(i)) > 0 ){

                minimum = i;
            }
        }

        return minimum;
    }


}
