package javaBasic;

public class LedTV implements TV {

	@Override
	public void trunOn() {
		// TODO Auto-generated method stub
		System.out.println("turnOn");

	}

	@Override
	public void trunOff() {
		// TODO Auto-generated method stub
		System.out.println("trunOff");
	}

	@Override
	public void changeVolume(int volume) {
		// TODO Auto-generated method stub
		System.out.println("changeVolume");
	}

	@Override
	public void changeChannel(int channel) {
		// TODO Auto-generated method stub
		System.out.println("changeChannel");
	}

}
