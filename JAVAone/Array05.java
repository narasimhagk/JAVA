class Arr5{
	public static void main(String[] args){
		int[] a={1,2,3,4,5,6,7,8,9};
		for(int i:a){
			System.out.println(i);
		}
		int[] c=a.clone();
		for(int i:c){
			System.out.println(i);
		}
		System.out.println(a==c);
	}
}