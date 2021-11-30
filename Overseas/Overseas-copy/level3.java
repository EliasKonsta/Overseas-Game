import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level3 extends Background
{

    /**
     * Constructor for objects of class level3.
     * 
     */
    public level3()
    {
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        End3 end3 = new End3();
        addObject(end3,841,243);
        end3.setLocation(835,259);
        MC mC = new MC();
        addObject(mC,17,263);
    }
}
