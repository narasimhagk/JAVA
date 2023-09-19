class Primewhile{
	public static void main(String[] args){
		int num=7;
		int count=0;
		int i=1;
		while(i<num){
			i++;
			if(num%i==0){
				count++;
			}
		}
		if(count==2){
			System.out.println("prime");
		}
		else{
			System.out.println("not");
		}
	}
}