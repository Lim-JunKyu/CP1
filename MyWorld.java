import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{


  
    
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(960, 540, 1);
        int a = 1+(int)(Math.random()*960); 
        int b = 1+(int)(Math.random()*540);
        addObject(new ball1(), 400,200);
        addObject(new lion2(), 600,100);//볼등록
        addObject(new item(), a,b);
  


       
       
       
    }
}

