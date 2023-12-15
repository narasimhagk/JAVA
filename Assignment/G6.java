import java.util.Scanner;
public class G6 {
    public static String deleteCharsAtOddIndices(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) { // keep characters at even indices
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
		Scanner  Sc=new Scanner(System.in);
        String input = Sc.next();
        String result = deleteCharsAtOddIndices(input);
        System.out.println(result); // output: "Ges"
    }
}
