class Array7{
	static void min(int[] a){
		int min=a[0];
		int max=a[0];
		for(int i=0;i<a.length;i++){
			if(min>a[i]){
				min=a[i];
			}
		}
		for(int j=0;j<a.length;j++){
			if(max<a[j]){
				max=a[j];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
	public static void main(String[] args){
		int[] a={10,20,30,40};
		min(a);
	}
}