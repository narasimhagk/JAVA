// Passing object 
class Call{
	int data=50;
	void change(Call c){
		c.data=c.data+100;
	}
	public static void main(String[] args){
		Call c=new Call();
		System.out.println(c.data);
		c.change(c);
		System.out.println(c.data);
	}
}