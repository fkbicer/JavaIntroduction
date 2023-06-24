package interfaceJava;

import accessModifiers.Test;

public class OutsideAccessTest extends Test {

	public static void main(String[] args) {

		Test obj = new Test();
		
		OutsideAccessTest obj2 = new OutsideAccessTest();
		
		 System.out.println(obj2.protected_val);
		
		
	}

}

class notExtended extends Test {
	
	String accObj;

	
	String newMeth() {
		
		Test obj1 = new Test();
		return obj1.public_val;
	}
	


	
	
}
