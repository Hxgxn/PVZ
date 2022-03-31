import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class wave1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wave1 extends waves
{
    /**
     * Act - do whatever the wave1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int counter;
    public wave1(){
        
    }
    public void act() 
    {   
        if (counter == 10){
             getWorld().addObject(new StandardZombie(), 975, posList.get((int)(Math.random() * 5)));
        }
        if (counter == 120){
             getWorld().addObject(new StandardZombie(), 975, posList.get((int)(Math.random() * 5)));
             getWorld().addObject(new StandardZombie(), 975, posList.get((int)(Math.random() * 5)));
        }
        if (counter == 350){
            getWorld().addObject(new StandardZombie(), 975, posList.get((int)(Math.random() * 5)));
            getWorld().addObject(new StandardZombie(), 975, posList.get((int)(Math.random() * 5)));
            getWorld().addObject(new HatZombie(), 975, posList.get((int)(Math.random() * 5)));
        }
        if (counter == 550){
            getWorld().addObject(new HatZombie(), 975, posList.get((int)(Math.random() * 5)));
            getWorld().addObject(new HatZombie(), 975, posList.get((int)(Math.random() * 5)));
            getWorld().addObject(new HatZombie(), 975, posList.get((int)(Math.random() * 5)));
            getWorld().addObject(new BucketZombie(), 975, posList.get((int)(Math.random() * 5)));
        }
        if (counter >= 900){

            getWorld().addObject(new wave2(), 0, 0);
            getWorld().removeObject(this);
        }
        counter += 1;
    }
    
}
