// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * import java.util.List;
 */
public class End extends Characters
{

    /**
     * Act - do whatever the End wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (isTouching(MC.class)) {
            Greenfoot.playSound("win sound 1.wav");
            Greenfoot.setWorld( new  Score1());
            Greenfoot.stop();
        }
    }
}
