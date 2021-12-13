// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class MC here. @author (your name) @version (a version number or a date)
 */
public class MC extends Characters
{
    private int counter = 0;
    private int vSpeed = 0;
    private int acceleration = 2;
    private int speed = 2;
    private GreenfootImage image1;
    private GreenfootImage image2;
    private GreenfootImage image3;
    private GreenfootImage image4;

    /**
     * 
     */
    public MC()
    {
        image1 =  new  GreenfootImage("piratr1.png");
        image2 =  new  GreenfootImage("piratr2.png");
        image3 =  new  GreenfootImage("piratr3.png");
        image4 =  new  GreenfootImage("piratr4.png");
        setImage(image1);
    }

    /**
     * Act - do whatever the MC wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkKey();
        if (isTouching(Collect.class)) {
            removeTouching(Collect.class);
            counter = counter + 10;
            getWorld().showText("score: " + counter, 429, 260);
        }
    }

    /**
     * 
     */
    public void checkKey()
    {
        if (Greenfoot.isKeyDown("up")) {
            setRotation(270);
            move(2);
        }
        if (Greenfoot.isKeyDown("left")) {
            setRotation(180);
            move(3);
        }
        if (Greenfoot.isKeyDown("right")) {
            setRotation(360);
            move(3);
        }
        if (Greenfoot.isKeyDown("down")) {
            setRotation(90);
            move(2);
        }
        switchImage();
    }

    /**
     * 
     */
    public void moveRight()
    {
        setLocation(getX() + speed, getY());
    }

    /**
     * 
     */
    public void switchImage()
    {
        if (getImage() == image1) {
            setImage(image2);
        }
        else {
            setImage(image3);
        }
        if (getImage() == image2) {
            setImage(image3);
        }
        else {
            setImage(image4);
        }
        if (getImage() == image3) {
            setImage(image4);
        }
        else {
            setImage(image1);
            return;
        }
        if (getImage() == image4) {
            setImage(image4);
        }
        else {
            setImage(image1);
        }
    }
}
