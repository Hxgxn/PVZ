import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FireBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FireBullet extends Bullets
{
    /**
     * !!! FEUERSTRAHL EINFÜGEN !!!
     * 
     */
    private GreenfootImage FireBullet = new GreenfootImage("FireBullet.png");
    public FireBullet(){
        FireBullet.scale(50, 50);
        setImage(FireBullet);
    }
    public void act() 
    {
        moveBullet(1, 10);
        remove(getX());
    }    
}
