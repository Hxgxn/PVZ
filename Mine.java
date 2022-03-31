import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mine extends Bullets
{
    /**
     * Act - do whatever the Mine wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage Mine_Down = new GreenfootImage("Mine_Down.png");
    private GreenfootImage Mine = new GreenfootImage("Mine.png");
    public boolean activated;
    private int counter;
    public int hp;
    public Mine(){
        setImage(Mine_Down);
        Mine_Down.scale(120,120);
        activated = false;
        counter = 0;
        hp = 100;
    }
    public void act() 
    {
        activation();
        if( activated == true){
            
            setImage(Mine);

            Mine.scale(100,100);

            Mine.scale(120,120);

        }
        kill(hp);
        
    }
    public void activation(){
        if (counter == 100){
            activated = true;
        }
        counter = counter + 1;
    }
    public void kill(int hp){
        if (hp <= 0){
            getWorld().removeObject(this);
        }
    }
    public void hpUpdate(int damage){
        hp = hp - damage;
    }
}
