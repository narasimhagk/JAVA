import java.util.*;
class Objclass{
	int i;
	int m;
	Objclass(int i,int u){
		this.i=i;
		this.m=u;
	}
	public String toString(){
		return i+" "+m+" ";
	}
	public static void main(String[] args){
		Objclass o=new Objclass(100,200);
		System.out.println(o.toString());
	}
}