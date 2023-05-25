package may22attendance;

public class TEST {
	
	public static void main(String[] args) {
		Toyota_VIOS TCar = new Toyota_VIOS();
		
		System.out.println("Toyota-VIOS:");
		System.out.println("Speed: " + TCar.ToyotaSpeed + " MPH");
		System.out.println("Color: " + TCar.ToyotaColor);
		System.out.println("Price: " + TCar.ToyotaPrice);
		System.out.println("Tire Type: " + TCar.TireType);
		
		TCar.Drive();
		TCar.Stop();
		
		U2_SpyPlane UPlane = new U2_SpyPlane();
		
		System.out.println("");
		System.out.println("U-2 Spy Plane:");
		System.out.println("Speed: " + UPlane.PlaneSpeed + " KM/H");
		System.out.println("Color: " + UPlane.PlaneColor);
		System.out.println("Price: " + UPlane.PlanePrice);
		System.out.println("Wing Span: " + UPlane.WingSpan + " Feet");
		
		UPlane.Fly();
		UPlane.Stop();
		
		FandangoYacht FYacht = new FandangoYacht();
		
		System.out.println("");
		System.out.println("Fandango Yacht:");
		System.out.println("Speed: " + FYacht.YachtSpeed + " MPH");
		System.out.println("Color: " + FYacht.YachtColor);
		System.out.println("Price: " + FYacht.YachtPrice);
		System.out.println("Main Sail Color: " + FYacht.MainSail);
		
		FYacht.Float();
		FYacht.Stop();
	}
	    
	    

}
