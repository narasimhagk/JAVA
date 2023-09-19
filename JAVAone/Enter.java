import java.util.Scanner;
class Enter{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);  //this field permits you to read input from the keyboard
		System.out.println("Enter the Number:");
		int num=s.nextInt();
		check(num);    // \u000d System.out.println("gjhb");
	}
	public static void check(int num){
	int count=0;
	for(int i=1;i<=num;i++){
		if(num%i==0){
			System.out.println(i);
			count++;
		}
	}
	if(count==2){
		System.out.println("Prime");
	}
	else{
		System.out.println("Not");
	}
	}
}