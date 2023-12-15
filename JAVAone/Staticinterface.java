interface Calcu{
	void table();
	static void n(int t,int i){
		for(int o=t;o<=10;o++){
			for(int u=i;u<=i;u++){
				System.out.println(o*u);
				//return (o*u);
			}
		}
		//return 0;
}
}
class Cal implements Calcu{
	public void table(){
		System.out.println("hey yo ");
	}
}
class Tester{
	public static void main(String[] args){
		Calcu d=new Cal();
		d.table();
	Calcu.n(1,3);
	}
}