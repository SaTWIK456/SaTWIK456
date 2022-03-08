package luckNumberr;
import java.util.Random;
import java.util.Scanner;

public class GuessMyLuckyNumber {
 public static void main(String args[])
 {
  
   Random randomm = new Random();
   int rand_int = randomm.nextInt(10);
   int c=0;
  for(int i=0;i<10;i++) { 
	  c++;
    Scanner myObj = new Scanner(System.in);
    System.out.println("enter a random number below 10");
    int num = myObj.nextInt();
    if(rand_int== num){
    	
     System.out.println("Congrats!! you guessed it right :D "+ "no. of attemptsare " + c );
    
    }
    
    else {
     System.out.println("Not really try again :( ");
    }
  }   
}
}