package accessModifiers;

public class AccessTest {

	public static void main(String[] args) {
		
		Test testObj = new Test();
		
		System.out.println("Accessible variables;\n\n1-" + testObj.default_val + "\n2-" + testObj.protected_val + "\n3-" + testObj.public_val);

	}

}
