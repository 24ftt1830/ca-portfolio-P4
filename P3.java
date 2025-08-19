package P4;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        
        Scanner input = new
         Scanner(System.in);

         int start = 100, end = 999;

         System.out.print("Enter an integer between 100 and 999: ");
         int Integer = input.nextInt();

         Integer = (Integer < start)? start : (Integer > end)? end : Integer;
         

          int Integer1 = Integer % 10;
          int Integer2 = (Integer/10) % 10;
          int Integer3 = Integer/100;


         System.out.println("The reverse of "+Integer+" is "+Integer1+Integer2+Integer3);











    }
}
