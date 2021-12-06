import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Back extends Buttons
{
    public Back()
    {
        GreenfootImage Back = new GreenfootImage(130,60);
        Font adjustedFont = new Font(true, false,20);
        Back.setFont(adjustedFont);
        Back.setColor(Color.BLACK);
        Back.drawString("BACK",0,30);
        setImage(Back);
    }
    public void act()
    {
        checkMouse();
        checkClick(new TitleScreen());
    }
}
