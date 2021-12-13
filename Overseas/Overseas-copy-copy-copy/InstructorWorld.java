import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InstructorWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InstructorWorld extends World
{

    /**
     * Constructor for objects of class InstructorWorld.
     * 
     */
    public InstructorWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(382, 400, 1);
        GreenfootImage logo = new GreenfootImage("Overseas-logo.png");
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Back back = new Back();
        addObject(back,71,30);
    }
}
