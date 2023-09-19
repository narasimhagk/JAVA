class D{
	//private int num=07;
	//private String name="Zoro";
	private int num;
	private String name;
	public int getNum(){
		return num;
	}
	public void setNum(int i){
		this.num=i;
	}
	public String getName(){
		return name;
	}
	public void setName(String g){
		this.name=g;
	}
}
class Test{
	public static void main(String[] args){
		D f=new D();
		f.setName("Zoro");
		f.setNum(97);
	System.out.println(f.getNum());
	System.out.println(f.getName());
	}
}