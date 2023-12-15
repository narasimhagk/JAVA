class Greatamong{
	public static void main(String[] args){
		int x=10,z=145,c=100;
		/* if(x==z&&z==c){
			System.out.println("Given three numbers are equlas");
		}
		else if(x>=z && z>=c){
			System.out.println(x+" Is Greatest Number");
		}
		else if(z>=x && z>=c){
			System.out.println(z+" Is Greatest Number");
		}
		else{
			System.out.println(c+" Is Greatest Number");
		} */
		/* if(x==z&&z==c){
			System.out.println("Given three numbers are equlas");
		}
		else if((x>=z) && (z>=c)){
			System.out.println(x+" Is Greatest Number");
		}
		else if(z>=x && z>=c){
			System.out.println(z+" Is Greatest Number");
		}
		else{
			System.out.println(c+" Is Greatest Number");
		} */
		int t;
		t=(x>z)?x:z;
		int r;
		r=(t>c)?t:c;
		System.out.println(r+" Is Greatest Number");
	}
}