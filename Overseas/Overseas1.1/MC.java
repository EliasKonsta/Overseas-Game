// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class MC here.
 * @author (your name) @version (a version number or a date)
 */
public class MC extends Characters
{

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Act - do whatever the MC wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        /* Add your action code here.*/
        if (Greenfoot.isKeyDown("up")) {
            setRotation(270);
            move(2);
        }
        if (Greenfoot.isKeyDown("left")) {
            setRotation(180);
            move(2);
        }
        if (Greenfoot.isKeyDown("right")) {
            setRotation(360);
            move(2);
        }
        if (Greenfoot.isKeyDown("down")) {
            setRotation(90);
            move(2);
        }
    }
}
