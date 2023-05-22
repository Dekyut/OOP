package may22attendance;

public class TEST {
	
	public static void main(String[] args) {
		
		FandangoYacht FYacht = new FandangoYacht();
		
		System.out.println("Speed: " + FYacht.Speed + " MPH");
		System.out.println("Color: " + FYacht.Color);
		System.out.println("Price: " + FYacht.Price);
		System.out.println("Main Sail Color: " + FYacht.MainSail);
		
		FYacht.Float();
		FYacht.Stop();
	}

}
