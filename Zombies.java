import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.time.*;
/**
 * Write a description of class Zombies here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zombies extends Actor
{
    /**
     * Act - do whatever the Zombies wants to do. This method is called     
     * whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    public boolean hitFreeze(){
        Actor bullet = getOneIntersectingObject(FreezeBullet.class);
        if (bullet != null){
            getWorld().removeObject(bullet);
            return true;
        }
        else{
            return false;
        }
    }
    public boolean hitStandart(){
        Actor bullet = getOneIntersectingObject(StandardBullet.class);
        if (bullet != null){
            getWorld().removeObject(bullet);
            return true;
        }
        else{
            return false;
        }        
    }
    public boolean hitMine(){
        Mine bullet = (Mine)getOneIntersectingObject(Mine.class);
        if (bullet != null && bullet.activated == true){
            getWorld().addObject(new Explosion(), bullet.getX(), bullet.getY());
            getWorld().removeObject(bullet);
            return true;
        }
        else{
            return false;
        }
    }
    public boolean hitFire(){
        Actor bullet = getOneIntersectingObject(FireBullet.class);
        if (bullet != null){
            getWorld().removeObject(bullet);
            return true;
        }
        else{
            return false;
        }
    }
    public int hpUpdate(int hp, boolean hitStandart, boolean hitFreeze){
        int damage;
        if (hitStandart == true){
            //System.out.println("hit");
            damage = 25;
        }
        else if (hitFreeze == true){
            damage = 20;
        }
        else{
            damage = 0;
        }
        return hp - damage;
    }
    public void moveZombie(int speed, int divisor, int counter){
        if (getX() < 253) {
            Greenfoot.stop();
        } else {
            // Um einen Zombie langsamer zumachen, muss lediglich der Divisor erhöht werden!
            if (counter % divisor == 0) {
                setLocation(getX() - speed, getY());

                if (counter % divisor == 0) {
                    setLocation(getX() - speed, getY());
                }
            }
        }
    }
    public void kill(int hp){
        if (hp <= 0){
            getWorld().removeObject(this);
        }
    }
    public boolean getFight(){
        World w = (Garden)getWorld();
        Garden s = (Garden)getWorld();
        Actor plant = getOneIntersectingObject(Plants.class);
        Mine mine = (Mine)getOneIntersectingObject(Mine.class);
        if (plant != null || mine != null){
            return true;
        }
        else{
            return false;
        }
    }
    public void damage(int damage){
        Double doppel = (Double) getOneIntersectingObject(Double.class);
        Frost frost = (Frost) getOneIntersectingObject(Frost.class);
        StandardPlants standardPlants = (StandardPlants) getOneIntersectingObject(StandardPlants.class);
        Sunflower sunflower = (Sunflower) getOneIntersectingObject(Sunflower.class);
        FirePlant fireplant = (FirePlant)getOneIntersectingObject(FirePlant.class);
        Mine mine = (Mine)getOneIntersectingObject(Mine.class);
        Walnut walnut = (Walnut)getOneIntersectingObject(Walnut.class);
        if (doppel != null){
            doppel.hpUpdate(damage);
        }
        else if (frost != null){
            frost.hpUpdate(damage);
        }
        else if (standardPlants != null){
            standardPlants.hpUpdate(damage);
        }
        else if (sunflower != null){
            sunflower.hpUpdate(damage);
        }
        else if (mine != null){
            mine.hpUpdate(damage);
        }
        else if (fireplant != null){
            fireplant.hpUpdate(damage);
        }

        else if (walnut != null){
            walnut.hpUpdate(damage);
        }
    }
}
