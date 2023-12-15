class Difficulty{
	public static void m1(int... x){
		System.out.println("var-arg method");
	}
public static void main(String[] args){
	m1();
	m1(10);
	m1(10,20,30);
}
}