import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FreezeBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FreezeBullet extends Bullets
{
    /**
     * Act - do whatever the FreezeBullet wants to do. This method is called    whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage FreezeBullet = new GreenfootImage("FreezeBullet.png");
    public FreezeBullet(){
        FreezeBullet.scale(100, 100);
        setImage(FreezeBullet);
    }
    public void act() 
    {
        moveBullet(1, 10);
        remove(getX());
    }    
}
