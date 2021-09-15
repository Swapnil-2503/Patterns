import java.util.*;


public class Fibonacci {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int count=sc.nextInt();
        int a=0;
        int b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        int c;
        for(int i=2;i<count;i++){
            c=a+b;
            System.out.print(c+" ");
          
           a=b;
           b=c;
        }
    }
}
