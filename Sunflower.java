import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sunflower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sunflower extends Plants
{
    /**
     * Act - do whatever the Sunflower wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage sunflower = new GreenfootImage("Sunflower.png");
    private int counter = 0;
    public int hp;
    public Sunflower() {
        sunflower.scale(90, 90);
        setImage(sunflower);
        hp = 100;
    }
    
    public void act() 
    {
        if (counter % 10 == 0) {
            Sunflowers.setFlowers(Sunflowers.getFlowers() + 1);
        }
        counter++;
        kill(hp);
    }
    public void hpUpdate(int damage){
        hp = hp - damage;
        System.out.println("hit");
    }
}
