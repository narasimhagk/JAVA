class Teacher{
	int[] t={1,2,3,4,5};
}
class Student{}
class Z{
	public static void main(String[] args) throws Exception{
		Object ob=Class.forName(args[0]).newInstance();
		System.out.println(ob.getClass().getName());
	}
}