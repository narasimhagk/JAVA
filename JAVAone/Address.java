class Address{
	String city="city a";
	String state="state a";
	String country="Japan";
}
class Emp{
	String name="Zoro";
	int id=001;
	public static void main(String[] args){
		Address a=new Address();
		Emp e=new Emp();
		System.out.println(e.name+" "+e.id);
		System.out.println(a.city+" "+a.state+" "+a.country);
	}
}