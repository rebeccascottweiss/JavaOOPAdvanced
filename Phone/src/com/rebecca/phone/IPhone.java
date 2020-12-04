package com.rebecca.phone;

public class IPhone extends Phone implements Ringable {

	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String ring() {
		//print iPhone X says Zing
		return "iPhone " + this.getVersionNumber() + " says " + this.getRingTone();
	}

	@Override
	public String unlock() {
		//print Unlocking via facial recognition
		return "Unlocking via facial recognition";
	}

	@Override
	public void displayInfo() {
		//print iPhone X from AT&T
		System.out.println("iPhone "+this.getVersionNumber() + " from " + this.getCarrier());

	}

}
