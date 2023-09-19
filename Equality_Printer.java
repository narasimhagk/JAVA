import java.util.Scanner;

public class Equality_Printer {
    public static void printEqual(int o, int i, int l) {
        if (o < 0 || i < 0 || l < 0) {
            System.out.println("Neither zero nor low");
        } else if (o == i && i != l) {
            System.out.println("First and Second Values are Same");
        } else if (o == l && o != i) {
            System.out.println("First and Third Values are Same");
        } else if (i == l && i != o) {
            System.out.println("Second and Third Values are Same");
        } else if (o == i && i == l) {
            System.out.println("All values are equal");
        } else {
            System.out.println("All values are different");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int u = sc.nextInt();
        int m = sc.nextInt();
        printEqual(n, u, m);
    }
}
