import java.util.*;

public class Pattern3 {
    int count = 1;
    void pat3(int n) {
        for (int i = 0; i < n; i++) {
            for(int j=0; j<=i; j++){
                System.out.print(count);
                count++;
            }
            count = 1;
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of lines you want :");
        int n = input.nextInt();
        input.close();

        Pattern3 obj = new Pattern3();
        obj.pat3(n);
    }
}