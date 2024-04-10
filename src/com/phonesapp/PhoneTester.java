package com.phonesapp;

import com.phones.brands.Galaxy;
import com.phones.brands.Iphone;

public class PhoneTester {

	public static void main(String[] args) {

		Iphone i11 = new Iphone("11", 5, "Entel", "Opening");
		Galaxy y7 = new Galaxy("Y7", 92, "WOM", "Ese telefono parece carpintero");
		
		i11.displayInfo();
		System.out.println(i11.ring());
		System.out.println(i11.unlock());
		
		y7.displayInfo();
		System.out.println(y7.ring());
		System.out.println(y7.unlock());
		
	}

}
