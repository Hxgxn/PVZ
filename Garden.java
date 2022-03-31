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
    private ArrayList<Field> plantsOnGame;// = new ArrayList<Field>();
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
        plantsOnGame = new ArrayList<Field>();
        // createCircle(412, 67);
        createCircle(250, 570);
        BabyZombie zombie = new BabyZombie();
        addObject(zombie, 950, 300);
        createRectangle(0, 0, 100, 600, new Color(74, 46, 44));
        createRectangle(15, 15, 70, 20, new Color(247, 229, 228));
        sunflowers = new Sunflowers();
        addObject(sunflowers, 0, 0);
        int counter = 0;
        for (var i = 0; i < 5; i++) {
            for (var j = 0; j < 9; j++) {
                Field field = new Field(counter);
                plantsOnGame.add(field);
                addObject(field, 0, 0);
                counter++;
            }
        }
    }
    
    public void act() {
        if (Greenfoot.isKeyDown("1") || Greenfoot.isKeyDown("2") || Greenfoot.isKeyDown("3") || Greenfoot.isKeyDown("4")) {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            if (mouse != null) {
                int x = mouse.getX();
                int y = mouse.getY();
                if (x > 250 && x < 970 && y > 70 && y <570) {
                    x -= 250;
                    y -= 70;
                    int spalte = x / 80;
                    int reihe = y / 100;
                    int id = reihe * 9 + spalte;
                    if (id < 46) {
                    System.out.println("Maus: " + x + "," + y);
                    System.out.println("Feld: " + id);
                    System.out.println(plantsOnGame.get(id));
                        if (!plantsOnGame.get(id).checkIfPlantPlaced()) {
                            System.out.println(plantsOnGame.get(id));
                            if (Greenfoot.isKeyDown("1")) {
                                    plantsOnGame.get(id).setPlant("doublePlant");
                            } else if (Greenfoot.isKeyDown("2")) {
                                plantsOnGame.get(id).setPlant("frostPlant");
                            } else if (Greenfoot.isKeyDown("3")) {
                                plantsOnGame.get(id).setPlant("standardPlant");
                            } else if (Greenfoot.isKeyDown("4")) {
                                plantsOnGame.get(id).setPlant("sunflower");
                            }
                        }
                    }
                }
            }
        }
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
}
