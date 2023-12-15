class Array{
	/* public static void main(String[] args){
	int[] a=new int[]{1,2,3,4,2,5,6,7,3,5};
	for(int i=0;i<a.length;i++){
		for(int j=i+1;j<a.length;j++){
		if(a[i]==a[j]){
			System.out.println(a[j]);
		}
		}
	}
	
	} */
	
	
	
	public static void main(String[] args){
		int i=0, j,dup=0;
		int[] a={1,2,2,3,4,4,5,6,6};
		while(i<a.length){
			j=i+1;
			while(j<a.length)
			{
				if(a[i]==a[j]){
					i++;
					break;
				}
				j++;
			}
			i++;
		}
		System.out.println("total number of duplicates="+a);
	}
}
