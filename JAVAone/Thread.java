class Thread{
	public static void main(String[] args){
		Thread t1=new Thread();
		Thread t2=new Thread();
		Thread t3=t1;
		System.out.println(t1==t2);
		System.out.println(t1==t3);
	}
}