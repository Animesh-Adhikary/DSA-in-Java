import java.util.*;

public class pattern1 {
    void pat(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] agrs) {
        int n;
        System.out.println("Enter number of lines you want :");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        pattern1 ob = new pattern1();
        ob.pat(n);
    }
}
