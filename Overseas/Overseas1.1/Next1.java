import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Next1 extends Buttons
{
      public Next1()
      {
          GreenfootImage Next1 =  new  GreenfootImage(230, 60);
        Font adjustedFont =  new  Font(true, false, 21);
        Next1.setFont(adjustedFont);
        Next1.setColor(Color.GREEN);
        Next1.drawString("NEXT LEVEL", 0, 40);
        setImage(Next1);
      }
    public void act()
    {
        checkMouse();
        checkClick(new Level2());
    }
}
