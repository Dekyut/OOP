package may22attendance;

//This class extends from the Vehicle class in order for the method Stop() to work and print
//whatever the method Stop() in the Vehicle class have inside.

public class FandangoYacht extends Vehicle {
	
	String MainSail = "Blue";
	
	void Float() {
		System.out.println("The Boat is sailing");
	}
	
	//Here we Override the Stop() method in order for it to print the said method from the Vehicle Class
	@Override
	void Stop() {
		super.Stop();
	}

}
