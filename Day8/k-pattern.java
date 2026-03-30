import java.util.*;
class k-pattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        for(int i=0;i<n;i++){
            System.out.print("*"+" ");
            for(int j=2-i;j>=0;j--){
                System.out.print(" ");
            }
        }

    }
}