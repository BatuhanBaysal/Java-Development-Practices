import java.util.Scanner;

public class Weather {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many temperature values will you enter? >>> ");
        int again = scanner.nextInt();
        scanner.nextLine();
        double[] celsius = new double[again];
        
        for (int i = 0; i < again; i++) {
            System.out.print((i + 1) + ". Number (Ex.14,99) >>> ");
            double number = scanner.nextDouble();
            celsius[i] = number;
            scanner.nextLine();
        }

        double[] fahrenheit = celsiusToFahrenheit(celsius);

        printTemperatures(celsius, "Celsius");
        printTemperatures(fahrenheit, "Fahrenheit");

        scanner.close();
    }

    public static double[] celsiusToFahrenheit(double[] celsius) {
        double[] fahrenheit = new double[celsius.length];

        for (int i = 0; i < celsius.length; i++) {
            fahrenheit[i] = (celsius[i] * 9 / 5) + 32;
        }

        return fahrenheit;
    }

    public static void printTemperatures(double[] temp, String type) {
        System.out.print(type + ": ");

        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }

        System.out.print("\n");
    }
}