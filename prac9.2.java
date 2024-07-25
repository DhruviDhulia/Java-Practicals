import java.util.Arrays;
import java.util.Scanner;

class prac92 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String text = input.nextLine();

        System.out.println("Enter 1 for finding length of string\n2 to convert to lowercase\n3 to convert to uppercase\n4 to reverse the string\n5 to sort the string");
        int n = input.nextInt();

        switch (n) {
            case 1:
                /*int len = text.length();
                for(int i=0; i<text; i++){
                    int ans=i;
                 System.out.println("Length of the String : " +str.length());}*/

        int length = 0;
        try {
            for(int i=0; str.charAt(i)!='\0'; i++)
            {
                length++; 
            }
            
        } 
        catch (StringIndexOutOfBoundsException e) {
            // TODO: handle exception
        }
System.out.println("Length of the string: " + length);

                break;
            case 2:
                System.out.println(text.toLowerCase());
                

                break;
            case 3:
                System.out.println(text.toUpperCase());
                break;
            case 4:
                String nstr = "";
                for (int i = 0; i < text.length(); i++) {
                    char ch = text.charAt(i); // extracts each character
                    nstr = ch + nstr; // adds each character in front of the existing string
                }
                System.out.println("Reversed word: " + nstr);
                break;
            case 5:
                char[] charArray = text.toCharArray();
                Arrays.sort(charArray);
                String sortedString = new String(charArray);
                System.out.println("Sorted string: " + sortedString);
                break;
            default:
                System.out.println("Wrong input!!");
                break;
        }
    }
}
