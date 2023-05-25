package may22attendance;

//This class has prints out all the information that is present in the other classes.

public class TEST {
	
	public static void main(String[] args) {
		//This Prints out info from the Toyota_VIOS Class
		Toyota_VIOS TCar = new Toyota_VIOS();
		
		System.out.println("Toyota-VIOS:");
		System.out.println("Speed: " + TCar.ToyotaSpeed + " MPH");
		System.out.println("Color: " + TCar.ToyotaColor);
		System.out.println("Price: " + TCar.ToyotaPrice);
		System.out.println("Tire Type: " + TCar.TireType);
		
		//These will print out the information available in the specific methods used for the Toyota_VIOS class.
		TCar.Drive();
		TCar.Stop();
		
		
		//This prints out info from the U2_SpyPlane Class
		U2_SpyPlane UPlane = new U2_SpyPlane();
		
		System.out.println("");
		System.out.println("U-2 Spy Plane:");
		System.out.println("Speed: " + UPlane.PlaneSpeed + " KM/H");
		System.out.println("Color: " + UPlane.PlaneColor);
		System.out.println("Price: " + UPlane.PlanePrice);
		System.out.println("Wing Span: " + UPlane.WingSpan + " Feet");
		
		//These will print out the information available in the specific methods used for the U2_SpyPlane class.
		UPlane.Fly();
		UPlane.Stop();
		
		//This prints out info from the FandangoYacht Class
		FandangoYacht FYacht = new FandangoYacht();
		
		System.out.println("");
		System.out.println("Fandango Yacht:");
		System.out.println("Speed: " + FYacht.YachtSpeed + " MPH");
		System.out.println("Color: " + FYacht.YachtColor);
		System.out.println("Price: " + FYacht.YachtPrice);
		System.out.println("Main Sail Color: " + FYacht.MainSail);
		
		//These will print out the information available in the specific methods used for the FandangoYacht class.
		FYacht.Float();
		FYacht.Stop();
	}
	    
	    

}
