package eassy;

import java.util.*;

public class  Find_Itinerary_fromTickets{ 
    
    // Method to find the starting city of the journey
    public static String getStart(HashMap<String, String> tick) {
        // Create a reverse map (destination -> source)
        HashMap<String, String> revMap = new HashMap<>();
        
        // Step 1: Fill reverse map
        // Example: "Chennai"->"Bengaluru" becomes "Bengaluru"->"Chennai"
        for(String key : tick.keySet()) {
            revMap.put(tick.get(key), key);
        }
        
        // Step 2: Find the city that is only in 'source' but never in 'destination'
        // That city is the starting city
        for(String key : tick.keySet()) {
            if(!revMap.containsKey(key)) {
                return key;  // Found starting point
            }
        }
        
        return null;  // If no starting city found
    }
    
    public static void main(String[] args) {
        // Step 0: Create the tickets map (source -> destination)
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");
        
        // Step 3: Find starting city using helper function
        String start = getStart(tickets);   // should give "Mumbai"
        
        // Step 4: Traverse the path using the map
        // Keep moving from start to destination until no more tickets
        while(tickets.containsKey(start)) {
            System.out.println(start);      // Print current city
            start = tickets.get(start);     // Move to next city
        }
        
        // Step 5: Print the last destination
        System.out.println(start);  
    }
}
