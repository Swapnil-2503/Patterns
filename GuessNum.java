import java.util.*;
import javax.swing.*;

public class GuessNum {
    public static void main(String[] args) {
        Random rand=new Random();
       int comp=rand.nextInt(100);
       int user=0;
       System.out.println("The correct guess would be"+comp);
       int count=1;
       while(user!=comp){
       String response=JOptionPane.showInputDialog(null,"Guess The Number In Bettween 0 to 100","guessing game",3);
       user=Integer.parseInt(response);
       JOptionPane.showMessageDialog(null,""+determineGuess(user,comp,count));
       count++;
       }
        
    }
    public static String determineGuess(int user,int comp,int count){
        if(user<0||user>100){
            return "Your guess is invalid";
        }
        else if(user==comp){
       return "Right!\n Attempts= "+count;
        }
        else if(user>comp){
            return "your guess is too high try again!";
        }
        else if(user<comp){
            return "your guess is too low!";
        }
        else{
          return "Your guess is incorrect";
        }
    }
}
