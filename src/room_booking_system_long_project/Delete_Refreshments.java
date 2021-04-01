//This is where the user can delete teh refreshments bookings:

package room_booking_system_long_project;


public class Delete_Refreshments extends Room_Booking_System_Long_Project{
    
    
    //searches for an email that allocates a booking 
    public static int searchForEmail(){
        System.out.println("");
        System.out.println("We need to ask the eamil for the refreshemnts booking:"); 
        System.out.println("Please enter the email address used for the booking:");
        String Name = input.next(); 
        for(int i=0; i<RefreshmentsList.size(); i++){
            if(Name.equals(RefreshmentsList.get(i).getName())){
               return i;
            }
        }
        return -1; 

    }
    

    
    public static void delete(){
        if(RefreshmentsList.isEmpty()){
            System.out.println("");
            System.out.println("There are no refreshments bookings");
        }
        else{
            int index = searchForEmail(); 
            
            if(index == -1){
                System.out.println(""); 
                System.out.println("Sorry, we have not found the refreshments booking that you are looking for!");
                System.out.println("This probably means you have not made a refreshments booking with us");
                System.out.println("Make sure you make a booking with us before you try and delete it");
                System.out.println("It could also mean you have typed your email in wrong");
                System.out.println("Try again and make sure you have the correct email address");
                System.out.println("");
            }
            else{
                System.out.println("");
                System.out.println("We have found your booking, are you sure you want to delete this?");
                for(int i=0; i< BookingList.size(); i++){
                System.out.println(BookingList.get(i).toString());
                System.out.println("Yes or No?"); 
                String check = input.next(); 
                if(check.equalsIgnoreCase("Yes")){
                    System.out.println("");
                    System.out.println("Okay, we have deleted the booking");
                    RefreshmentsList.remove(index); 
                }
                else{
                    System.out.println("");
                    System.out.println("Okay we will leave the booking alone"); 
                    System.out.println(""); 
                }
                
            }
            
        }
        
        
        
     } 
        
        
    }
   
    
    
    
    
    
    
}
