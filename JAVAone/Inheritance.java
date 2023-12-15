class Inheritance{
	int salary=45000;
}
class Op extends Inheritance{
	int bonus=10000;
	public static void main(String[] args){
		Op o=new Op();
		System.out.println(o.salary);
		System.out.println(o.bonus);
	}
}