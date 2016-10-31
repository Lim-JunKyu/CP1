import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Text here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Text extends Actor
{
    int score=0;
    public void act()
    {
        setImage(new GreenfootImage("Score : " + score, 24, Color.black, Color.GREEN));
    } 
    public void scoreup(){
        score++;
    }

}