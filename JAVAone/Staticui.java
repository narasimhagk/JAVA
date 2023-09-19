class Staticui{
	static int i=0;
	Staticui(){
		i++;
		System.out.println(i);
	}
	public static void main(String[] args){
		Staticui c1=new Staticui();
		Staticui c2=new Staticui();
		Staticui c3=new Staticui();
	}
}