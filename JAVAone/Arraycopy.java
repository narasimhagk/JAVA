/* class Arraycopy{
	public static void main(String[] args){
		int[] arr1={1,2,3,4,5};
		int[] arr2=new int[arr1.length];
		for(int i=0;i<arr1.length;i++){
			arr2[i]=arr1[i];
		}
		for(int i=0;i<arr1.length;i++){
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		for(int i=0;i<arr2.length;i++){
			System.out.print(arr2[i]+" ");
		}
	}
} */
class Arraycopy{
	public static void main(String[] args){
		int[] a={13,29,35,41,45};
		int[] b=new int[a.length];
		for(int i=0;i<a.length;i++){
		b[i]=a[i];
		}
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]);
		}
		for(int i=0;i<b.length;i++){
			System.out.print(b[i]);
		}
		System.out.println();
	}
}