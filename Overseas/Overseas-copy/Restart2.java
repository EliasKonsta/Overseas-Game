import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Restart2 extends Buttons
{

    public Restart2()
    {
        GreenfootImage Restart2 =  new  GreenfootImage(230, 60);
        Font adjustedFont =  new  Font(true, false, 21);
        Restart2.setFont(adjustedFont);
        Restart2.setColor(Color.BLACK);
        Restart2.drawString("RESTART", 0, 40);
        setImage(Restart2);
    }
    public void act()
    {
        checkMouse();
        checkClick(new Level2());
    }
}
