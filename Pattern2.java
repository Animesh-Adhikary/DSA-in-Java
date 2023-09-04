import java.util.*;

public class Pattern2 {
    void pat(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++)
                System.out.print(" ");

            for (int j = 0; j <= i; j++)
                System.out.print("*");

            System.out.println("\n");
        }
    }

    public static void main(String[] args){
        int n;
        System.out.println("Enter number of lines :");
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        Pattern2 obj = new Pattern2();
        obj.pat(n);
    }
}
