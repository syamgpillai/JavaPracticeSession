package OOPConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//static polymorphism or compile-time polymorphism
		BMW obj = new BMW();
		obj.start(); //method overriding. parent class's start() method is overridden by child class's start() method. 
		obj.stop();
		obj.performance();
		obj.refuel();
		obj.engine();
		
		System.out.println("******************");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		
		System.out.println("******************");
		//Top casting
		Car c1 = new BMW(); // dynamic polymorphism or run-time polymorphism
		c1.start();
		c1.refuel();
	}
		
		//Down casting
		BMW b1 = (BMW) new Car(); //this will cause classcastexception
		
	

}
