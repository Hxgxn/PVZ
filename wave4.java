import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class wave4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wave4 extends waves
{
    /**
     * Act - do whatever the wave4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int counter;
    public void act() 
    {
        if (counter == 10){
             getWorld().addObject(new StandardZombie(), 975, posList.get((int)(Math.random() * 5)));
             getWorld().addObject(new StandardZombie(), 975, posList.get((int)(Math.random() * 5)));
             getWorld().addObject(new StandardZombie(), 975, posList.get((int)(Math.random() * 5)));
             getWorld().addObject(new StandardZombie(), 975, posList.get((int)(Math.random() * 5)));
             getWorld().addObject(new StandardZombie(), 975, posList.get((int)(Math.random() * 5)));
        }
        if (counter == 120){
             getWorld().addObject(new BucketZombie(), 975, posList.get((int)(Math.random() * 5)));
             getWorld().addObject(new BucketZombie(), 975, posList.get((int)(Math.random() * 5)));
        }
        if (counter == 350){
            getWorld().addObject(new HatZombie(), 975, posList.get((int)(Math.random() * 5)));
            getWorld().addObject(new HatZombie(), 975, posList.get((int)(Math.random() * 5)));
            getWorld().addObject(new HatZombie(), 975, posList.get((int)(Math.random() * 5)));
        }
        if (counter == 900){
            getWorld().addObject(new HatZombie(), 975, posList.get((int)(Math.random() * 5)));
            getWorld().addObject(new HatZombie(), 975, posList.get((int)(Math.random() * 5)));
            getWorld().addObject(new HatZombie(), 975, posList.get((int)(Math.random() * 5)));
            getWorld().addObject(new BucketZombie(), 975, posList.get((int)(Math.random() * 5)));
            getWorld().addObject(new BucketZombie(), 975, posList.get((int)(Math.random() * 5)));
            getWorld().addObject(new BucketZombie(), 975, posList.get((int)(Math.random() * 5)));
            getWorld().addObject(new BucketZombie(), 975, posList.get((int)(Math.random() * 5)));
            getWorld().addObject(new BucketZombie(), 975, posList.get((int)(Math.random() * 5)));
            getWorld().addObject(new BucketZombie(), 975, posList.get((int)(Math.random() * 5)));
            getWorld().addObject(new BucketZombie(), 975, posList.get((int)(Math.random() * 5)));
            getWorld().addObject(new BucketZombie(), 975, posList.get((int)(Math.random() * 5)));
            
            getWorld().addObject(new BabyZombie(), 975, posList.get((int)(Math.random() * 5)));
            getWorld().addObject(new BabyZombie(), 975, posList.get((int)(Math.random() * 5)));
            getWorld().addObject(new BabyZombie(), 975, posList.get((int)(Math.random() * 5)));
            getWorld().addObject(new BabyZombie(), 975, posList.get((int)(Math.random() * 5)));
            getWorld().addObject(new BabyZombie(), 975, posList.get((int)(Math.random() * 5)));
            getWorld().addObject(new BabyZombie(), 975, posList.get((int)(Math.random() * 5)));
            getWorld().addObject(new BabyZombie(), 975, posList.get((int)(Math.random() * 5)));
            getWorld().addObject(new BabyZombie(), 975, posList.get((int)(Math.random() * 5)));
            getWorld().addObject(new BabyZombie(), 975, posList.get((int)(Math.random() * 5)));
            getWorld().addObject(new BabyZombie(), 975, posList.get((int)(Math.random() * 5)));
            getWorld().addObject(new BabyZombie(), 975, posList.get((int)(Math.random() * 5)));
            
        }
        if (counter == 1200){
            getWorld().addObject(new BucketZombie(), 975, posList.get((int)(Math.random() * 5)));
            getWorld().addObject(new BucketZombie(), 975, posList.get((int)(Math.random() * 5)));
            getWorld().addObject(new BucketZombie(), 975, posList.get((int)(Math.random() * 5)));
            getWorld().addObject(new BucketZombie(), 975, posList.get((int)(Math.random() * 5)));
            getWorld().addObject(new BucketZombie(), 975, posList.get((int)(Math.random() * 5)));
            getWorld().addObject(new BucketZombie(), 975, posList.get((int)(Math.random() * 5)));
            getWorld().addObject(new BucketZombie(), 975, posList.get((int)(Math.random() * 5)));
            getWorld().addObject(new BucketZombie(), 975, posList.get((int)(Math.random() * 5)));
            getWorld().addObject(new BucketZombie(), 975, posList.get((int)(Math.random() * 5)));    
            
        }
        if (getWorld().getObjects(Zombies.class) == null){
            Greenfoot.stop();
            getWorld().removeObject(this);
        }
        counter += 1;
    }    
}
