import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLi {
    public static void main(String[] args){
        ArrayList<String>list=new ArrayList<String>();
        list.add("Hello");
        list.add("Hi");
        list.add("Tata");
        list.add("Bye");
        System.out.println(list);
        Iterator li=list.iterator();
        while(li.hasNext()){
            System.out.println(li.next());
        }
    }
}
