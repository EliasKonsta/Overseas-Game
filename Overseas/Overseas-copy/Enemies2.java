import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Enemies2 extends Characters
{
    public int MCX = getX();
    public int MCY = getY();


    /**
     * Act - do whatever the Enemies2 wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(5);
        //// fIND THE mc
        // set mcx/y to its getx/y
        turnTowards(MCX, MCY);
    }
}
