import java.util.Scanner;

public class Pattern4 {
    int count = 1;
    void pat4(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(count);
            }
            count++;
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of lines you want :");
        int n = input.nextInt();
        input.close();

        Pattern4 obj = new Pattern4();
        System.out.println("\n");
        obj.pat4(n);
    }
}
