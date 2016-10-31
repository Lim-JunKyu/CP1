import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lion2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lion2 extends Actor
{
     private int speed = 5;
    /**
     * Act - do whatever the Lion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
            int x = getX();
        int y = getY();
        
        if(Greenfoot.isKeyDown("up")){
            setRotation(0);
            y -= speed;
            
    }    
       if(Greenfoot.isKeyDown("down")){
            //setRotation(180);
            y += speed;
            
    }       if(Greenfoot.isKeyDown("left")){
            //setRotation(270);
            x -= speed;
            
    }       if(Greenfoot.isKeyDown("right")){
            //setRotation(90);
            x += speed;
            
    }    
    setLocation(x,y);
     
    }    
}
