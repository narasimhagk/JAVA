class Cold{
	public static void main(String[] args){
		int n=10;
		int sum=0;
		System.out.println(sum(n));
	}
	public static int sum(int n){
		if(n>0){
			return n+sum(n-1);
		}
		else{
			return n;
		}
	}
}