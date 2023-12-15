import java.util.Scanner;
class G{
	public static void main(String[] args){
		Go i=new Go();
		i.in();
	}
}
class Go{
	static void in(){
		Scanner d=new Scanner(System.in);
		int t=d.nextInt();
		while(t-->0){
			int y=d.nextInt();
			d.nextLine();
			String g=d.nextLine();
			System.out.println(y);
			System.out.println(g);
		}
	}
}