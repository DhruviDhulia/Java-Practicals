import java.util.Scanner;
import java.util.Random;

class prac5{

	public static void main(String [] args)

	{

        Random r= new Random();
        int Random = r.nextInt(100);

        
        System.out.println("Guess the Number : ");
        Scanner ans = new Scanner(System.in);
		int i;
		for(i=0; i<3; i++){
            int guess=ans.nextInt();
            if(Random==guess){
                System.out.println("You guessed the right answer.");
                break;
            }
            else{
                System.out.println("Try again.");
                if(guess<Random){
                    System.out.println("Number is too small");
                }else{
                    System.out.println("Number is too Big.");
                }
            }
        }

        System.out.println("Right answer is :" + Random);



        System.out.println("ID : 23DIT009");


	}

}
