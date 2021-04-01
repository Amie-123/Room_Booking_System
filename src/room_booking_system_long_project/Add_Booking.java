//This is where the user will add the inforamtion about their booking 
//All this information will be saved into an array list 

package room_booking_system_long_project;


public class Add_Booking extends Room_Booking_System_Long_Project {
    
    //Allocating a room based on capacity of the room: 
    public static void NumberofPeople(){
        System.out.println("");
        System.out.println("How many people would you like to book the room for?");
        int NoofPeople = input.nextInt(); 
    
        if(NoofPeople <= 2){
            System.out.println("");
            System.out.println("Room 1 will work best");
            RoomNo = 1; 
        }
        
        if((NoofPeople > 2) && (NoofPeople <= 4)) {
            System.out.println("");
            System.out.println("Room 2 will work best");
            RoomNo = 2;
        }
        
        if((NoofPeople > 4) && (NoofPeople <= 8)){
            System.out.println("");
            System.out.println("Room 3 will work best");
            RoomNo = 3;
        }
        
        if((NoofPeople > 8) && (NoofPeople <= 15)){
            System.out.println("");
            System.out.println("Room 4 will work best");
            RoomNo = 4; 
        }
        
        if((NoofPeople > 15) && (NoofPeople <= 50)){
            System.out.println("");
            System.out.println("Room 5 will work best");
            RoomNo = 5; 
        }
        
        if(NoofPeople > 50){
            System.out.println("");
            System.out.println("Our Rooms cannot supply this number of people");
            System.out.println("Sorry for any inconvience caused!");
            System.out.println("");
            Booking(); 
        }

        
    }
    
    //Checking for Disabled acsess:
    public static void Disabled(){
        System.out.println("");
        System.out.println("Do you need disabled acsess to your room?");
        System.out.println("Yes or No?");
        String answer = input.next(); 
        
        if(answer.equalsIgnoreCase("Yes")){
            System.out.println("");
            System.out.println("How many people did you need in the room overall?");
            int people = input.nextInt();
            if(people <= 15){
                System.out.println("");
                System.out.println("Room 4 will be best suited for this");
                RoomNo = 4; 
            }
            else{
                System.out.println("");
                System.out.println("Unfortunatly we cannot accomidate this");
                System.out.println("We are sorry for any inconvience caused!");
                System.out.println("");
                Booking(); 
            }
            
        }
        else{
            System.out.println("");
            System.out.println("Okay!");
            System.out.println("");
        }
          
        
    }
    
    
    
    //Actually getting the user to input the information:
    public static void adding(){
        System.out.println("");
        System.out.println("What month would you like to book for?");
        String Month = input.next(); 
        
        if(((Month.equalsIgnoreCase("January")) || (Month.equalsIgnoreCase("February")) || (Month.equalsIgnoreCase("March")))){
            System.out.println("");
            System.out.println("You are no longer allowed to book these months!");
            adding(); 
        }
        
      
        
        System.out.println("");
        System.out.println("What date would you like to book?");
        int Date = input.nextInt(); 
        
        if((((Month.equalsIgnoreCase("September")) || (Month.equalsIgnoreCase("April")) || (Month.equalsIgnoreCase("June")) || (Month.equalsIgnoreCase("November"))))){
            if(Date > 30){
                System.out.println("");
                System.out.println("These Months only have 30 days!");
                adding(); 
            }
        }
        if(((((Month.equalsIgnoreCase("may")) || (Month.equalsIgnoreCase("july")) || (Month.equalsIgnoreCase("august")) || (Month.equalsIgnoreCase("October")) || (Month.equalsIgnoreCase("December")))))){
            if(Date > 31){
                System.out.println("");
                System.out.println("These Months only have 31 days!");
                adding(); 
            }
        }
        
        

        
        System.out.println("");
        System.out.println("This is where you book you time slot");
        System.out.println("We run room times every hour");
        System.out.println("This meaning you can only book a room every hour");
        System.out.println("Each room takes half an hour to clean after use");
        System.out.println("You can attempt to book the following slots:");
        System.out.println("1: 9:00 - 10:00");
        System.out.println("2: 10:30 - 11:30");
        System.out.println("3: 12:00 - 13:00");
        System.out.println("4: 13:30 - 14:30");
        System.out.println("5: 15:00 - 16:00");
        System.out.println("Please select a number");
        int Time = input.nextInt();
        
        
        System.out.println("");
        System.out.println("We have already established your room number");
        System.out.println(RoomNo);
        int RoomNumber = RoomNo; 
        
        System.out.println("");
        System.out.println("All we need now is your email which you have already given");
        System.out.println(Email);
        String Name = Email; 
        
        Room newRoom = new Room(Month, Date, Time, RoomNumber, Name);
        System.out.println("");
        System.out.println(newRoom.toString());
        System.out.println("This means you are attempting to book:");
        System.out.println("Month: " + Month);
        System.out.println("Date: " + Date);
        if(Time == 1){
            System.out.println("Time Slot Number 1: 9:00 -- 10:00" );
        }
        if(Time == 2){
            System.out.println("Time Slot Number 2: 10:30 -- 11:30" );
        }
        if(Time == 3){
            System.out.println("Time Slot Number 3: 12:00 -- 13:00" );
        }
        if(Time == 4){
            System.out.println("Time Slot Number 4: 13:30 -- 14:30" );
        }
        if(Time == 5){
            System.out.println("Time Slot Number 5: 15:00 -- 16:00" );
        }
        System.out.println("Room Number: " + RoomNumber);
        System.out.println("Name Booking is Under: " + Name);
        System.out.println(""); 
        System.out.println("Is this information correct? Yes or No?");
        String check1 = input.next();
        if(check1.equalsIgnoreCase("Yes")){
            BookingList.add(newRoom);
            System.out.println("");
            System.out.println("Great!");        
            System.out.println("We will see what we can do!");
            System.out.println("");

            //ADD THE CHEKCING WHEN THIS COMES INTO IT 

            //this calls a method that allows there booking arraylist to be added to an external file:
            File_Handling_Booking.WriteToFileBookingList(BookingList);
          
        }
        else{
            System.out.println("");
            System.out.println("Lets try again shall we?!");
            Booking(); 
        }
        
        
        
        

        
    }
    
    
    
    
    
    
    
    
    
    
    
}
