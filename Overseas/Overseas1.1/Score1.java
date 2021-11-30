// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Score1 extends Level1
{

    /**
     * Constructor for objects of class Score1.
     */
    public Score1()
    {
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Complete complete =  new  Complete();
        addObject(complete, 427, 244);
        Score score =  new  Score();
        addObject(score, 433, 320);
        Next1 next1 =  new  Next1();
        addObject(next1, 790, 495);
        next1.setLocation(809, 500);
        Greenfoot.stop();
    }
}
