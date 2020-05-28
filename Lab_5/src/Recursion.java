/**
 * impliments facorial via tail recursion to remove he limit a stack overflow imposes.
 *
 * @author Deven Ronquillo
 * @version 3/6/2017
 */
public class Recursion{

    /**
     *
     * @param n a positive number, includes 0.
     * @return the factorial of the given number.
     */
    public static int tailFactorial(int n){

        return tailFactorial(n, 1);
    }//end tailFactorial

    /**
     *
     * @param n a positive number, includes 0.
     * @param product a positive total.
     * @return the current total of the factorial operation.
     */
    private static int tailFactorial(int n, int product){

        if(n == 0){

            return product;
        }
        else{

            product *= n;

            return tailFactorial(n-1, product);
        }




    }//end tailFactorial
}//end class
