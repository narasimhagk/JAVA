class Methodoverl{
	static int a(int t,int w){
		return t+w;
	}
	static double a(double t,double w){return t+w;}
	public static void main(String[] args){
		Methodoverl m= new Methodoverl();
		System.out.println(m.a(10,20));
		System.out.println(m.a(10.2,20.4));
	}
}