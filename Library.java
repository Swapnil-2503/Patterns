import java.util.*;

public class Library {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList list=new ArrayList<>();
       list.add("history");
       list.add("math");
       list.add("science");
       list.add("geography");
       list.add("social science");
       System.out.println("Note: you can remove only 5 books at one day: ");
       int b=list.size();
       int c=5;
       for(int i=0;i<5;i++){
        System.out.println("Books in library are"+list);
        System.out.println("total books: "+list.size());
        System.out.println("which book you want?: ");
        
        String s=sc.nextLine();
        if(list.contains(s)==true){
        list.remove(s);
        System.out.println(s+" book is succesfully removed");}
        else{
            System.out.println(s+" book is unavailable"); 
        }
        System.out.print("you want to return book? type Y for yes and N for no: ");
        String l=sc.next();
        if(l.equals("Y")){
            System.out.print("enter book name which you want to add: ");
            sc.next();
            String x=sc.nextLine();
            list.add(x);
            System.out.println(x+"Book is succefully added ");
        }
        System.out.print("You want another book? type Y for yes and N for no: ");
        String k=sc.next();

        if(k.equals("Y")){
            
        }
        else{
            c=list.size();
            break;
        }
 
       }

       
      int d=b-c;
       System.out.print("Thank you for using our library! you have to return "+d+" books next time ");
    }
}
