import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FirePlant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FirePlant extends Plants
{
    /**
     * Act - do whatever the FirePlant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage Fire = new GreenfootImage("FirePlant.png");
    private int counter = 25;
    public int hp;
    public FirePlant(){
        setImage(Fire);
        Fire.scale(80, 80);
        hp = 200;
    }
    public void act() 
    {
        if (counter == 0){
            shoot(new FireBullet(), getX(), getY());
            counter = 2;
        }
        counter = counter - 1;
        kill(hp);
    }
    public void hpUpdate(int damage){
        hp = hp - damage;
    }
}
