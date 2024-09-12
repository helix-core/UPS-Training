public class SymmetricVoid {
    public static void symmetry(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n+1)-i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=(i*2)-2;k++){
                System.out.print(" ");
            }
            for(int l=1;l<=(n+1)-i;l++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-(i-1);j++){
                System.out.print("*");
            }
            for(int k=1;k<=(i*2)-2;k++){
                System.out.print(" ");
            }
            for(int l=1;l<=n-(i-1);l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 3; 
        symmetry(n);
    }
}
