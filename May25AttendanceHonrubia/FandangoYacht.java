package may22attendance;

public class FandangoYacht extends Vehicle {
	
	String MainSail = "Blue";
	
	void Float() {
		System.out.println("The Boat is sailing");
	}
	
	@Override
	void Stop() {
		System.out.println("Override Method");
		super.Stop();
	}

}
