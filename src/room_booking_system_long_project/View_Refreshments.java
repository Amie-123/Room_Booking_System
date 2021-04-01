//This is where the user will be able to view the refreshments booking:

package room_booking_system_long_project;


public class View_Refreshments extends Room_Booking_System_Long_Project {
    
    
    //Searches for an email that allocates a booking 
    public static int searchForEmail(){
        System.out.println(""); 
        System.out.println("We need the email used for the Refreshments booking:"); 
        System.out.println("Please enter the email address used for the booking:");
        String Name = input.next(); 
        for(int i=0; i<RefreshmentsList.size(); i++){
            if(Name.equals(RefreshmentsList.get(i).getName())){
               return i;
            }
        }
        return -1; 

    }
    
    
    public static void view(){
        if(RefreshmentsList.isEmpty()){
            System.out.println(""); 
            System.out.println("Sorry we have no refreshment bookings"); 
        }
        else{
            int index = searchForEmail(); 
            
            if(index == -1){
                System.out.println(""); 
                System.out.println("Sorry, we have not found the booking that you are looking for");
                System.out.println("This probably means you have typed in the wrong email");
                System.out.println("Or you havent made a refreshments booking with us"); 
                System.out.println(""); 
            }
            else{
                System.out.println(""); 
                for(int i=0; i< RefreshmentsList.size(); i++){
                System.out.println(RefreshmentsList.get(i).toString());
                System.out.println("");
                System.out.println("1st value is quantity of water bottles needed");
                System.out.println("2nd value is quantity of cold food boxes");
                System.out.println("3rd value is the quantity of warm food boxes");
                System.out.println("4th value is quantity of snack packets");
                System.out.println("5th value is the email used to book these");
                System.out.println("Use our information page if you are unsure what this means");
                System.out.println(""); 
                } 
            }
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
