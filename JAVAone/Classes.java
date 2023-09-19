class Classes{
	int t;
	String s;
}
class Test{
	/* public static void main(String[] args){
		Classes c=new Classes();
		c.t=101;
		c.s="op";
		System.out.println(c.t+" "+c.s);
	} */
	public static void main(String[] args){
		Classes c1=new Classes();
		Classes c2=new Classes();
		Classes c3=new Classes();
		c1.t=001;
		c1.s="Luffy";
		c2.t=002;
		c2.s="Zoro";
		c3.t=003;
		c3.s="Sanji";
		System.out.println(c1.t+" "+c1.s);
		System.out.println(c2.t+" "+c2.s);
		System.out.println(c3.t+" "+c3.s);
	}
}