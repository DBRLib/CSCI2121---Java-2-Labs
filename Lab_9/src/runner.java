/**
 * test the classes THeOneRing and Geist.
 *
 * @author Deven Ronquillo
 * @version  4/17/2017.
 */
public class runner{

    public static void main(String[] args){

        TheOneRing LoTR = TheOneRing.getInstance();
        LoTR.castIntoTheFire();

        TheOneRing LoTR2 = TheOneRing.getInstance();
        System.out.println(LoTR.equals(LoTR2));
        System.out.println();

        Geist newGeist = new Geist();

        newGeist.herumgeistrum();
        newGeist.erschrecken();
    }
}
