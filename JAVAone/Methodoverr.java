class Vehicle{
	void run(){
		System.out.println("Vechile is Running...");
	}
}
class Bike extends Vehicle{
	void run(){
		System.out.println("Bike is Running...");
	}
	public static void main(String[] args){
		Bike o =new Bike();
		o.run();
	}
}