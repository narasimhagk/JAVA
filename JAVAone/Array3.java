class Array3{
	static void min(int arr[]){
		int min=arr[1];
		for(int i=1;i<arr.length;i++)
			if(min>arr[i])
			min=arr[i];
			System.out.println(min);
	}
	public static void main(String[] args){
		int[] a={3,4,5};
		min(a);
	}
}