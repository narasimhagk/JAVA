import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class ArrayLi4 {
    public static void main(String[] args){
        List<String> list=new ArrayList<>();

        list.add("SimpsonWave, ");
        list.add("Resonance, ");
        list.add("Memory Reboot");
        Iterator  it=list.iterator();
        while(it.hasNext()){
            System.out.print(it.next());
        }
        String[] strArray=new String[list.size()];
        strArray=list.toArray(strArray);
        System.out.println(Arrays.toString(strArray));
        
    }
}
