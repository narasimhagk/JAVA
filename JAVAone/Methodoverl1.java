// Method Overloading with Type Promotion if matching found
class Methodoverl1{
	void sum(int a,long b){
		System.out.println(a+" "+b);
	}
	void sum(long a,int b){
		System.out.println(a+" "+b);
	}
	public static void main(String[] args){
		Methodoverl1 o=new Methodoverl1();
		o.sum(20,30);
	}
}