import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wallnut here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Walnut extends Plants
{
    /**
     * Act - do whatever the Wallnut wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage walnut = new GreenfootImage("Walnut.png");
    private GreenfootImage walnutdmg1 = new GreenfootImage("Walnutdmg1.png");
    private GreenfootImage walnutdmg2 = new GreenfootImage("Walnutdmg2.png");
    private int counter = 0;
    public int hp;
    public Walnut(){
        walnut.scale(80, 100);
        setImage(walnut);
        hp = 1500;
    }
    public void act() 
    {
        
        if(hp <=1000 && hp>=501){
            setImage(walnutdmg1);
            walnutdmg1.scale(80, 100);
        }else if(hp <= 500){
            setImage(walnutdmg2);
            walnutdmg2.scale(80, 100);
        }
        kill(hp);
    }
    public void hpUpdate(int damage){
        hp = hp - damage;

    }
}
