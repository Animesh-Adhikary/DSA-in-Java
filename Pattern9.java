public class Pattern9 {
      void printDiamond(int n) {
        int a =1;
        int b=n+(n-1);
        
        for(int i=0;i<n;i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            
            for(int k=0; k<a+i; k++){
                System.out.print("*");
            }
            a++;
            System.out.print("\n");
        }
        
        for(int i=0;i<n;i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            
            for(int k=0; k<b; k++){
                System.out.print("*");
            }
            b=b-2;
            System.out.print("\n");
        }
    }
    public static void main(String[] args){
        Pattern9 obj = new Pattern9();
        obj.printDiamond(6);
    }

}
