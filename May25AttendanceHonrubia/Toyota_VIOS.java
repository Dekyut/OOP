package may22attendance;

public class Toyota_VIOS extends Vehicle {
	
    String TireType = "All Season Tire";
	
	void Drive() {
		System.out.println("The Car is accelerating");
	}
	
	@Override
	void Stop() {
		System.out.println("Override Method");
		super.Stop();
	}

}
