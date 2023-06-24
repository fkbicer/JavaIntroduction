package interfaceJava;

public class InterfaceAbstract {

	public static void main(String[] args) {
		
		Human human1 = new Human(160, 60);
		
		System.out.println(human1.heightM());
		System.out.println(human1.heightKm());
		
		Build build1 = new Build();
		System.out.println(build1.heightCm());
		System.out.println(build1.heightM());
		System.out.println(build1.heightKm());
		

	}

}

interface IHeight{
	
	 int value = 0;
	 static String definition() {
		 return "Bu bir interface, boy bilgilerini görmeyi garantiler";
	 }
	 int heightCm();
	 double heightM();
	 
	 default double heightKm() {
		 	return 0;
	 }

}


abstract class Animal implements IHeight {
	
	private int height;
	private double weight;
	public abstract boolean isAlive();
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public double getWeight() {
		
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
}
	class Human extends Animal {
		
		public Human(int height, double weight) {
			this.setHeight(height);
			this.setWeight(weight);
		}

		@Override
		public int heightCm() {
			return this.getHeight();
		}

		@Override
		public double heightM() { 
			return this.getHeight()/100.0;
		}

		@Override
		public boolean isAlive() {
			return true;
		}
		
	}
	
	class Build implements IHeight {

		@Override
		public int heightCm() {
			// TODO Auto-generated method stub
			return 200000;
		}

		@Override
		public double heightM() {
			// TODO Auto-generated method stub
			return 2000;
		}
		
		public double heightKm() {
			return 2;
		}
		
		
		
	}
	
