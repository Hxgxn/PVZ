<<<<<<< HEAD
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Frost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Frost extends Plants
{
    /**
     * Act - do whatever the Frost wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage Frost = new GreenfootImage("IcePlant.png");
    private int counter = 25;
    public int hp;
    public Frost(){
        setImage(Frost);
        Frost.scale(145,95);
        hp = 200;
    }
    public void act() 
    {
        if (counter == 0){
            shoot(new FreezeBullet(), getX(), getY());
            counter = 70;
        }
        counter = counter - 1;
        kill(hp);
    }
    public void hpUpdate(int damage){
        hp = hp - damage;
    }
}
=======
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Frost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Frost extends Plants
{
    /**
     * Act - do whatever the Frost wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage Frost = new GreenfootImage("IcePlant.png");
    private int counter = 25;
    public int hp;
    public Frost(){
        setImage(Frost);
        Frost.scale(145,95);
        hp = 200;
    }
    public void act() 
    {
        if (counter == 0){
            shoot(new FreezeBullet(), getX(), getY());
            counter = 70;
        }
        counter = counter - 1;
        kill(hp);
    }
    public void hpUpdate(int damage){
        hp = hp - damage;
    }
}
>>>>>>> refs/remotes/origin/main
