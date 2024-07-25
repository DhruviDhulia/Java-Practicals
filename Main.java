import java.util.Scanner;

class Area {
    int length, breadth, area;

    Area(int l, int b) {
        length = l;
        breadth = b;
    }

    int returnArea() {
        area = length * breadth;
        return area;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Enter the length of rectangle: ");
        int length = Scanner.nextInt();

        System.out.println("Enter the breadth of rectangle: ");
        int breadth = Scanner.nextInt();

        Area obj = new Area(length, breadth);
        int area = obj.returnArea();

        System.out.println("The area of the rectangle is: " + area);
        System.out.println("\nID: 23DIT009");
    }
}