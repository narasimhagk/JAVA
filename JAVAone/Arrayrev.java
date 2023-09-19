class Rev{
	public static void main(String[] args){
		int[] a={1,2,3,4,5};
		System.out.println("Original");
		for(int i=0;i<a.length;i++){
		System.out.print("["+a[i]+"]");
		}
		for(int j=a.length-1;j>=0;j--){
			System.out.print("["+a[j]+"]");
		}
		System.out.println("Rev");
	}
}