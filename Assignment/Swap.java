class Swap{
	public static void i(int a,int b){
		int temp=a;
	a=b;
	b=temp;
	        System.out.printf("Numbers after swapping (with temp): %d %d%n", a, b);

	}
	public static void h(int a,int b){
		b=b+a;
		a=b-a;
		b=b-a;
	}
	public static void main(String[] args){
		int a=10;
		int b=20;
		        System.out.printf("Original numbers: %d %d%n", a, b);


		i(a,b);
		h(a,b);
		        System.out.printf("Original numbers after swap: %d %d%n", a, b);

	}
}