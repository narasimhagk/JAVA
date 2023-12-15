class Bird{
	public static void m(String[] args){
	Bird b=new Bird();
	}
}
class Ego extends Bird{
	
}
class Myobj{
	public static void main(String[] args){
		// Thread t =new Thread();
		/* System.out.println(t instanceof String);    Error incompatible */
		/* System.out.println(t instanceof Object);
		System.out.println(null instanceof Object);
		System.out.println(null instanceof String); */
		// Myobj o=new Myobj();
		Ego e =null;
		System.out.println(e  instanceof Ego);
	}
}