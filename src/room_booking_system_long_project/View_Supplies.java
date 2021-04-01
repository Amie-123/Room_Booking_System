//This is where the user will be able to view their supplies 

package room_booking_system_long_project;


public class View_Supplies extends Room_Booking_System_Long_Project {
    
     //The program will search for the supplies with the email entered:
    public static int searchForEmail(){
        System.out.println(""); 
        System.out.println("Please enter the email address used for the booking:");
        String Name = input.next(); 
        for(int i=0; i<SuppliesList.size(); i++){
            if(Name.equals(SuppliesList.get(i).getName())){
               return i;
            }
        }
        return -1; 

    }
    
    
    
    
    public static void view(){
        if(SuppliesList.isEmpty()){
            System.out.println("");
            System.out.println("Sorry, but there doesnt seem to be any supplies bookings to view at the moment");
            System.out.println("Make sure that you have booked supplies before trying to view it!");        
        }
        else{
            int index = searchForEmail(); 
            
            if(index == -1){
                System.out.println("");
                System.out.println("Sorry, we have not found the supplies booking that you were looking for!");
                System.out.println("This probably means you have typed the email in wrong");
                System.out.println("Try again making sure the email is correct");
                System.out.println("This could also mean you havent booked supplies with us");
                System.out.println("make sure to make a booking before trying to delete it");
            }
            else{
                System.out.println("");
                for(int i=0; i< SuppliesList.size(); i++){
                System.out.println(SuppliesList.get(i).toString());
                System.out.println("");
                System.out.println("1st value is the quantity of projectors needed");
                System.out.println("2nd value is the quantity of notebooks needed");
                System.out.println("3rd value is the quantity of laptops needed");
                System.out.println("4th value is quantity of pens needed");
                System.out.println("5th value is the email booking uses");
                System.out.println("Use our information page if you are unsure what these terms mean!");
                System.out.println("You can do this by pressing 6 after this page!");
            }
   
          
        }
        
 
        
    }
    
    }
    
    
    
    
    
    
    
    
}
