import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
	
		// Create an HashSet
				HashSet<String> hs = new HashSet<>();
		
		//add 6 objects
		hs.add("Apple");
		hs.add("Banana");
		hs.add("Cherry");
		hs.add("Date");
		hs.add("Elderberry");
		hs.add("Fig");
		
		// Use size() to print the number of names
        System.out.println("\nNumber of fruits in the list: " + hs.size());
        
       // Use remove() to remove "Elderberry" and print size again
        hs.remove("Elderberry");
        System.out.println("\nRemoved 'Elderberry' from the HashSet.");
       
       // Use remove() to remove "Grapes" and print size again
        System.out.println("Removing Grapes from HashSet: " + hs.remove("Grapes"));
        if (hs.remove("Grapes")){
        	System.out.println("Grapes removed from the Set");
        }
        	else {
        		System.out.println("Grapes is not present in the Set");
        }
        
       // Use contains() to check if "Mango" exists in the list
        boolean hasMango = hs.contains("Mango");
        System.out.println("\nIs 'Apple' in the list? " + hasMango);
        
      //Print updated HashSet
        System.out.println("Updated HashSet: " + hs);
	}

}