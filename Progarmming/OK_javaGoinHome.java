import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;


public class OK_javaGoinHome {

	public static void main(String[] args) {
		
		String id = "JAVA APT 507";
		
		// Elevator call
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		
		// Security off
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		Security mySecurity1 = new Security(id);
		mySecurity1.on();
		
		
		// Light on
		Lighting hallLamp = new Lighting(id+" / Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(id+" floor Lamp");
		floorLamp.on();
		
		
	}

}
