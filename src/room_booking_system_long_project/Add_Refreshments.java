//This is where the user will be able to add refreshemnts to the booking

package room_booking_system_long_project;


public class Add_Refreshments extends Room_Booking_System_Long_Project{
    
    public static void adding(){
        System.out.println(""); 
        System.out.println("This is where you can add the refreshments");
        System.out.println("How many water bottles would you like to have?");
        int WaterBottles = input.nextInt(); 
        
        System.out.println(""); 
        System.out.println("How many Cold meals woudl you like?");
        int ColdFood = input.nextInt();
        
        System.out.println(""); 
        System.out.println("How many Hot Meals would you like?");
        int WarmFood = input.nextInt(); 
        
        System.out.println(""); 
        System.out.println("How many snack packets would you like?"); 
        int Snacks = input.nextInt(); 
        
        System.out.println(""); 
        System.out.println("We already know the email");
        String Name = Email; 
        
        System.out.println(""); 
        Refreshments newRefreshments = new Refreshments(WaterBottles, ColdFood, WarmFood, Snacks, Name); 
        System.out.println(newRefreshments.toString()); 
        System.out.println("This means you are ordering:");
        System.out.println(WaterBottles + " water bottles"); 
        System.out.println(ColdFood + " cold food boxes"); 
        System.out.println(WarmFood + " warm food boxes");
        System.out.println(Snacks + " snack packets");
        System.out.println("Under the email " + Name); 
        System.out.println(""); 
        System.out.println("Is this information correct? Yes or No?");
        String check = input.next();
        
        if(check.equalsIgnoreCase("Yes")){
            System.out.println(""); 
            System.out.println("This information has been added to your booking!"); 
            RefreshmentsList.add(newRefreshments);
            
            //this calls a method that adds this array list to an external file 
            File_Handling_Booking.WriteToFileRefreshmentsList(RefreshmentsList);
            
        }
        else{
            System.out.println("");
            System.out.println("Okay lets try that again");
            adding(); 
        }


        
        
    
}
    
    
    
    
    
    
}
