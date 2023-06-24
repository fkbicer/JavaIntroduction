package interfaceJava;

import java.util.Scanner;

public class InterfaceDeneme {

	public static void main(String[] args) {
		
		phoneBrand obj1 = new phoneBrand();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen markayi giriniz : ");
		
		String n = scan.nextLine();
		obj1.getBrand(n);
		
		

	}

}

interface phone {
	
	void getBrand(String n);
	
}

class phoneBrand implements phone {

	@Override
	public void getBrand(String n) {
		System.out.println("Telefon markasi: " + n);
		
	}
	
	
}
