//This is where the user can edit the supplies 

package room_booking_system_long_project;

import static room_booking_system_long_project.Room_Booking_System_Long_Project.BookingList;


public class Edit_Supplies extends Room_Booking_System_Long_Project {
    

    public static int searchForEmail(){
        System.out.println(""); 
        System.out.println("Please enter the email address used for the supplies booking:");
        String Name = input.next(); 
        for(int i=0; i<SuppliesList.size(); i++){
            if(Name.equals(SuppliesList.get(i).getName())){
               return i;
            }
        }
        return -1; 
 
    }
    

    public static void edit(){
        int index = searchForEmail(); 
        
        System.out.println(""); 
        if(BookingList.isEmpty()){
            System.out.println("");
            System.out.println("Sorry, but there doesnt seem to be any supply bookings to edit at the moment");
            System.out.println("Make sure that you have booked supplies before trying to edit it!");        
        }
        else{
            System.out.println("");
            System.out.println("You can only edit one piece of information at a time"); 
            System.out.println("Please say what piece of information you would like to edit:");
            System.out.println("1 -- Projector");
            System.out.println("2 -- Notebook");
            System.out.println("3 -- laptop");
            System.out.println("4 -- Pens");
            System.out.println("5 -- Finish editing"); 
            int option = input.nextInt();
            switch(option){
                case 1:
                    System.out.println(""); 
                    System.out.println("Please enter a new amount of Projectors");
                    int newProjectors = input.nextInt(); 
                    SuppliesList.get(index).setProjector(newProjectors);
                    System.out.println("Your Booking has been chnaged and you can see this when you choose to view in main menu");
                    edit(); 
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("Please enter a new amount of Notebooks");
                    int newNotebooks = input.nextInt(); 
                    SuppliesList.get(index).setNotebook(newNotebooks); 
                    System.out.println("Your supplies booking has been chnaged and you can view this in main menu"); 
                    edit(); 
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("Please enter the new amount of laptops");
                    int newlaptops = input.nextInt();
                    SuppliesList.get(index).setLaptop(newlaptops);
                    System.out.println("Your supplies bookign has been changed and you can see this at the main menu");
                    edit();
                    break;
                case 4:
                    System.out.println("");
                    System.out.println("Please enter the new amount of pens needed");
                    int newPens = input.nextInt();
                    SuppliesList.get(index).setPens(newPens);
                    System.out.println("Your supplies bookign has been changed and you can see this at the main menu");
                    edit();
                    break;
                case 5:
                    System.out.println(""); 
                    System.out.println("If you made any changes then these can be seen when you choose to view the booking on main menu");
                    break; 
            }
                    
        }
        
    }
    
    
    
    
    
    
    
    
    
}
