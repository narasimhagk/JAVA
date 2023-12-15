class Staticvar{
	static int x=10;
	int y=101;
	public static void main(String[] args){
		Staticvar s=new Staticvar();
		s.x=999;
		s.y=989;
		System.out.println(s.x+" "+s.y);
		Staticvar s2=new Staticvar();
		System.out.println(s2.x+" "+s2.y);
		s2.y=90;
		System.out.println(s2.x+" "+s2.y);		
	}
}