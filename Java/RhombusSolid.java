
import java.util.*;

public class RhombusSolid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
            for(int j=0;j<i+1;j++){
                System.out.print("  ");
            }
        }
    }
}
