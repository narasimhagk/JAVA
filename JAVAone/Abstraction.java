abstract class A{
	abstract void run();
}
class B extends A{
	void run(){
		System.out.println("ji");
	}
	public static void main(String[] args){
		A c=new B();
	    c.run();
	}
}