package com.phones.brands;

import com.phones.Phone;
import com.phones.Ringable;

public class Iphone extends Phone implements Ringable{

	public Iphone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}

	@Override
	public String ring() {
		return "Iphone " + super.getVersionNumber() + " is ringing: " + super.getRingTone();
	}

	@Override
	public String unlock() {
		return "Iphone unlocked";
	}

	@Override
	public void displayInfo() {
		 System.out.println("Iphone " + super.getVersionNumber() + " from: " + super.getCarrier() + ", battery at " + super.getBatteryPercentage() + "%");
	}
	
}
