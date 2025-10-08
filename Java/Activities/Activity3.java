

public class Activity3 {
	//Earth year in seconds
	static double EARTHSECONDS = 31557600;
	// Other planet year in seconds
	static double MercurySeconds = 0.2408467;
    static double VenusSeconds   = 0.61519726;
    static double MarsSeconds    = 1.8808158;
    static double JupiterSeconds = 11.862615;
    static double SaturnSeconds  = 29.447498;
    static double UranusSeconds  = 84.016846;
    static double NeptuneSeconds = 164.79132;

//Method to calculate age on a planet
public static double ageOnPlanet(double seconds, double orbitalPeriodInEarthYears) {
    double ageOnEarth = seconds / EARTHSECONDS;
    return ageOnEarth / orbitalPeriodInEarthYears;
    
}
    
public static void main(String[] args) {

//Calculating and printing age on each planet
	
	double seconds = 1000000000;
	
	System.out.println("Age on Earth: " + seconds / EARTHSECONDS);
	System.out.println("Age on Mercury: " + seconds / EARTHSECONDS / MercurySeconds);
	System.out.println("Age on Venus: " + seconds / EARTHSECONDS / VenusSeconds);
    System.out.println("Age on Mars: " + seconds / EARTHSECONDS / MarsSeconds);
    System.out.println("Age on Jupiter: " + seconds / EARTHSECONDS / JupiterSeconds);
    System.out.println("Age on Saturn: " + seconds / EARTHSECONDS / SaturnSeconds);
    System.out.println("Age on Uranus: " + seconds / EARTHSECONDS / UranusSeconds);
    System.out.println("Age on Neptune: " + seconds / EARTHSECONDS / NeptuneSeconds);
	
}
}


