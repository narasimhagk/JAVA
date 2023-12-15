class Array5{
	public static void print(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args){
		print(new int[]{10,20,30,40});
	}
}