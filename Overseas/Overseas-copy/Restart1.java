import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Restart1 extends Buttons
{
    public Restart1()
    {
        GreenfootImage Restart1 =  new  GreenfootImage(230, 60);
        Font adjustedFont =  new  Font(true, false, 21);
        Restart1.setFont(adjustedFont);
        Restart1.setColor(Color.BLACK);
        Restart1.drawString("RESTART", 0, 40);
        setImage(Restart1);
    }
    public void act()
    {
        checkMouse();
        checkClick(new Level1());
    }
}
