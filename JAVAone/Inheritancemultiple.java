class Inheritancemultiple{
	String dogDoing="Eating";
}
class Spiderman extends Inheritancemultiple{
	String bark="Barkin";
}
class Test2{
	public static void main(String[] args){
		Spiderman p=new Spiderman();
		System.out.println(p.dogDoing);
		System.out.println(p.bark);
	}
}