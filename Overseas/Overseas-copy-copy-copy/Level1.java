// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class Level1 here.
 * @author (your name) @version (a version number or a date)
 */
public class Level1 extends Background
{

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Constructor for objects of class Level1.
     */
    public Level1()
    {
        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        End end =  new  End();
        addObject(end, 462, 101);
        MC mC =  new  MC();
        addObject(mC, 454, 471);
        Enemies enemies =  new  Enemies();
        addObject(enemies, 776, 51);
        Enemies enemies2 =  new  Enemies();
        addObject(enemies2, 55, 93);
        Enemies enemies3 =  new  Enemies();
        addObject(enemies3, 61, 396);
        Enemies enemies4 =  new  Enemies();
        addObject(enemies4, 763, 406);
        Enemies enemies5 =  new  Enemies();
        addObject(enemies5, 316, 60);
        Enemies enemies6 =  new  Enemies();
        addObject(enemies6, 616, 105);
        mC.setLocation(455, 393);
        enemies3.setLocation(59, 309);
        removeObject(enemies3);
        removeObject(enemies2);
        removeObject(enemies5);
        removeObject(enemies6);
        enemies4.setLocation(782, 316);
        removeObject(enemies4);
        removeObject(enemies);
        end.setLocation(828, 163);
        mC.setLocation(28, 176);
        end.setLocation(836, 180);
        mC.setLocation(18, 192);
        end.setLocation(833, 181);
        Enemies enemies7 =  new  Enemies();
        addObject(enemies7, 715, 190);
        Enemies enemies8 =  new  Enemies();
        addObject(enemies8, 796, 43);
        Enemies enemies9 =  new  Enemies();
        addObject(enemies9, 437, 282);
        Collect collect =  new  Collect();
        addObject(collect, 183, 171);
        Collect collect2 =  new  Collect();
        addObject(collect2, 186, 261);
        Collect collect3 =  new  Collect();
        addObject(collect3, 457, 147);
        Collect collect4 =  new  Collect();
        addObject(collect4, 467, 214);
        Collect collect5 =  new  Collect();
        addObject(collect5, 696, 272);
        Collect collect6 =  new  Collect();
        addObject(collect6, 679, 57);
        Collect collect7 =  new  Collect();
        addObject(collect7, 426, 37);
        Collect collect8 =  new  Collect();
        addObject(collect8, 158, 40);
    }

    /**
     * 
     */
    public void act()
    {
    }
}
