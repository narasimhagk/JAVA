interface Printt{
	void print();
}
interface Show extends Printt{
	void show();
}
class New implements Show,Printt{
	public void print(){
		System.out.println("T-Rex");
	}
	public void show(){
		System.out.println("Jurassic Park");
	}
}
class TestInterface extends New{
	public static void main(String[] args){
		TestInterface t=new TestInterface();
		t.print();
		t.show();
	}
}