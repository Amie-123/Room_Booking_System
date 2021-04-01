//This will be where the user can add the supplies
//Some supplies will come at a cost

package room_booking_system_long_project;


public class Add_Spplies extends Room_Booking_System_Long_Project{
    
    
    public static void add(){ 
        System.out.println(""); 
        System.out.println("Here we will ask you what supplis you would like to have in the room you have booked");
        System.out.println("If you checked the information page, you will know how mauch each item cost");
        System.out.println("If you didnt, here are the prices:");
        System.out.println("1 Projector = £10.00");
        System.out.println("1 Notebook = £2.00");
        System.out.println("1 laptop = £7.50");
        System.out.println("1 Pen = £0.50"); 
        System.out.println("");
        
        System.out.println("How many projectors do you need?");
        int Projector = input.nextInt(); 
        Cost =  Cost + (Projector * 10); 
        System.out.println("Current price is: £" + Cost); 
        
        System.out.println("");
        System.out.println("How many notebooks do you want?");
        int Notebook = input.nextInt(); 
        Cost = Cost + (Notebook * 2); 
        System.out.println("The Current price is £" + Cost);
        
        System.out.println("");
        System.out.println("How many laptops would you like?");
        int laptop = input.nextInt(); 
        Cost = Cost + (laptop * 7.50); 
        
        System.out.println("");
        System.out.println("How many pens do you need?");
        int Pens = input.nextInt(); 
        Cost = Cost + (Pens * 0.50); 
        
        System.out.println("");
        System.out.println("We already know your email");
        String Name = Email; 
        
        Supplies newSupplies = new Supplies(Projector, Notebook, laptop, Pens, Name); 
        System.out.println("");
        System.out.println(newSupplies.toString());
        System.out.println("This means you are attempting to book:");
        System.out.println(Projector + " projectors");
        System.out.println(Notebook + " notebooks");
        System.out.println(laptop + " laptops");
        System.out.println(Pens + " pens");
        System.out.println("Name of Booking: " + Email); 
        System.out.println("Which all comes to a price of: £" + Cost);
        System.out.println("");
        System.out.println("Is this the correct information?");
        System.out.println("Yes or No");
        String check = input.next();
        if(check.equalsIgnoreCase("No")){
            System.out.println("");
            System.out.println("Okay, lets try again");
            add(); 
        }
        else{
            System.out.println("");
            System.out.println("Great");
            System.out.println("This has been added to the booking!");
            SuppliesList.add(newSupplies); 
            
            //This calls a method which writes the arraylist to an external file:
            File_Handling_Booking.WriteToFileSuppliesList(SuppliesList);
            
        }
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
