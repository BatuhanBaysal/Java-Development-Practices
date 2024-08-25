import java.util.Scanner;

public class AreaCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("This calculator lets you get the area of: ");
        System.out.println("1 - Square\n2 - Rectangle\n3 - Triangle\n4 - Circle\n");
        System.out.print("Enter a number >>> ");
        int option = scanner.nextInt();
        scanner.nextLine();
    
        switch (option) {
            case 1: 
                System.out.println("\nEnter a number to calculate the square of a number.");
                double side = scanner.nextDouble();
                double square = areaSquare(side);
                System.out.println("Square area: " + square);
            break;

            case 2: 
                System.out.println("\nEnter number to calculate two sides of a rectangle.");
                double length = scanner.nextDouble();
                double width = scanner.nextDouble();
                double rectangle = areaRectangle(length, width);
                System.out.println("Rectangle area: " + rectangle);
            break;

            case 3: 
                System.out.println("\nEnter base and height of the triangle.");
                double base = scanner.nextDouble();
                double height = scanner.nextDouble();
                double triangle = areaTriangle(base, height);
                System.out.println("Triangle area: " + triangle);
            break;

            case 4: 
                System.out.println("\nEnter radius for the triangle area.");
                double radius = scanner.nextDouble();
                double circle = areaCircle(radius);
                System.out.println("Circle area: " + circle);
            break;

            default: System.out.println("\nPlease, enter number between 1-4!!!"); break;
        }

        scanner.close();
    }

    public static double areaSquare(double side) {
        if (side < 0) {
            System.out.println("Not possible!");
            System.exit(0);
        }
        return Math.pow(side, 2);
    }

    public static double areaRectangle(double length, double width) {
        if (length < 0 || width < 0) {
            System.out.println("Not possible!");
            System.exit(0);
        }
        return length * width;
    } 

    public static double areaTriangle(double base, double height) {
        if (base < 0 || height < 0) {
            System.out.println("Not possible!");
            System.exit(0);
        }
        return (base * height) / 2;
    }

    public static double areaCircle(double radius) {
        if (radius < 0) {
            System.out.println("Not possible!");
            System.exit(0);
        }
        return Math.PI * Math.pow(radius, 2);
    }
}