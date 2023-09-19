class A{
	public static void main(String[] args){
		String str="NON",rev="";
		int strl=str.length();
		for(int i=strl-1;i>=0;i--){
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev)){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
	}
}