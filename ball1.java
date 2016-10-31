import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ball1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ball1 extends Actor
{
    private int speed = 1000;
    /**
     * Act - do whatever the ball1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public void Actor()
     {
          int x = getX();
        int y = getY();
        move(40);
        if (Greenfoot.getRandomNumber(100)<10)
        {
            turn(Greenfoot.getRandomNumber(90)-45);
        }
        if(x<=5 || x>=getWorld().getHeight()-5){
            turn(180);
        }
        if(y<=5||y>=getWorld().getHeight()-5)
        {
            turn(180);
        }
        setLocation(x,y);
     }
}

