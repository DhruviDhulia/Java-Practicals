import java.util.Scanner;

class Rectangle {
    int length;
    int breadth;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    int Area() {
        return length * breadth;
    }

    int Perimeter() {
        return 2 * (length + breadth);
    }
}

class Square extends Rectangle {
    Square(int s) {
        super(s, s);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Rectangle
        System.out.print("Enter the length of the rectangle: ");
        int length = scanner.nextInt();
        System.out.print("Enter the breadth of the rectangle: ");
        int breadth = scanner.nextInt();

        // Input for Square
        System.out.print("Enter the side of the square: ");
        int side = scanner.nextInt();

        // Create objects for Rectangle and Square
        Rectangle rect = new Rectangle(length, breadth);
        Square sq = new Square(side);

        // Store objects in an array
        Rectangle[] shapes = {rect, sq};

        // Print area and perimeter of Rectangle and Square
        for (Rectangle shape : shapes) {
            System.out.println("Area: " + shape.Area());
            System.out.println("Perimeter: " + shape.Perimeter());
        }

        scanner.close();
    }
}
