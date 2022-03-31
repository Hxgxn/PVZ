<<<<<<< HEAD
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Double here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Double extends Plants
{
    /**
     * Act - do whatever the Double wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage Double = new GreenfootImage("Duble-Standart.png");
    private int counter = 25;
    public int hp;
    public Double(){
        setImage(Double);
        Double.scale(115,115);
        hp = 200;    }
    public void act() 
    {
        if (counter == 0){
            shoot(new StandardBullet(), getX(), getY());
            counter = 70;
        }
        if (counter == 60){
            shoot(new StandardBullet(), getX(), getY());
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
 * Write a description of class Double here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Double extends Plants
{
    /**
     * Act - do whatever the Double wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage double_img = new GreenfootImage("Duble-Standart.png");
    private int counter = 25;
    public int hp;
    public Double(){
        setImage(double_img);
        double_img.scale(115,115);
        hp = 200;    }
    public void act() 
    {
        if (counter == 0){
            shoot(new StandardBullet(), getX(), getY());
            counter = 70;
        }
        if (counter == 60){
            shoot(new StandardBullet(), getX(), getY());
        }
        counter = counter - 1;
        kill(hp);
    }
    public void hpUpdate(int damage){
        hp = hp - damage;
    }
}
>>>>>>> refs/remotes/origin/main
