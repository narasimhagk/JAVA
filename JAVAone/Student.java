class Student{
	int id;
	String name;
	Student(int o,String n){
		id=o;
		name=n;
		System.out.println(o+" "+n);
	}
	/* Student(Student d){
		id=d.id;
		name=d.name;
		System.out.println(id+" "+name);
	} */
	public static void main(String[] args){
		Student d=new Student(79,"West");
		// System.out.println(d);
		// Copy constructor
		//Student s=new Student(d);
		//Without constructor:
		Student s=new Student();
		s.id=d.id;
		s.name=d.name;
		
	}
}