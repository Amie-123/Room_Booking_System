//This is where the user will enter their email address 
//Need to check to make usre if it actually an email address 
//Email Addresses need '@' AND '.co.uk' OR '.com' 


package room_booking_system_long_project;


public class Email_Verification extends Room_Booking_System_Long_Project {
    
    //Getting the users email address:
    public static void Ask(){
        System.out.println("");
        System.out.println("Please may you enter your address:");
        Email = input.next(); 
        
        if(Email.contains("@")){
            if((Email.contains(".co.uk")) || Email.contains(".com")){ 
                System.out.println("");
                System.out.println("Your email is " + Email);
                System.out.println("");
            }
            else{
                System.out.println("");
                System.out.println("Your email address does not contain a proper ending");
                System.out.println("Your email MUST contain '.com' or '.co.uk'");
                Ask(); 
            }
        }
        else{
            System.out.println("");
            System.out.println("Your email cannot be verified as it is not an email");
            System.out.println("Your email MUST contain '@' for it to be an email address");
            Ask(); 
        }
        
  
    }
    
    
 
    
    
    
    
    
}
