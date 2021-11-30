import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends Background
{

    /**
     * Constructor for objects of class Level1.
     * 
     */
    public Level1()
    {
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        End end = new End();
        addObject(end,462,101);
        MC mC = new MC();
        addObject(mC,454,471);
    }
}
