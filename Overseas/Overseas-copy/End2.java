// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class End2 extends Characters
{

    /**
     * Act - do whatever the End2 wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (isTouching(MC.class)) {
            getWorld().showText("LEVEL 1 COMPLETED", 526, 268);
            Greenfoot.setWorld( new level3());
        }
    }
}