import java.util.Scanner;

public class Complex {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the real part of number 1 : ");
        int r1 = input.nextInt();
        System.out.print("Enter the img part of number 1 : ");
        int i1 = input.nextInt();
        System.out.print("Enter the real part of number 2 : ");
        int r2 = input.nextInt();
        System.out.print("Enter the img part of number 2 : ");
        int i2 = input.nextInt();

        System.out.println("\n\nSum of two complex numbers : " + (r1+r2) + " + " + (i1+i2) + "i");
        System.out.println("Difference of two complex numbers : " + (r1-r2) + " + " + (i1-i2) + "i");
        System.out.println("Product of two complex numbers : " + (r1*r2) + " + " + (i1*i2) + "i");

        System.out.println("\nID: 23DIT009");

    }
    
}