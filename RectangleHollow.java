import java.util.*;

public class RectangleHollow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int w=sc.nextInt();
        for(int i=0;i<w;i++){
            if(i==0|| i==w-1){
               for(int j=0;j<l;j++){
                System.out.print("* ");
               }
            }
            else{
                for(int j=0;j<l;j++){
                    if(j==0 || j==l-1){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                   }
            }
            System.out.println();
        }
    }
}
