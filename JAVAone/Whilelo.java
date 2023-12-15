/* public class Whilelo{
	public static void main(String[] args){
		int s=0;
		while(s<=5){
			s++;
			int j=0;
			while(j<=s){
				j++;
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
} */
// Java program to demonstrate forName() method

public class Whilelo {
	public static void main(String[] args)
		//throws ClassNotFoundException
	{
		// get the Class instance using forName method
		Whilelo c1 = new Whilelo();

		System.out.print("Class represented by c1: "
						+ c1.toString());
	}
}
class Whileloo{
	public static void main(String[] args){
		Whileloo w=new Whileloo();
		System.out.println(w);
	}
}