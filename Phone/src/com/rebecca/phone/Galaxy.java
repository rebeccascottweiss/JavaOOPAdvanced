package com.rebecca.phone;

public class Galaxy extends Phone implements Ringable {

	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String ring() {
		// print Galaxy S9 says Ring Ring Ring!
		return "Galaxy " + this.getVersionNumber() + " says " + this.getRingTone();
	}

	@Override
	public String unlock() {
		//print Unlocking via finger print
		return "Unlocking via finger print";
	}

	@Override
	public void displayInfo() {
		// print Galaxy S9 from Verizon
		System.out.println("Galaxy " + this.getVersionNumber() + " from "+ this.getCarrier()); 

	}

}
