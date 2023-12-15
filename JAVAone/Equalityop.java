public class Equalityop{
	public static void main(String[] args){
		System.out.println(10==20);
		System.out.println('a'=='b');
		System.out.println('a'==97.0);
		System.out.println(false==false);
		Thread t1=new Thread();
		Thread t2=new Thread();
		Thread t3=t1;
		System.out.println(t1==t3);
	}
}