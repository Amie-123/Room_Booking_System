//Making an object for the supplies people want
//This is where all the informationn about the supplies will be kept 

package room_booking_system_long_project;


public class Supplies {
    
    //Setting the supplies varibales:
    private int Projector;
    private int Notebook;
    private int laptop;
    private int Pens; 
    private String Name; 
    
    //Getting the constructors:
    public Supplies(int Projector, int Notebook, int laptop, int Pens, String Name) {
        this.Projector = Projector;
        this.Notebook = Notebook;
        this.laptop = laptop;
        this.Pens = Pens;
        this.Name = Name; 
    }
    
    
    public String toString(){
        return Projector + ", " + Notebook + ", " + laptop + ", " + Pens + ", " + Name; 
    }
    
   
    //getting the getters:
    public int getProjector() {
        return Projector;
    }

    public int getNotebook() {
        return Notebook;
    }

    public int getLaptop() {
        return laptop;
    }

    public int getPens() {
        return Pens;
    }

    public String getName() {
        return Name;
    }
    
    
    
    //Getting the setters:
    public void setProjector(int Projector) {
        this.Projector = Projector;
    }

    public void setNotebook(int Notebook) {
        this.Notebook = Notebook;
    }

    public void setLaptop(int laptop) {
        this.laptop = laptop;
    }

    public void setPens(int Pens) {
        this.Pens = Pens;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
    
    
    
}
