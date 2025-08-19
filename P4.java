package P4;

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        
        Scanner input = new 
        Scanner(System.in);
        

        System.out.print("Enter 1 to convert bnd to rm and 2 vise versa: ");
        

        int Convert = input.nextInt();

if (Convert == 1) {
    System.out.print("Enter the amount to be converted: $");
    double Tukaran = input.nextDouble();
    System.out.printf("The change is $ %.2f%n", Tukaran * 3);
} else {
    System.out.print("Enter the amount to be converted: $");
    double Tukaran1 = input.nextDouble();
    System.out.printf("The change is $ %.2f%n", Tukaran1 / 3);
}

    }}        


    
    

