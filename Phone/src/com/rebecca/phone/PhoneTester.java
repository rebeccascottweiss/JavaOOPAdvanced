package com.rebecca.phone;

public class PhoneTester {

	public static void main(String[] args) {
		Galaxy s9 = new Galaxy("S9", 99, "Verizon", "Ring Ring Ring!"); 
		IPhone iphoneTen = new IPhone("X", 100, "AT&T", "Zing"); 
		
		s9.displayInfo(); 
		// print Galaxy S9 from Verizon
		System.out.println(s9.ring());
		// print Galaxy S9 says Ring Ring Ring!
		System.out.println(s9.unlock()); 
		//print Unlocking via finger print
		
		iphoneTen.displayInfo(); 
		//print iPhone X from AT&T
		System.out.println(iphoneTen.ring());
		//print iPhone X says Zing
		System.out.println(iphoneTen.unlock());
		//print Unlocking via facial recognition
	}

}
