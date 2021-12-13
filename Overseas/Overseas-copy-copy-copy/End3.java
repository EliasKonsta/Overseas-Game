// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class End3 extends Characters
{

    /**
     * Act - do whatever the End3 wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (isTouching(MC.class)) {
            Greenfoot.playSound("win sound 1.wav");
            getWorld().showText("GAME COMPLETED", 429, 161);
            Greenfoot.setWorld( new  Score3());
            Greenfoot.stop();
        }
    }
}
