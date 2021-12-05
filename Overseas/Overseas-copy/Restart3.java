import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Restart3 extends Buttons
{

    public Restart3()
    {
        GreenfootImage Restart3 =  new  GreenfootImage(230, 60);
        Font adjustedFont =  new  Font(true, false, 21);
        Restart3.setFont(adjustedFont);
        Restart3.setColor(Color.BLACK);
        Restart3.drawString("RESTART", 0, 40);
        setImage(Restart3);
    }    
    public void act()
    {
        checkMouse();
        checkClick(new level3());
    }
}
