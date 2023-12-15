class Primegiven{
	public static void main(String[] args){
		int i=2,l=15;
		for(int n=i;n<=l;n++){
			if(isPrime(n)){
				System.out.println(n);
			}
		}
	}
	static boolean isPrime(int o){
		//int count=0;
		/* if(o<2){
			return false;
		} */
		for(int i=2;i<o/2;i++){
			if(o%i==0){
				return false;
			}
		}
		return true;
	}
}