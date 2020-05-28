/**
 * @author Deven Ronquillo
 * @version 4/17/2017.
 */
public class Geist {

    private Ghost newGhost;

    public Geist(String name){

        this.newGhost = new Ghost(name);
    }

    public void herumgeistrum(){

        newGhost.haunt();
    }

    public void erschrecken(){

        newGhost.scare();
    }
}
