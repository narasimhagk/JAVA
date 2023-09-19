class Re{
	static int n=0;
	static void method(){
		n++;
		if(n<=5){
			System.out.println("hello"+n);
			method();
		}
	}
	public static void main(String[] args){
		method();
	}
}