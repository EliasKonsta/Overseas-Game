import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Complete extends Buttons
{
    public Complete()
    {
        GreenfootImage Complete = new GreenfootImage(230,60);
        Font adjustedFont = new Font(true, false,21);
        Complete.setFont(adjustedFont);
        Complete.setColor(Color.YELLOW);
        Complete.drawString("LEVEL 1 COMPLETED",0,40);
        setImage(Complete);
    }
    public void act()
    {
    }
}
