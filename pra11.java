import java.util.Scanner;

class pra11 {
    public static void main(String[] args) {
        System.out.println("Enter 1 to convert from pound to rupee and 2 to convert from rupee to pound.\n");
        Scanner inp = new Scanner(System.in);

        int choice = inp.nextInt(); 

        if (choice == 1) {
            System.out.print("Enter the pound: ");
            double pound = inp.nextDouble();
            double ans = pound * 106.93;
            System.out.print("Indian Rupees: " + ans);
        } else if (choice == 2) {
            System.out.print("Enter the Rupee: ");
            double rupee = inp.nextDouble();
            double ans = rupee / 106.93;
            System.out.print("Pounds: " + ans);
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }

        System.out.println("\nID: 23DIT009");
        inp.close(); 
    }
}