import java.util.ArrayList;

/**
 * method t iterate through data in search of a specific item.
 * @author Deven Ronquillo
 * @version 3/27/2017.
 */
public class LinearSearch {

    /**
     * impliment the linear search algorithem to fine the speified object.
     *
     * @param data ArrayList to search through.
     * @param item object to look for within the ArrayList.
     */

    public static <T extends Comparable<T>> int linearSearch(ArrayList<T> data, T item){

        int itemIndex = -1;

        for(int i = 0; i < data.size(); i++){

            if(data.get(i).compareTo(item) == 0){

                itemIndex = i;
            }
        }

        return itemIndex;
    }


}
