import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Explosion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Explosion extends Mine
{
    /**
     * Act - do whatever the Explosion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage explosion = new GreenfootImage("Explosion-removebg-preview.png");
    private int counter;
    public Explosion(){
        explosion.scale(100, 100);
        setImage(explosion);
        counter = 0;
    }
    public void act() 
    {
        counter = counter + 1;
        if (counter == 20){
            getWorld().removeObject(this);
        }
    }    
}
