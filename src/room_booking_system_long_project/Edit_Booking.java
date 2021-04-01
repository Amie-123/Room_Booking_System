//This is where a user can edit the booking that they have made 
//They will need to enter the email address before they can edit a booking 

package room_booking_system_long_project;

import static room_booking_system_long_project.Room_Booking_System_Long_Project.BookingList;


public class Edit_Booking extends Room_Booking_System_Long_Project {

    public static void edit(){
        if(BookingList.isEmpty()){
            System.out.println("");
            System.out.println("Sorry, but there doesnt seem to be any bookings to edit at the moment");
            System.out.println("Make sure that you have booked a room before trying to edit it!");        
        }
        else{
            int index = searchForEmail();
            
            if(index == -1){
                System.out.println("");
                System.out.println("Sorry but there is no booking under this email");
                System.out.println("Please try again!");
                System.out.println("");
            }
            else{
                System.out.println("You can only edit one piece of information at a time");
                System.out.println("You can also only edit the time of the booking, as room number is allocated to you"); 
                System.out.println("Please say what piece of information you would like to edit:");
                System.out.println("1 -- Month");
                System.out.println("2 -- Date");
                System.out.println("3 -- Time");
                System.out.println("4 -- Finish editing"); 
                int option = input.nextInt(); 
                switch(option){
                    case 1:
                        System.out.println("");
                        System.out.println("Please enter a new Month for booking:");
                        String newMonth = input.next();
                        if(((newMonth.equalsIgnoreCase("January")) || (newMonth.equalsIgnoreCase("February")) || (newMonth.equalsIgnoreCase("March")))){
                            System.out.println("You can no longer book these months!");
                            edit(); 
                        }
                        else{
                            BookingList.get(index).setMonth(newMonth);
                            System.out.println("Your Booking has been changed, you can see this when you try and view the Booking on the Home Page"); 
                        }
                        edit(); 
                        break;
                    case 2: 
                        newMonth = ""; 
                        System.out.println(""); 
                        System.out.println("Please enter a new date for the booking");
                        int newDate = input.nextInt(); 
                        if((((newMonth.equalsIgnoreCase("April")) || (newMonth.equalsIgnoreCase("September")) || (newMonth.equalsIgnoreCase("June")) || (newMonth.equalsIgnoreCase("November"))))){
                            if(newDate > 30){
                                System.out.println("These months only have 30 days!"); 
                                edit(); 
                            }
                            if(((((newMonth.equalsIgnoreCase("may")) || (newMonth.equalsIgnoreCase("july")) || (newMonth.equalsIgnoreCase("august")) || (newMonth.equalsIgnoreCase("October")) || (newMonth.equalsIgnoreCase("December")))))){
                                if(newDate > 31){
                                    System.out.println("These months only have 31 days!");
                                    edit();         
                                }
                            }
                            else{
                                BookingList.get(index).setDate(newDate);
                                System.out.println("Your Booking has been chnaged, you can see this when you choose to view book in main menu");
                            }
                        }
                        edit(); 
                        break;
                    case 3: 
                        System.out.println("");
                        System.out.println("Please enter the new time slot for the booking"); 
                        System.out.println("1: 9:00 - 10:00");
                        System.out.println("2: 10:30 - 11:30");
                        System.out.println("3: 12:00 - 13:00");
                        System.out.println("4: 13:30 - 14:30");
                        System.out.println("5: 15:00 - 16:00");
                        int newTime = input.nextInt(); 
                        BookingList.get(index).setTime(newTime); 
                        System.out.println("Your Boking has been chnaged, you can see this when you choose to view booking in main menu");
                        edit(); 
                        break; 
                    case 4:
                        System.out.println("");
                        System.out.println("If you made any changes you can view these when you choose to view the booking");
                        break; 
                }
                
                
                
            }
        }
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    //searches for the email that would allocate a booking 
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
