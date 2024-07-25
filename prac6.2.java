import java.util.Scanner;
class prac6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = input.nextLine(); 
        System.out.println("Enter the number of length of string: ");
        int l=input.nextInt();
        System.out.println("Enter the number of times you wanr to print the string: "); 
        int n=input.nextInt();
        int i=0;

        do { 
            if(str.length()>=l)
            {
                for(int j=0;j<l;j++)
                {
                    System.out.print(str.charAt(j));
                }
            }
            else{
                   System.out.print(str);
            }
            i++;
        } while (i<n);
        
        System.out.println("\nID : 23DIT009");
    }
}
/*import java.util.Scanner;

class prac6{

	public static void main(String [] args)
	{
        Scanner str = new Scanner(System.in);
        System.out.println("Enter the length of the string :");
        int leng =0;
        if(str.hasNextLine()){
            leng = str.nextInt();

        }
        int[] arr = new int[leng];
 
        // Take user elements for the array
        System.out.println("Enter the elements of the string: ");
        for (int i = 0; i < leng; i++) {
            if (str.hasNextInt()) {
                arr[i] = str.nextInt();
            }
        }
        int x;
        System.out.println("Enter the Number of elements you want to repeat : ");        
        x=str.nextInt();
        System.out.println("How many times you want to repeat : "); 
        int y=str.nextInt();
        for(int j; j<y;j++){
        System.out.println(arr[].substring(0, x));
        }


    }
}

*/