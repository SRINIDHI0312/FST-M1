public class Activity6 {

	public static void main(String[] args) {
		//create object
		Plane plane = new Plane(10);
		
		// Add passengers
        plane.onboard("Alice");
        plane.onboard("Bob");
        plane.onboard("Charlie");
        plane.onboard("David");
        plane.onboard("Sadhik");

	//print Take off time
    System.out.println("Takeoff Time: " + plane.takeOff());

    // Print passengers
    System.out.println("Passengers onboard: " + plane.getPassesngers());
    
 // Simulate flight duration
    try {
        Thread.sleep(5000); // Pause for 5 seconds
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    
    // Land the plane
    plane.land();

    // Print landing time
    System.out.println("Landing Time: " + plane.getLastTimeLanded());
}
}