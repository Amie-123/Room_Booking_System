//this is the code that lets the user view their booking 
//You need to check the booking name to see the booking 

package room_booking_system_long_project;


public class View_Booking extends Room_Booking_System_Long_Project {
    
    
    public static void view(){
        if(BookingList.isEmpty()){
            System.out.println("");
            System.out.println("Sorry, but there doesnt seem to be any bookings to view at the moment");
            System.out.println("Make sure that you have booked a room before trying to view it!");        
        }
        else{
            int index = searchForEmail(); 
            
            if(index == -1){
                System.out.println("");
                System.out.println("Sorry, we have not found the booking that you were looking for!");
                System.out.println("This probably means you have typed the email in wrong");
                System.out.println("Try again making sure the email is correct");
                System.out.println("This could also mean you havenmt booked with us");
                System.out.println("make sure to make a booking before trying to delete it");
            }
            else{
                System.out.println("");
                for(int i=0; i< BookingList.size(); i++){
                System.out.println(BookingList.get(i).toString());
                System.out.println("");
                System.out.println("1st value is your month");
                System.out.println("2nd value is your date");
                System.out.println("3rd value is your time slot (see information page");
                System.out.println("4th value is your room number");
                System.out.println("5th value is the email te booking is under");
                System.out.println("Use our information page if you are unsure what these terms mean!");
                System.out.println("You can do this by pressing 6 after this page!");
            }
   
          
        }
        
 
        
    }
    
    }

    
    //Searches for an email that allocates a booking 
    public static int searchForEmail(){
        System.out.println(""); 
        System.out.println("Please enter the email address used for the booking:");
        String Name = input.next(); 
        for(int i=0; i<BookingList.size(); i++){
            if(Name.equals(BookingList.get(i).getName())){
               return i;
            }
        }
        return -1; 

    }
    
    
    
    
    
    
    
    
}
