interface Draw{
	void draw();
	default void msg(){
		System.out.println("Default Mode");
     }
}
	class Rectangle implements Draw{
		public void draw(){
			System.out.println("drawing rectangle");
		}
}

class Test{
	public static void main(String[] args){
		Draw d=new Rectangle();
		d.draw();
		d.msg();
	}
}