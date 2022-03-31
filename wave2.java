import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class wave2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wave2 extends waves
{
    /**
     * Act - do whatever the wave2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int counter;
    public void act() 
    {
        if (counter == 10){
             getWorld().addObject(new StandardZombie(), 975, posList.get((int)(Math.random() * 5)));
             getWorld().addObject(new HatZombie(), 975, posList.get((int)(Math.random() * 5)));
             getWorld().addObject(new StandardZombie(), 975, posList.get((int)(Math.random() * 5)));
             getWorld().addObject(new HatZombie(), 975, posList.get((int)(Math.random() * 5)));
             getWorld().addObject(new StandardZombie(), 975, posList.get((int)(Math.random() * 5)));
             getWorld().addObject(new StandardZombie(), 975, posList.get((int)(Math.random() * 5)));
             
        }
        if (counter == 120){
             getWorld().addObject(new BucketZombie(), 975, posList.get((int)(Math.random() * 5)));
             getWorld().addObject(new BucketZombie(), 975, posList.get((int)(Math.random() * 5)));
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
        if(getWorld().getObjects(Zombies.class) == null){
            System.out.println("Meine Tastatur hat keine Buchstaben auser H U R E N S O H N");
        }
        if (counter >= 900){
            getWorld().addObject(new wave3(), 0, 0);
            getWorld().removeObject(this);
        }
        counter += 1;
    }
}
