import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class standard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StandardPlants extends Plants
{
    /**
     * Act - do whatever the standard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage Standard = new GreenfootImage("StandardPlant.png");
    private int counter = 25;
    public int hp;
    public StandardPlants(){
        setImage(Standard);
        Standard.scale(70, 80);
        hp = 200;
    }
    public void act() 
    {   
        if (counter == 0){
            shoot(new StandardBullet(), getX(), getY());
            counter = 70;
        }
        counter = counter - 1;
        kill(hp);
    }
    public void hpUpdate(int damage){
        hp = hp - damage;
    }
}
