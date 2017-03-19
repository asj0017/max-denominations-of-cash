/**
  *@author Amber Jackson
  *@version 07-14-2015
*/

import java.util.Scanner;

public class MaxDenominationsOfCash {

   public static void main(String[] args) {
   Scanner userInput = new Scanner(System.in);
   int amount = 0;
   int amount1 = 0;
   int amount2 = 0;
   int amount3 = 0;
   String result = " ";
   
   System.out.print("Enter the amount: $");
   amount = userInput.nextInt();
   
   if (0 != amount % 10) {
     System.out.print("Amount must be a multiple of 10.");
   }
   
   else if (amount > 1000) {
      System.out.print("Amount exceeded $1000 limit.");
   }
   
   else {
     amount1 = amount / 100;
     
     System.out.println("Bills dy denomination:\n " + "\t$100: " + amount1);
     
     amount2 = (amount - (amount1 * 100)) / 20;
     
     System.out.println("\t$20: " + amount2);
     
     amount3 = (amount - ((amount2 * 20) + (amount1 * 100)))  / 10;
     
     System.out.println("\t$10: " + amount3);
     
     System.out.println("$" + amount + " = (" + amount1 + " * $100) + (" + amount2 + " * $20) + (" + amount3 + " * $10)");
   }
      System.out.println("\n" + result);
  }
  
}



   