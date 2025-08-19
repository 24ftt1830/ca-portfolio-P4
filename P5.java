package P4;

import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        
        Scanner input = new
        Scanner(System.in);

        System.out.print("Enter the price of the 1st package: $");
        double harga = input.nextDouble();

        System.out.print("Enter the weight of the 1st package in gram: ");
        int baratnya = input.nextInt();

        
        System.out.print("Enter the price of the 2nd package: $");
        double harga2 = input.nextDouble();

        System.out.print("Enter the weight of the 2nd package in gram: ");
        int baratnya2 = input.nextInt();

        String Barangke1 = "1st";
        String Barangke2 = "2nd";

        System.out.println(+baratnya/harga);
        System.out.println(+baratnya2/harga2);

        // Kalau Baratnya per Gram atu lagi basar, artinya ya lagi byk gram per $1 contohnya ani: $1/168gram
        // kalau inda artinya, lagi mahal per gram contohnya: $1.1/210gram

        if  ((baratnya/harga) > (baratnya2/harga2)) {
            System.out.println("It is worth more to buy the "+Barangke1+" package");
        } else {
            System.out.println("It is worth more to buy the "+Barangke2+" package");


        }
        
            
        










    }}

