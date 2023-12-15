class Withoutstatic{
	int c=0;

Withoutstatic(){
	c++;
	System.out.println(c);
}
 public static void main(String[] args){
	    Withoutstatic c=new Withoutstatic();
	    Withoutstatic c1=new Withoutstatic();
	    Withoutstatic c2=new Withoutstatic();
    }
}