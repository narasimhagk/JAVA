abstract class Bike{
	Bike(){
		System.out.println("OOreaoo");
	}
	abstract void run();
	void engine(){
		System.out.println("Engine is Working");
	}
}
class Honda extends Bike{
	void run(){
		System.out.println("idfhgerksjev");
	}
	public static void main(String[] args){
		Bike a=new Honda();
		a.run();
		a.engine();
	}
}