//To be able to check whether a room has been booked for a certain time or date, you have to save the info somewhere
//Saving the info to an external document will allow you too look through the document 
//this means you can check that there is no double bookings 

package room_booking_system_long_project;

import java.io.BufferedReader; 
import java.io.FileReader;
import java.io.FileWriter; 
import java.io.PrintWriter;
import java.util.ArrayList;

public class File_Handling_Booking extends Room_Booking_System_Long_Project { 
    
    public static String folderDirectory = System.getProperty("user.dir") + "\\Bookings.txt";
    public static String folderDirectory2 = System.getProperty("user.dir") + "\\Supplies.txt"; 
    public static String folderDirectory3 = System.getProperty("user.dir") + "\\Refreshments.txt"; 
    
    
    public static void WriteToFileBookingList(ArrayList<Room> BookingList){
        try{
            FileWriter writeToFile = new FileWriter(folderDirectory, false);
            PrintWriter printToFile = new PrintWriter(writeToFile);
            for(int i = 0; i < BookingList.size(); i++){
                printToFile.println(BookingList.get(i).toString()); 
            }
            printToFile.close();
            writeToFile.close();
        }catch(Exception e){
            System.out.println("Error: " + e); 
        }
  
    }
    
   
    public static void WriteToFileSuppliesList(ArrayList<Supplies> SuppliesList){
        try{
            FileWriter writeToFile = new FileWriter(folderDirectory2, false);
            PrintWriter printToFile = new PrintWriter(writeToFile);
            for(int i = 0; i < SuppliesList.size(); i++){
                printToFile.println(SuppliesList.get(i).toString()); 
            }
            printToFile.close();
            writeToFile.close();
        }catch(Exception e){
            System.out.println("Error: " + e); 
        }
    }
    
    
    
    
    public static void WriteToFileRefreshmentsList(ArrayList<Refreshments> RefreshmentsList){
        try{
            FileWriter writeToFile = new FileWriter(folderDirectory3, false);
            PrintWriter printToFile = new PrintWriter(writeToFile);
            for(int i = 0; i < RefreshmentsList.size(); i++){
                printToFile.println(RefreshmentsList.get(i).toString()); 
            }
            printToFile.close();
            writeToFile.close();
        }catch(Exception e){
            System.out.println("Error: " + e); 
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
