/**
 * Write a description of class Field here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import greenfoot.*;
public class Field extends Actor
{
    // instance variables - replace the example below with your own
    private Plants plant;
    public int position;

    /**
     * Constructor for objects of class Field
     */
    public Field(int positionNew)
    {
        position = positionNew;
        plant = null;
    }
    
    public boolean checkIfPlantPlaced() {
        if (plant != null) {
            return true;
        } else {
            return false;
        }
    }
    
    public void setPlant(String plantNew) {/*, int x, int y) { */
        /*
        x -= 250;
        y -= 70;
        int spalte = x / 80;
        int reihe = y / 100;
        int id = reihe * 5 + spalte;
         */
        Plants placePlant = null;
        World world = getWorld();
        int reihe = position / 9;
        int spalte = position - (reihe * 9);
        int x = 250 + spalte * 80 + 40;
        int y = 70 + reihe * 100 + 50;
        if (plantNew == "doublePlant") {
            placePlant = new Double();
            world.addObject(placePlant, x, y);
        } else if (plantNew == "frostPlant") {
            placePlant = new Frost();
            world.addObject(placePlant, x, y);
        } else if (plantNew == "standardPlant") {
            placePlant = new StandardPlants();
            world.addObject(placePlant, x, y);
        } else if (plantNew == "sunflower") {
            placePlant = new Sunflower();
            world.addObject(placePlant, x, y);
        }
        plant = placePlant;
    }
    
    public void act() {
    }
}
