class Getter{
	private int roll;
	private String name;
	public int getRoll(){
		return roll;
	}
	public void setRoll(int roll){
		this.roll=roll;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	
	public void display(){
		System.out.println("Rollno"+roll);
		System.out.println("name"+name);
	}
	
}
class Main{
	public static void main(String[] args){
		Getter g=new Getter();
		g.setRoll(67);
		g.setName("Zoro");
		System.out.println(g.getRoll());
		System.out.println(g.getName());
	}
}