import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructions extends Buttons
{
   public Instructions()
    {
        GreenfootImage myTitle = new GreenfootImage(230,60);
        Font adjustedFont = new Font(true, false,40);
        myTitle.setFont(adjustedFont);
        myTitle.setColor(Color.BLACK);
        myTitle.drawString("Instructions",0,50);
        setImage(myTitle);
    }
    
    public void act()
    {
        checkMouse();
        checkClick(new InstructorWorld());
    }
}
