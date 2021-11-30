import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Score extends Buttons
{
    public Score()
    {
        GreenfootImage Score = new GreenfootImage(230,60);
        Font adjustedFont = new Font(true, false,30);
        Score.setFont(adjustedFont);
        Score.setColor(Color.BLACK);
        Score.drawString("Score: 500",0,50);
        setImage(Score);
    }
    public void act()
    {
    }
}
