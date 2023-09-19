public final class Im{
	private final String name;
	private final int id;
    public 	int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public Im(int i, String s){
		this.id=i;
		this.name=s;
	}
	public static void main(String[] args){
		Im a=new Im(1,"java");
		System.out.println(a.name=="java");
	}
}