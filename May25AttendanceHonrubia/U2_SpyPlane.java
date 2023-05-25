package may22attendance;

//This class extends from the Vehicle class in order for the method Stop() to work and print
//whatever the method Stop() in the Vehicle class have inside.

public class U2_SpyPlane extends Vehicle {
	
	 int WingSpan = 103;
		
		void Fly() {
			System.out.println("The Plane is flying");
		}
		
		//Here we Override the Stop() method in order for it to print the said method from the Vehicle Class
		@Override
		void Stop() {
			super.Stop();
		}

}
