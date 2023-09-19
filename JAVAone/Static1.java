class Static1{
	int roll;
	String name;
	static String college="ITS";
	Static1(int r,String n){
		roll=r;
		name=n;
		System.out.println(roll+" "+name+" "+college);
	}
}
class Test{
	public static void main(String[] args){
		Static1 s=new Static1(79,"mean");
	}
}