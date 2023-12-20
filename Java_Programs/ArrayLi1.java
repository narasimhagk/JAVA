import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLi1 {
    public static void main(String[] args){
        ArrayList<String> lis=new ArrayList<String>();
        lis.add("Hello");
        lis.add("Hi");
        lis.add("Hi");
        lis.add("Bye");

        Iterator li=lis.iterator();
        while(li.hasNext()){
            System.out.println(li.next());
        }
    }
    
}
