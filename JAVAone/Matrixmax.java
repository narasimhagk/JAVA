class Matrixmax{
	public static void main(String[] args){
		int[] a={12,45,675,3434,9};
		int max=a[0];
		for(int i=0;i<a.length;i++){
			if(max<a[i]){
				max=a[i];
			}
		}
		System.out.println(max);
	}
}