import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BabyZombie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BabyZombie extends Zombies
{
    /**
     * Act - do whatever the BabyZombie wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage babyZombie = new GreenfootImage("BabyZombie.png");
    private int counter = 0;
    private String message = "";
    private int hp;
    private int damage;
    private int steplenght = 2;
    private int divisor = 2;
    private int freezeCounter = 0;
    private boolean hitFreeze = false;
    private boolean hitStandart = false;
    private boolean hitMine = false;
    private boolean hitFire = false;
    private int hitdamage;
    public BabyZombie() {
        babyZombie.scale(80, 80);
        setImage(babyZombie);
        hp = 75;
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
        else if (hitFire() == true){
            hitFire = true;
        }
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
        else if (hitFire){
            hp = hp - 1;
        }
        if (!getFight()){
            moveZombie(steplenght, divisor, counter);
        }
        counter++;
        freezeCounter--;
        damage(hitdamage);
        kill(hp);
        hitStandart = false;
        hitFreeze = false;
        hitMine = false;
        hitFire = false;
    }
}
