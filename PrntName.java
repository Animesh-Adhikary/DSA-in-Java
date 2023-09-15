import java.util.*;

public class PrntName {
    static void printName(int n) {
        String[] str = new String[n];
        recurName(n, str);
        for(int i=0; i<n;i++)
        System.out.println(str[i]);
    }

    static String[] recurName(int n, String[] str){
        if(n==0) return str;
        str[n-1] = "Happy Coding";
        return recurName(n-1,str);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        printName(n);
    }

}
