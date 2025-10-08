import java.util.ArrayList;

public class Activity9 {

	public static void main(String[] args) {
		
		// Create an HashSet
		ArrayList<String> myList = new ArrayList<>();
		
		// Add 5 names
		myList.add("Srinidhi");
        myList.add("Venkatesh");
        myList.add("Thanuja");
        myList.add("Moorthi");
        myList.add("Selvi");
        
     // Print all names using a for loop
        System.out.println("Names in the list: ");
        
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
	}
    
     // Use get() method to retrieve the 3rd name
        String thirdName = myList.get(2);
        System.out.println("\nThe 3rd name in the list is: " + thirdName);

     // Use contains() to check if "Venkatesh" exists in the list
        boolean hasVenkatesh = myList.contains("Venkatesh");
        System.out.println("\nIs 'Venkatesh' in the list? " + hasVenkatesh);

    // Use size() to print the number of names
        System.out.println("\nNumber of names in the list: " + myList.size());
        
    // Use remove() to remove "Srindhi" and print size again
        myList.remove("Srinidhi");
        System.out.println("\nRemoved 'Srinidhi' from the list.");
        System.out.println("New number of names in the list: " + myList.size());
	}
}