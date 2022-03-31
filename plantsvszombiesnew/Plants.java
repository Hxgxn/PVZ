import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Plants here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Plants extends Actor
{
    /**
     * Act - do whatever the Plants wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    public void shoot(Actor actor, int x, int y){
        getWorld().addObject(actor, x, y);
 
    }
    /* public boolean hitZombie(){
        Actor zombie = getOneIntersectingObject(Zombies.class);
        if (zombie != null){
            return true;
        }
        else{
            return false;
        }        
    } */
    public void kill(int hp){
        if (hp <= 0){
            getWorld().removeObject(this);
        }
    }
}
