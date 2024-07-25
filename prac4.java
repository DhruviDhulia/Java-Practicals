import java.util.Scanner;

class prac4{

	public static void main(String [] args)

	{
		Scanner ans = new Scanner(System.in);

		String[] product ={"Motor", "Fan", "Tube", "wire", "other"};
		Double[] price = {1000.0, 450.0, 300.0, 120.0, 500.0};
		Double[] tax = {8.0, 12.0, 5.0, 7.5, 3.0};
	
		System.out.println("Enter the electric appliance : ");
		System.out.println("Enter 1 for Motor\n");
		System.out.println("Enter 2 for fan\n");
		System.out.println("Enter 3 for tube\n");
		System.out.println("Enter 4 for wire\n");
		System.out.println("Enter 5 for other\n");

		int choice = ans.nextInt();
		

		Double oprice;
		
		oprice = (price[choice-1]+(tax[choice-1]*100.0));

		
		
		switch (choice){

			case 1:
				/*System.out.println("Enter the no. of motor you want to buy : ");*/

				System.out.println("How many unit you want to buy?\n");
				int munit = ans.nextInt();
				System.out.println("You bought motor.\n");
				System.out.println("Your bill : "+ oprice*munit);
				break;
			
			case 2:
				System.out.println("How many unit you want to buy?\n");
				int funit = ans.nextInt();
				System.out.println("You bought fan.\n");
				System.out.println("Your bill : "+ oprice*funit);
				break;


			case 3:
				System.out.println("How many unit you want to buy?\n");
				int tunit = ans.nextInt();
				System.out.println("You bought tube.\n");
				System.out.println("Your bill : "+ oprice*tunit);
				break;


			case 4:
				System.out.println("How many unit you want to buy?\n");
				int wunit = ans.nextInt();
				System.out.println("You bought wire.\n");
				System.out.println("Your bill : "+ oprice*wunit);
				break;


			case 5:
				System.out.println("How many unit you want to buy?\n");
				int ounit = ans.nextInt();
				System.out.println("You bought other.\n");
				System.out.println("Your bill : "+ oprice*ounit);
				break;


		}
		
		
        System.out.println("ID : 23DIT009");


	}

}