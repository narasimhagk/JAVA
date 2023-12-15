class P{
	static void o(){
		System.out.println("hi");
		o();
	}
	public static void main(String[] args){
		o();
	}
}