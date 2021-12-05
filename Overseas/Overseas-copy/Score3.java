// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Score3 extends level3
{

    /**
     * Constructor for objects of class Score3.
     */
    public Score3()
    {
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Restart3 restart3 =  new  Restart3();
        addObject(restart3, 191, 270);
        restart3.setLocation(214, 268);
        Greenfoot.stop();
        Mainmenu mainmenu =  new  Mainmenu();
        addObject(mainmenu, 560, 269);
        mainmenu.setLocation(751, 272);
        Complete3 complete3 =  new  Complete3();
        addObject(complete3, 422, 138);
        complete3.setLocation(477, 120);
        complete3.setLocation(491, 131);
        complete3.setLocation(319, 129);
        complete3.setLocation(361, 121);
        complete3.setLocation(432, 121);
        complete3.setLocation(443, 169);
    }
}
