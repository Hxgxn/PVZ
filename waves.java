import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import java.lang.Math.*;
/**
 * Write a description of class waves here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class waves extends Actor
{
    /**
     * Neue Wave starten implementieren lool
     * andere methode für wavecomplete verwenden lool
     */
    private int counter = 0;
    private int wavecounter = 1;
    public List<Integer> posList = new ArrayList<Integer>();
    public List zombList = new ArrayList();
    private boolean wavecomplete = false;
    private int start = 0;
    public waves(){
        posList.add(130);
        posList.add(225);
        posList.add(335);
        posList.add(420);
        posList.add(510);
        zombList.add(BabyZombie.class);
        zombList.add(BucketZombie.class);
        zombList.add(HatZombie.class);
        zombList.add(StandardZombie.class);
    }
    public void act() 
    {   if (start == 0) {
            getWorld().addObject(new wave1(), 0, 0);
            start += 1 ;
        }   
    }
}
