package interfaceJava;

import java.util.Scanner;

public class InterfaceFruit {

	public static void main(String[] args) {
		
		boolean flag = true;
		
		while(flag) {
		
		System.out.println("Meyve total ucret hesaplama programina hosgeldiniz.");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Alisveris yapicaginiz meyveyi seciniz\n1-Elma\n2-Cilek\n3-Muz");
		int choice = scan.nextInt();
		switch(choice) {
		case 1:
			Apple apple1 = new Apple();
			apple1.fruitName();
			System.out.println("Satin almak istediginiz miktari giriniz: ");
			double kgOfFruit = scan.nextDouble();
			apple1.totalKg(kgOfFruit);
			System.out.println("Total ucret: " + apple1.price());
			break;
		case 2:
			Strawberry strawberry1 = new Strawberry();
			strawberry1.fruitName();
			System.out.println("Satın almak istediginiz miktari giriniz: ");
			double kgOfFruit1 = scan.nextDouble();
			strawberry1.totalKg(kgOfFruit1);
			System.out.println("Total ucret: " + strawberry1.price());
			break;
		case 3:
			Banana banana1 = new Banana();
			banana1.fruitName();
			System.out.println("Satın almak istediginiz miktari giriniz: ");
			double kgOfFruit2 = scan.nextDouble();
			banana1.totalKg(kgOfFruit2);
			System.out.println("Total ucret: " + banana1.price());
			break;
		default :
			System.out.println("yanlis bir deger girdiniz.");
			break;
		
		}
		
		System.out.println("Cikmak istiyor iseniz 'X' giriniz.");
		String val1 = scan.next();
		
		if(val1.toLowerCase().charAt(0) == "x".charAt(0)) {
			flag = false;
			System.out.println("Gorusmek uzere..");
		}
		
	}
}


}


interface Ifruit {
	
	void totalKg(double n);
	void fruitName();
	double price();
	
}

class Apple implements Ifruit {
	
	double totalKg;
	double kgPrice = 16;

	@Override
	public void fruitName() {
		System.out.println("Meyve adi : Elma");
	}

	@Override
	public double price() {
		return this.kgPrice * this.totalKg;
	}

	@Override
	public void totalKg(double n) {
		this.totalKg = n;
		
	}
	
	
}

class Strawberry implements Ifruit {
	
	double totalKg;
	double kgPrice = 20;

	@Override
	public void fruitName() {
		System.out.println("Meyve adi : Cilek");
	}

	@Override
	public void totalKg(double n) {
		this.totalKg = n;
		
	}

	@Override
	public double price() {
		return this.kgPrice * this.totalKg;
	}
	
	
}

class Banana implements Ifruit {
	
	double totalKg;
	double kgPrice = 40;

	@Override
	public void fruitName() {
		System.out.println("Meyve adi : Muz");
	}

	@Override
	public void totalKg(double n) {
		this.totalKg = n;
		
	}

	@Override
	public double price() {
		return this.kgPrice * this.totalKg;
	}
	
	
}

	class denemeTahtasi {
		private int myValue = 0;
		void  getValue() {
			
			System.out.println(myValue);
	
		}
	}
	
	class denemelerce{
		
		int myValue = 0;
		denemeTahtasi obj1 = new denemeTahtasi();
		
		int getIt() {
			return myValue;
		}
		
		
	}

