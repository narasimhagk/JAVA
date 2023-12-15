import java.util.Arrays;

public class BigStringtoSmall {
    public static void main(String[] args) {
        String address="wrsfdesfddc,wesfd,ccweec,gcrge,rg,g,edrsfce";
        String word[]=address.split(",");
//        String d=word[0];
//        System.out.println(d);
        String h[]=(word[0].split(""));
        System.out.println(word[0].length());
//        for(int i=0;i<h.length;i++){
//            System.out.println(h[i]);
//        }
        int g=Arrays.binarySearch(h,"f");
        System.out.println(g);

        int p=Arrays.asList(h).indexOf("f");
        System.out.println(p);

    }
}
