package _mission.Ex17;

public class RcCar implements RemoteControl {
	
	double speed;
	double battery;

	@Override
	public void on() {
		System.out.println("전원 on");
	}

	@Override
	public void off() {
		System.out.print("전원 off");
	}

	@Override
	public void setSpeed(int speed) {
		if( speed > RemoteControl.MAX_SPEED ) {
			this.speed = RemoteControl.MAX_SPEED;
		}
		else if( speed < RemoteControl.MIN_SPEED ) {
			this.speed = RemoteControl.MIN_SPEED;
		}
		else {
			this.speed = speed;
		}
		System.out.println("현재 속도 : " + this.speed);
	}

	@Override
	public void changeBattery() {
		System.out.println("배터리 교환");
	}
}
