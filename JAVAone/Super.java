class Animal{
	String color="black";
}
class Dog extends Animal{
	String color="gold";
	void display(){
		System.out.println(color);
	System.out.println(super.color);
	}
}
class Test{
	public static void main(String[] args){
		Dog d=new Dog();
		d.display();
	}
}