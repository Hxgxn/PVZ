/**
 * Write a description of class Field here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Field  
{
    // instance variables - replace the example below with your own
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    /**
     * Constructor for objects of class Field
     */
    public Field(int x1,int x2, int y1, int y2)
    {
        x1 = x1;
        x2 = x2;
        y1 = y1;
        y2 = y2;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public boolean checkIfInField(int x, int y) {
        if (x < x2 && x > x1 && y < y2 && y > y1) {
            return true;
        } else {
            return false;
        }
    }
}
