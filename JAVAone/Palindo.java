import java.util.Scanner;
public class Palindo{
	public static boolean isP(String str){
		StringBuilder s=new StringBuilder(str);
		s.reverse();
		String rev=s.toString();
		if(str.equals(rev)){
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		String h=s.next();
		String e=s.next();
		System.out.println(Palindo.isP(h));
		System.out.println(Palindo.isP(e));
	}
}