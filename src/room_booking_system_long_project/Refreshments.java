//Creating an object for the refreshments that they will order with the room:
//This is where all the information about the refreshents will be stored 

package room_booking_system_long_project;


public class Refreshments {
    
    //creating the private variables:
    private int WaterBottles;
    private int ColdFood;
    private int WarmFood; 
    private int Snacks; 
    private String Name; 
    
    
    //Inserting the constructor:
    public Refreshments(int WaterBottles, int ColdFood, int WarmFood, int Snacks, String Name) {
        this.WaterBottles = WaterBottles;
        this.ColdFood = ColdFood;
        this.WarmFood = WarmFood;
        this.Snacks = Snacks;
        this.Name = Name;
    }
    
    public String toString(){
        return WaterBottles + ", " + ColdFood + ", " + WarmFood + ", " + Snacks + ", " + Name; 
    }
    
    
    //Inserting the Getters:
    public int getWaterBottles() {
        return WaterBottles;
    }

    public int getColdFood() {
        return ColdFood;
    }

    public int getWarmFood() {
        return WarmFood;
    }

    public int getSnacks() {
        return Snacks;
    }

    public String getName() {
        return Name;
    }
    
    
    //Inserting the Setters:
    public void setWaterBottles(int WaterBottles) {
        this.WaterBottles = WaterBottles;
    }

    public void setColdFood(int ColdFood) {
        this.ColdFood = ColdFood;
    }

    public void setWarmFood(int WarmFood) {
        this.WarmFood = WarmFood;
    }

    public void setSnacks(int Snacks) {
        this.Snacks = Snacks;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
    
    
    
}
