package may22attendance;

//This class extends from the Vehicle class in order for the method Stop() to work and print
//whatever the method Stop() in the Vehicle class have inside.

public class Toyota_VIOS extends Vehicle {
	
    String TireType = "All Season Tire";
	
	void Drive() {
		System.out.println("The Car is accelerating");
	}
	
	//Here we Override the Stop() method in order for it to print the said method from the Vehicle Class
	@Override
	void Stop() {
		super.Stop();
	}

}
