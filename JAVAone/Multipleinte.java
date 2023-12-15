interface Draw{
	void print();
}
interface Showable{
	void show();
}
class A56 implements Draw,Showable{
	public void print(){
		System.out.println("Drawing");
	}
	public void show(){
		System.out.println("Display");
	}
}
class Test{
	public static void main(String[] args){
		A56 a=new A56();
		a.print();
		a.show();
	}
}