package _mission.Ex17;

public class Driver {

	public static void main(String[] args) {
		
		// RcCar
		RemoteControl RcCar1 = new RcCar();
		RcCar1.on();
		RcCar1.setSpeed(100);
		RcCar1.off();
		System.out.println();
		RcCar1.changeBattery();
		System.out.println();
		
		// Drone
		RemoteControl Drone1 = new Drone();
		Drone1.on();
		Drone1.setSpeed(250);
		Drone1.setSpeed(50);
		Drone1.changeBattery();
		Drone1.off();
		System.out.println();
	}
}
