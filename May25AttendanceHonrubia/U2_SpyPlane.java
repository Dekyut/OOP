package may22attendance;

public class U2_SpyPlane extends Vehicle {
	
	 int WingSpan = 103;
		
		void Fly() {
			System.out.println("The Plane is flying");
		}
		
		@Override
		void Stop() {
			System.out.println("Override Method");
			super.Stop();
		}

}
