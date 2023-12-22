import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLi3 {
    public static void main(String[] args) {
        String vowels[]={"a","e","i","o","u"};
        List<String> vowelList=new ArrayList<>(Arrays.asList(vowels));
        System.out.println(vowelList);
        vowelList.remove("i");
        System.out.println(vowelList);

        List<String> myList=new ArrayList<>();
        for(String s:vowels){
            myList.add(s);
        }
        System.out.println(myList);
        myList.clear();
                System.out.println(myList);

    }
}
