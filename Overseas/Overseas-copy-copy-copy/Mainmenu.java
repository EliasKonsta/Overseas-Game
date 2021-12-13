import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Mainmenu extends Buttons
{

    public Mainmenu()
    {
        GreenfootImage Mainmenu = new GreenfootImage(230,60);
        Font adjustedFont = new Font(true, false,21);
        Mainmenu.setFont(adjustedFont);
        Mainmenu.setColor(Color.WHITE);
        Mainmenu.drawString("MAIN MENU",0,40);
        setImage(Mainmenu);
    }
    public void act()
    {
        checkMouse();
        checkClick(new TitleScreen());
    }
}
