class Bitwise{
	public static void main(String[] args){
		int x=10,y=15;
		if(++x<10 && ++y>15){
			x++;
			System.out.println("hi");
		}
		else{
			y++;
			System.out.println("h");
		}
		System.out.println(x+"  "+y);
	}
}