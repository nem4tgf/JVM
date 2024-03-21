/**
 * Write a description of class Battery here.
 * @author Nam
 * @version 1.0
 */


public class Battery {
    /**
     * Fields
     */
    private int energy;
    /**
     * Constructor for objects of class Battery
     */

    public Battery(){
        //To do:
        energy=100;
    }
    /**
     * Method
     */
    public void setEnergy(int value){
        energy=value;
    }
    public int getEnergy(){
        return energy;
    }
    public void decreaseEnergy(){
        energy--;
    }
}
