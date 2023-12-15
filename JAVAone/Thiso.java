class Thiso{
	int r;
	Thiso(int r){
		this.r=r;
	}
	Thiso(int r,String name){
		this(r);
		System.out.println(name);
	}
	void display(){
		System.out.println(r);
	}
}
class Test{
	public static void main(String[] args){
		Thiso t=new Thiso(90,"o");
		t.display();
	}
}