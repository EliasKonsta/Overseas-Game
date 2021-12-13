import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class CreditWorld extends World
{

    /**
     * Constructor for objects of class CreditWorld.
     */
    public CreditWorld()
    {
        super(800, 500, 1);
        prepare();
    }
    
    private void prepare()
    {
        Back back = new Back();
        addObject(back,71,30);
    }
}
