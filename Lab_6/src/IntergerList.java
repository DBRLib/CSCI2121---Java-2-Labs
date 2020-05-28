import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @author Deven Ronquillo
 * @version 3/13/2017.
 */
public class IntergerList {

    public static void main(String[] args){

        Integer[] aryInt = new Integer[]{7 ,8, 12, 24, 32, 4, 1};
        LinkedList<Integer> listInt = new LinkedList<Integer>(Arrays.asList(aryInt));

        System.out.println("Original array: " + listInt);
        System.out.println("--iteration 1--");

        for(int i = 0; i < listInt.size(); i++){

            if(listInt.get(i) % 2 == 0){

                listInt.remove(i);
                i--;

                System.out.println("removed even number.");
            }
            else {

                System.out.println(listInt.get(i));
            }
        }

        /*
        Using while since iterator will iterate through for us and provides methods to dictate the end of a list.

        since iterator advances for us we don't need to have a counter to monitor our current position.

         */
        System.out.println("--iteration 2--");

        listInt = new LinkedList<Integer>(Arrays.asList(aryInt));

        ListIterator<Integer> listItor = listInt.listIterator(0);

        while(listItor.hasNext()){

            int tempInt = listItor.next();

            if(tempInt % 2 == 0){

                listItor.remove();
                System.out.println("Removed even number.");
            }
            else{

                System.out.println(tempInt);
            }
        }
        /*
        the advanced for loop is efectively a iterator and because of this it wont let you modify the data it is set to
        run through.

        this prevents two objects from having the potential to change the data causing a concurrency error
         */

        System.out.println("--iteration 3--");

        listInt = new LinkedList<Integer>(Arrays.asList(aryInt));

        for(Integer intObj : listInt){

            if(intObj % 2 == 0){

                listInt.remove(intObj);
                System.out.println("removed even number.");
            }
            else{

                System.out.println(intObj);
            }
        }
    }
}


