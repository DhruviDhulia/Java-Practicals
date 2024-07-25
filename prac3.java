import java.util.Scanner;

class prac3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Mobile Number : ");
        System.out.println("+91");
        String number = sc.nextLine();

        // Splitting the input number using hyphen as a delimiter
        String[] arrofStr = number.split("-", 3);

        // Checking if the input format is correct
        if (arrofStr.length == 3) {
            System.out.println("Mobile system operator code is : " + arrofStr[0]);
            System.out.println("MSC is : " + arrofStr[1]);
            System.out.println("Unique code is : " + arrofStr[2]);
        } else {
            System.out.println("Invalid mobile number format. Please enter in the format xxx-xxx-xxxx");
        }
        
		System.out.println("ID : 23DIT009");
    }
}
