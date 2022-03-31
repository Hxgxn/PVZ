import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Garden extends World
{
    private Sunflowers sunflowers;
    private List<Field> plantsOnGame = new ArrayList<>();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Garden()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1400, 600, 1);
        GreenfootImage background = new GreenfootImage("background-1.jpg");
        background.scale(1400, 600);
        setBackground(background);
        // createCircle(412, 67);
        createCircle(250, 570);
        //BabyZombie zombie = new BabyZombie();
        //addObject(zombie, 950, 300);
        createRectangle(0, 0, 100, 600, new Color(74, 46, 44));
        createRectangle(15, 15, 70, 20, new Color(247, 229, 228));
        sunflowers = new Sunflowers();
        addObject(sunflowers, 0, 0);
        addAllFields();
        displayAllFields();
        prepare();
        addObject(new waves(), 0, 0);
    }

    private void addAllFields() {
        plantsOnGame.add(new Field(253, 78, 333, 180));
        plantsOnGame.add(new Field(335, 72, 406, 180));
        plantsOnGame.add(new Field(412, 67, 490, 180));
        plantsOnGame.add(new Field(496, 60, 570, 180));
        plantsOnGame.add(new Field(568, 59, 651, 180));
        plantsOnGame.add(new Field(654, 62, 735, 180));
        plantsOnGame.add(new Field(740, 69, 812, 180));
        plantsOnGame.add(new Field(812, 73, 888, 180));
        plantsOnGame.add(new Field(887, 77, 980, 180));
    }

    private void displayAllFields() {
        plantsOnGame.forEach((field) -> {
                System.out.println(field);
            });
    }    
    private void createCircle(int x, int y) {
        GreenfootImage background = getBackground();
        background.setColor(Color.GREEN);
        background.fillOval(x, y, 5, 5);
    }
    private void createRectangle(int x, int y, int width, int height, Color color) {
        GreenfootImage background = getBackground();
        background.setColor(color);
        background.fillRect(x, y, width, height);
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
