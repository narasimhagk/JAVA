class Grand{
	public static void main(String[] args){
		String s="One Piece";
		int a=10,b=20,c=30;
		/* s=a+b+c;   // Error : Incompatible types 
							found : int
							required : java.lang.String
		s=b+c+a; */
		a=a+b+c;
		b=a+b+c;
		System.out.println(a);
		System.out.println(b);
	}
}