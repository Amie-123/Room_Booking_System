//This is where the user will be able to edit the refreshments booking:

package room_booking_system_long_project;


public class Edit_Refreshments extends Room_Booking_System_Long_Project{
    
    //searches for the email that would allocate a booking 
    public static int searchForEmail(){
        System.out.println("");  
        System.out.println("We need the email used for the refreshments bookings");
        System.out.println("Please enter the email address used for the booking:");
        String Name = input.next(); 
        for(int i=0; i<RefreshmentsList.size(); i++){
            if(Name.equals(RefreshmentsList.get(i).getName())){
               return i;
            }
        }
        return -1; 

    }
    
    
    
    public static void edit(){
        if(RefreshmentsList.isEmpty()){
            System.out.println("");
            System.out.println("Sorry, we dont have any refreshments bookings at this time");
        }
        else{
            int index = searchForEmail(); 
            if(index == -1){
                System.out.println("");
                System.out.println("Sorry, we cannot find the booking that you are looking for!");
                System.out.println("This probably means you types the wrong email in");
                System.out.println("Or it means you havent made a booking with us at all");
                System.out.println("");
            }
            else{
                System.out.println("");
                System.out.println("This is where you will be able to edit the booking you have made");
                System.out.println("You can only edit one piece of information at a time");
                System.out.println("enter the number you want to edit:");
                System.out.println("1 -- water bottles");
                System.out.println("2 -- Cold food");
                System.out.println("3 -- Warm food");
                System.out.println("4 -- Snacks");
                System.out.println("5 -- finsihs editing the booking");
                int option = input.nextInt(); 
                switch(option){
                    case 1:
                        System.out.println("");
                        System.out.println("How many water bottles would you like?");
                        int newWterBottles = input.nextInt(); 
                        RefreshmentsList.get(index).setWaterBottles(newWterBottles); 
                        edit();
                        break;
                    case 2:
                        System.out.println("");
                        System.out.println("How many cold food boxes would you like?");
                        int newColdFood = input.nextInt(); 
                        RefreshmentsList.get(index).setColdFood(newColdFood); 
                        edit();
                        break;
                    case 3:
                        System.out.println("");
                        System.out.println("How many Hot Food boxes would you like?");
                        int newWarmFood = input.nextInt();
                        RefreshmentsList.get(index).setWarmFood(newWarmFood);
                        edit();
                        break;
                    case 4:
                        System.out.println("");
                        System.out.println("How many Snack packets would you like?");
                        int newSnacks = input.nextInt();
                        RefreshmentsList.get(index).setSnacks(newSnacks);
                        edit(); 
                        break;
                    case 5:
                        System.out.println("");
                        System.out.println("You will be able to view all chnages you have made to your booking");
                        System.out.println("You can do this by choosing to view a booking in the main menu section");
                        break; 
                }
            }
        }
        
    }
    
    
    
    
    
}
