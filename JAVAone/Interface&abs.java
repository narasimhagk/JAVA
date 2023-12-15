interface A{
	void a();
	void b();
	void c();
	void d();
}
abstract class B implements A{
	public void c(){
		System.out.println("AIOUGJHDYr");
		public void a(){System.out.println("kjikhbjjh");}
	public void b(){System.out.println("kjdhfgh");}
	public void d(){System.out.println("kjihggfgtjjh");}
	}
}
/* class M extends B{
	
} */
class Test{
	public static void main(String[] args){
		A a=new B();
		a.a();
		a.b();
		a.c();
		a.d();
	}
}