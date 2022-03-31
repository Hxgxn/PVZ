import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FireBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FireBullet extends Bullets
{
<<<<<<< HEAD
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
=======
    private GreenfootImage FireBullet = new GreenfootImage("FireBullet.png");
    public FireBullet(){
        FireBullet.scale(50,50);
        setImage(FireBullet);
    }
    /**
     * Act - do whatever the FireBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
>>>>>>> refs/remotes/origin/main
    }    
}
