import java.util.*;

public class RectangleSolid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int w=sc.nextInt();
        for(int i=0;i<w;i++){
            for(int j=0;j<l;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
