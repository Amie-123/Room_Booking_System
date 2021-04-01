//Creating the object of a Room 
//This is where the all the details of the room will be kept 

package room_booking_system_long_project;


public class Room {
    
    //getting the variables that will be needed to make a booking:
    private String Month; 
    private int Date;
    private int Time; 
    private int RoomNumber;
    private String Name; 
    
    
    //Getting the constructor: 
    public Room(String Month, int Date , int Time, int RoomNumber, String Name) {
        this.Month = Month;
        this.Date = Date;
        this.Time = Time;
        this.RoomNumber = RoomNumber;
        this.Name = Name;
    }
    
    
    public String toString(){
        return Month + ", " + Date + ", " + Time + ", " + RoomNumber + ", " + Name; 
    }
    
    
    //Inserting Getters:
    public String getMonth() {
        return Month;
    }

    public int getDate() {
        return Date;
    }

    public int getTime() {
        return Time;
    }

    public int getRoomNumber() {
        return RoomNumber;
    }

    public String getName() {
        return Name;
    }
    
    
    
    //Inserting Setters:
    public void setMonth(String Month) {
        this.Month = Month;
    }

    public void setDate(int Date) {
        this.Date = Date;
    }

    public void setTime(int Time) {
        this.Time = Time;
    }

    public void setRoomNumber(int RoomNumber) {
        this.RoomNumber = RoomNumber;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
    
 
    
    
    
}
