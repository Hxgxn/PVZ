<<<<<<< HEAD
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullets here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullets extends Actor
{
    /**
     * Act - do whatever the Bullets wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int counter = 0;
    public void act() 
    {
        // Add your action code here.
    }
    public void moveBullet(int divisor, int stepsize){
        if (counter % divisor == 0){
            try{
                setLocation(getX() + stepsize, getY());
            } catch(Exception e){
                System.out.println("nö2");
            }
        }
        counter++;
    }
    public void checkCollision(){
        World w = (Garden)getWorld();
        Garden s = (Garden)getWorld();
        if (getOneIntersectingObject(Zombies.class) != null){
            s.removeObject(this);
        }
    }
    public void remove(int x){
        if (x >= 1390){
            getWorld().removeObject(this);
        }
    }
}
=======
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullets here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullets extends Actor
{
    /**
     * Act - do whatever the Bullets wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int counter = 0;
    public void act() 
    {
        // Add your action code here.
    }
    public void moveBullet(int divisor, int stepsize){
        if (counter % divisor == 0){
            try{
                setLocation(getX() + stepsize, getY());
            } catch(Exception e){
                System.out.println("nö2");
            }
        }
        counter++;
    }
    public void checkCollision(){
        World w = (Garden)getWorld();
        Garden s = (Garden)getWorld();
        if (getOneIntersectingObject(Zombies.class) != null){
            s.removeObject(this);
        }
    }
    public void remove(int x){
        if (x >= 1390){
            getWorld().removeObject(this);
        }
    }
}
>>>>>>> refs/remotes/origin/main
