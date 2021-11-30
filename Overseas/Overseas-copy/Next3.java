import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Next3 extends Buttons
{
    public Next3()
    {
        GreenfootImage Next3 =  new  GreenfootImage(230, 60);
        Font adjustedFont =  new  Font(true, false, 21);
        Next3.setFont(adjustedFont);
        Next3.setColor(Color.BLACK);
        Next3.drawString("NEXT LEVEL", 0, 40);
        setImage(Next3);
    }
    public void act()
    {
                checkMouse();
        checkClick(new level3());
    }
}
