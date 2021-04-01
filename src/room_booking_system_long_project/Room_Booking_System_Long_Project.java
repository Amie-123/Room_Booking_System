//Where the main program will be run:

package room_booking_system_long_project;

import java.util.Scanner;
import java.util.ArrayList; 

public class Room_Booking_System_Long_Project {
    
    public static Scanner input = new Scanner(System.in);  
    public static String Email = null;
    public static int RoomNo = 0; 
    public static double Cost = 0; 
    public static ArrayList <Room> BookingList = new ArrayList<>(); 
    public static ArrayList <Supplies> SuppliesList = new ArrayList<>(); 
    public static ArrayList <Refreshments> RefreshmentsList = new ArrayList <>(); 
   
    
    public static void main(String[] args) {
        //Run intro formalities:
        Formalities.Intro(); 
        
        //Run the email verification:
        Email_Verification.Ask(); 
        
        //Run The Booking Code:
        Booking(); 
        
    }
    

    public static void Booking(){
        //Letting the user either book, edit or delete a booking: 
        System.out.println(""); 
        boolean Go = true;
        
        while(Go == true){
            System.out.println("");
            System.out.println("How would you like to proceed?");
            System.out.println("1 - Add Booking");
            System.out.println("2 - Edit Booking"); 
            System.out.println("3 - Delete Booking"); 
            System.out.println("4 - View Booking");
            System.out.println("5 - Exit");
            System.out.println("6 - View Information Key");
            System.out.println("");
            int choice = input.nextInt(); 
            switch(choice){
                case 1:
                    //these call subclasses and the methods in them that allow people to add bookings 
                    Add_Booking.NumberofPeople();
                    Add_Booking.Disabled(); 
                    Add_Booking.adding();
                    Add_Spplies.add();
                    Add_Refreshments.adding();
                    //ADD A CHECKING SYSTEM 
                    break;
                    
                case 2:
                    //these call subclasses and the methods in them that allow people to edit the booking 
                    Edit_Booking.edit(); 
                    Edit_Supplies.edit(); 
                    Edit_Refreshments.edit(); 
                    break;
                    
                case 3:
                    //these call subclasses and the methods in them that allow people to delete the booking 
                    Delete_Booking.delete(); 
                    Delete_Supplies.delete(); 
                    Delete_Refreshments.delete();
                    break; 
                    
                case 4:
                    //these call subclasses and the methods in them that allow people to view the booking 
                    View_Booking.view(); 
                    View_Supplies.view(); 
                    View_Refreshments.view(); 
                    break; 
                    
                case 5:
                    //this stops the program from running and takes the user to a exit page 
                    Go = false; 
                    Formalities.Outro(); 
                    break; 
                    
                case 6:
                    //this is a page where the user can view all the information about what they are booking 
                    Information_Key.Information(); 
                    break;
                    
            }
            
        }
        
    }
    
    
    

    
}


//THINGS TO DO:   
//9. check that there are no double bookings 