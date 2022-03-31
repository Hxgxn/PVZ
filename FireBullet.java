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

    private int counter;
    public FireBullet(){
        FireBullet.scale(50, 50);
        setImage(FireBullet);
        counter = 0;
    }
    public void act() 
    {
        moveBullet(1, 10);

        removeBullet();
    }
    public void removeBullet(){
        counter = counter + 1;
        if (counter >= 25){
            getWorld().removeObject(this);
        }
    }    
}
