class G{
	void run(){
		System.out.println("Run");
	}
}
class H{
	void run(){
		System.out.println("Running");
	}
}
class P{
	public static void main(String[] args){
		G h=new G();
		h.run();
		H j=new H();
		j.run();
	}
}