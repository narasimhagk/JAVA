class Fact{
	static int m(int n){
		if(n==1){
			return 1;
		}
		else{
			return n*m(n-1);
		}
	}
	public static void main(String[] args){
		System.out.println(m(5));
	}
}