package myfirstproject;

public class PenFactory {

	public static void main(String[] args) {

			Pen firstPen = new Pen();
			
			firstPen.colour = "Kırmızı";
			firstPen.height = 10;
			String message = "Yeni kalem olusturuldu.";
			firstPen.writeMessage(message);
			
			
			Pen secondPen = new Pen();

			secondPen.colour = "Mavi";
			secondPen.height = 8;
			secondPen.writeMessage("2. Kalem renk: " + secondPen.colour + " ---" + " 2. Kalem boy: " + secondPen.height);
			
			Car car1 = new Car();
			car1.numberOfSeats = 5; 
			car1.numberOfWheels = 4;
			
			Bicycle bicycle1 = new Bicycle();
			bicycle1.numberOfSeats = 1;
			bicycle1.numberOfWheels = 2;
			
			car1.startMessage("fquery");
			bicycle1.startMessage();
			
			
	}

}
