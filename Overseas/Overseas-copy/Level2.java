import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends Background
{

    /**
     * Constructor for objects of class Level2.
     * 
     */
    public Level2()
    {
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        MC mC = new MC();
        addObject(mC,20,214);
        End2 end2 = new End2();
        addObject(end2,793,227);
        removeObject(end2);
        End2 end22 = new End2();
        addObject(end22,836,167);
    }
}
