import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HeadZombie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HatZombie extends Zombies
{
    /**
     * Act - do whatever the HeadZombie wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage hatZombie = new GreenfootImage("HatZombie.png"); 
    private int counter = 0;
    private String message = "";
    private int hp;
    private int damage;
    private int steplenght = 1;
    private int divisor = 2;
    private int freezeCounter = 0;
    private boolean hitFreeze = false;
    private boolean hitStandart = false;
    private boolean hitMine = false;
<<<<<<< HEAD
    private boolean hitFire = false;
=======
>>>>>>> refs/remotes/origin/main
    private int hitdamage;
    public HatZombie() {
        hatZombie.scale(100, 100);
        setImage(hatZombie);
        hp = 175;
        hitdamage = 1;
    }
    public void checkHit() {
        if (hitStandart()) {
             //System.out.println("hitStandart");
             hitStandart = true;
        } else if (hitFreeze()) {
            hitFreeze = true;
        }
        else if (hitMine() == true){
            hitMine = true;
        }
<<<<<<< HEAD
        else if (hitFire() == true){
            hitFire = true;
        }
=======
>>>>>>> refs/remotes/origin/main
    }
    public void act() 
    {
        checkHit();
        if (hitFreeze) {
            freezeCounter = 300;
        }
        if (freezeCounter > 0) {
            divisor = 15;
        } else {
            divisor = 2;
        }
        if (hitStandart) {
            hp = hp - 25;
        }
        else if (hitFreeze){
            hp = hp - 20;
        }
        else if (hitMine){
            hp = hp - 280;
        }
<<<<<<< HEAD
        else if (hitFire){
            hp = hp - 5;
        }
=======
>>>>>>> refs/remotes/origin/main
        if (!getFight()){
            moveZombie(steplenght, divisor, counter);
        }
        counter++;
        freezeCounter--;
        damage(hitdamage);
        kill(hp);
        hitStandart = false;
        hitFreeze = false;
<<<<<<< HEAD
        hitMine = false;
        hitFire = false;
=======
>>>>>>> refs/remotes/origin/main
    }
}
