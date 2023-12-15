class Parameter{
	int id;
	String name;
	Parameter(int i,String n){
		id=i;
		name=n;
		System.out.println(id+" The King Of Hell "+name);
	}
	public static void main(String[] args){
		Parameter p=new Parameter(002,"Zoro");
	}
}