class This{
	void m()
	{
		System.out.println("Hello");
	}
	void n(){
		System.out.println("Hello n");
		this.m();
	}
}
class Test{
	public static void main(String[] args){
		This a=new This();
		a.n();
	}
}