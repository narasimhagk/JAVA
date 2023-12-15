package  JProgrammer;
class Evenorodd {
	public static void main(String[] args) {
		int c = 4;
		/* if(c%2==0){
			System.out.println("Even");
		}
		else{
			System.out.println("odd");
		} */
/* 		for(int i=0;i<=20;i++){
			if(i%2==1){
				System.out.println(i);
			}
		} */
		String x = (c % 2 == 0) ? "Even" : "odd";
		System.out.println(x);

	}
}