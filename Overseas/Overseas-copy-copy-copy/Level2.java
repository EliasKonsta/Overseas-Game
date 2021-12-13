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
        Enemies enemies = new Enemies();
        addObject(enemies,733,264);
        Enemies enemies2 = new Enemies();
        addObject(enemies2,725,72);
        Enemies enemies3 = new Enemies();
        addObject(enemies3,566,168);
        removeObject(enemies3);
        addObject(enemies3,553,113);
        Enemies enemies4 = new Enemies();
        addObject(enemies4,547,226);
        mC.setLocation(17,199);
        mC.setLocation(18,179);
    }
}
