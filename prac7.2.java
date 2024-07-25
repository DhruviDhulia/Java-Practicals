import java.util.Scanner;
class prac7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[50];
        int count =0;
        System.out.println("Enter the length of array: ");
        int n = sc.nextInt();
        System.out.println("Enter elements of array: ");
        for(int i=0;i<n;i++)
        {
           nums[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++)
        {
            if(nums[i] == 9)
            {
                count++;
            }
        }
        System.out.println("There are "+count+" 9's in the given array");
        
        System.out.println("\nID : 23DIT009");

    }
    
}// import java.util.Scanner;

// class prac7{

// 	public static void main(String [] args)
// 	{
//         Scanner sc = new Scanner(System.in);
 
//         // Take the array size from the user
//         System.out.println("Enter the size of the array: ");
//         int arr_size = 0;
//         if (sc.hasNextInt()) {
//             arr_size = sc.nextInt();
//         }
 
//         // Initialize the array's
//         // size using user input
//         int[] arr = new int[arr_size];
 
//         // Take user elements for the array
//         System.out.println("Enter the elements of the array: ");
//         for (int i = 0; i < arr_size; i++) {
//             if (sc.hasNextInt()) {
//                 arr[i] = sc.nextInt();
//             }
//         }
//         int count=0;
//         for (int i = 0; i < arr_size; i++) {
//             if(arr[i]==9){
//                 count++ ;
//             }
//         }
//         System.out.println("( is repeated :)"+  count);


//     }
// }