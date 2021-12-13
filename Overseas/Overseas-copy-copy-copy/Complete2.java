import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Complete2 extends Buttons
{
    public Complete2()
    {
        GreenfootImage Complete = new GreenfootImage(230,60);
        Font adjustedFont = new Font(true, false,21);
        Complete.setFont(adjustedFont);
        Complete.setColor(Color.WHITE);
        Complete.drawString("LEVEL 2 COMPLETED",0,40);
        setImage(Complete);
    }
    public void act()
    {
    }
}
