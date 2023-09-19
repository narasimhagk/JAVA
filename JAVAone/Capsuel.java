class Hue{
	String s="Icon";
	/* public String getS(){
		return s;
	} */
	public void SetS(String d){
		this.s=d;
	}
}
class I{
	public static void main(String[] args){
		Hue h=new Hue();
		//h.setS("Hi");
		 System.out.println(h.getS());
		 System.out.println(h.s);
	}
}