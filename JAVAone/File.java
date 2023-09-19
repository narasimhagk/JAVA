class F{
	public static void main(String[] args)throws Throwable{
		try{
			int d=10/0;
		}
		catch (Throwable f){
			System.out.println("Exception"+f.getMessage());
		}
	}
}