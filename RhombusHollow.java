
import java.util.*;

public class RhombusHollow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            if(i==0 || i==n-1){
                for(int j=0;j<n;j++){
                    System.out.print("* ");
                }
            }
            else{
                for(int j=0;j<n;j++){
                    if(j==0 || j==n-1){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
            for(int k=0;k<i+1;k++){
                System.out.print("  ");
            }
        }
    }
}
