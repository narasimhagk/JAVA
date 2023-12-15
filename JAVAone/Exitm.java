class Exitm{
	public static void exa(int[] array1){
		for(int i=0;i<array1.length;i++){
			if(i>4){
				System.out.println("Stop Array");
				System.exit(1);
			}
			System.out.println("A"+i+"e"+array1[i]);
		}
	}
	public static void main(String[] args){
		int[] array1={1,2,3,4,5,6,7};
		exa(array1);
	}
}