import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{
    


    public TitleScreen()
    {
        super(858, 536, 1, false);
        prepare();
    }
    
    private void prepare()
    {
        GreenfootImage logo = new GreenfootImage("Overseas-logo.jpg");
        Picture logoPic = new Picture(logo);
        addObject(logoPic,getWidth()/2,150);
        Play play = new Play();
        addObject(play,410,389);
        play.setLocation(426,404);
        Instructions instructions = new Instructions();
        addObject(instructions,99,481);
        instructions.setLocation(485,444);
        play.setLocation(434,385);
        instructions.setLocation(476,439);
        instructions.setLocation(517,444);
        instructions.setLocation(440,458);
        instructions.setLocation(464,438);
        Exit exit = new Exit();
        addObject(exit,407,494);
        exit.setLocation(830,519);
        instructions.setLocation(182,517);
        play.setLocation(425,402);
        instructions.setLocation(265,516);
        exit.setLocation(807,495);
        instructions.setLocation(133,496);
    }

}
