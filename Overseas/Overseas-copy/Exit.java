import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Exit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Exit extends Buttons
{
   public Exit()
    {
        GreenfootImage myTitle = new GreenfootImage(150,60);
        Font adjustedFont = new Font(true, false,30);
        myTitle.setFont(adjustedFont);
        myTitle.setColor(Color.BLACK);
        myTitle.drawString("Credits",0,50);
        setImage(myTitle);
    }
    
    public void act()
    {
        checkMouse();
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.stop();
        }
    }
}
