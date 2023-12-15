class Objectcl{
	int i;
	String name;
	/* public static void main(String[] args){
		Objectcl p=new Objectcl();
		System.out.println(p.i);
		System.out.println(p.name);
	} */
	//  Initialization through method
	void in(int r,String n){
		i=r;
		name=n;
	}
}
class Test{
	// main method outside the class
	public static void main(String[] args){
		// create multiple objects
		Objectcl p=new Objectcl();
		Objectcl p1=new Objectcl();
		// Initialization through reference
		p.i=3579;
		p.name="So far everything is good";
		p1.in(35790,"So far everything is good");
		System.out.println(p.i);
		System.out.println(p.name);
		System.out.println(p1.i);
		System.out.println(p1.name);
	}
}