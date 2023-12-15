class Arry{
	public static void main(String[] args){
		int[] a={1,2,3,4,4,3,7,2,3,9,6,6,9,0,0,5};
		System.out.println("Duplcate");
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]){
					System.out.println(a[j]);
				}
			}
		}
	}
}