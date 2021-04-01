//This is where the user can delete the supplies 

package room_booking_system_long_project;


public class Delete_Supplies extends Room_Booking_System_Long_Project {
    
    //The program will search for the supplies with the email entered:
    public static int searchForEmail(){
        System.out.println(""); 
        System.out.println("We need to ask the email for the supplies booking"); 
        System.out.println("Please enter the email address used for the booking:");
        String Name = input.next(); 
        for(int i=0; i<SuppliesList.size(); i++){
            if(Name.equals(SuppliesList.get(i).getName())){
               return i;
            }
        }
        return -1; 

    }
    
    
    
    
    
    public static void delete(){
        if(SuppliesList.isEmpty()){
            System.out.println("");
            System.out.println("There are no current supply bookings"); 
        }
        else{
            int index = searchForEmail();  
            
            if(index == -1){
                System.out.println(""); 
                System.out.println("Sorry, we have not found the supplies booking that you are looking for!");
                System.out.println("This probably means you have not made a booking with us");
                System.out.println("Make sure you make a supply booking with us before you try and delete it");
                System.out.println("It could also mean you have typed your email in wrong");
                System.out.println("Try again and make sure you have the correct email address");
                System.out.println("");
            }
            else{
                System.out.println("");
                System.out.println("We have found your  supplies booking, are you sure you want to delete this?");
                for(int i=0; i< SuppliesList.size(); i++){
                System.out.println(SuppliesList.get(i).toString());
                System.out.println("Yes or No");
                String check = input.next(); 
                if(check.equalsIgnoreCase("Yes")){ 
                    System.out.println("We have deleted this booking for you");
                    SuppliesList.remove(index); 
                }
                else{
                   System.out.println("");
                   System.out.println("Okay, we will keep this booking for now");
                   System.out.println("You should look again at your supplies booking so you can be sure how you would like to proceed");
                   System.out.println("");
                }
                
            }
            
        }
 
        
    }
    } 
    
    
    
    
    
}
