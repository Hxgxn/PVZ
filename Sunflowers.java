<<<<<<< HEAD
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sunflowers extends Actor
{
    private static final Color textColor = new Color(255, 180, 150);
    
    private int value = 0;
    private int target = 0;
    private String text;
    private int stringLength;
    private String message = "";
    private static int sunflowers;
    public static int getFlowers() {
        return sunflowers;
    }
    
    public static int setFlowers(int newValue) {
        return (sunflowers = newValue);
    }

    public Sunflowers() {
        sunflowers = 0;
    }
    
    /*public Sunflowers(String prefix)
    {
        text = prefix;
        stringLength = (text.length() + 2) * 10;

        setImage(new GreenfootImage(stringLength, 16));
        GreenfootImage image = getImage();
        image.setColor(textColor);

        updateImage();
    }*/
    
    /*private void updateImage()
    {
        GreenfootImage image = getImage();
        image.clear();
        image.drawString(text + sunflowers, 1, 12);
    }*/
    
    public void act() {
        message = "Sonnen: " + Sunflowers.getFlowers();
        Garden s = (Garden) getWorld();
        if (s != null) {
            s.showText(message, 60, 25);
        } else {
            System.out.println(s);
        }
    }

    public void add(int score)
    {
        target += score;
    }

    public int getValue()
    {
        return value;
    }
}
=======
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sunflowers extends Actor
{
    private static final Color textColor = new Color(255, 180, 150);
    
    private int value = 0;
    private int target = 0;
    private String text;
    private int stringLength;
    private String message = "";
    private static int sunflowers;
    public static int getFlowers() {
        return sunflowers;
    }
    
    public static int setFlowers(int newValue) {
        return (sunflowers = newValue);
    }

    public Sunflowers() {
        sunflowers = 0;
    }
    
    /*public Sunflowers(String prefix)
    {
        text = prefix;
        stringLength = (text.length() + 2) * 10;

        setImage(new GreenfootImage(stringLength, 16));
        GreenfootImage image = getImage();
        image.setColor(textColor);

        updateImage();
    }*/
    
    /*private void updateImage()
    {
        GreenfootImage image = getImage();
        image.clear();
        image.drawString(text + sunflowers, 1, 12);
    }*/
    
    public void act() {
        message = "Sonnen: " + Sunflowers.getFlowers();
        Garden s = (Garden) getWorld();
        if (s != null) {
            s.showText(message, 60, 25);
        } else {
            System.out.println(s);
        }
    }

    public void add(int score)
    {
        target += score;
    }

    public int getValue()
    {
        return value;
    }
}
>>>>>>> refs/remotes/origin/main
