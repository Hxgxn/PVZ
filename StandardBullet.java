import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StandardBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class StandardBullet extends Bullets
{
    /**
     * Act - do whatever the StandardBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage StandardBullet = new GreenfootImage("StandardBullet.png");
    public StandardBullet(){
         StandardBullet.scale(50, 50);
         setImage(StandardBullet);
    }
    public void act() 
    {
        try {
            moveBullet(1, 10);
        } catch (Exception e) {
            System.out.println("Nö");
        }
        remove(getX());
    }
}
