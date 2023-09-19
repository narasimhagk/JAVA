class Invoke{
	int t;
	String s;
	void Insert(int r,String o){
		t=r;
		s=o;
		System.out.println(t+" "+s);

	}
	/* void display(){
		System.out.println(t+" "+s);
	} */
}
class Test{
	public static void main(String[] args){
		Invoke v=new Invoke();
		v .Insert(1,"One Piece");
}
}
