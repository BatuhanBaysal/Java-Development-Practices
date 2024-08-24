import java.util.Scanner;

public class Javapedia {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("\n**********Javapedia**********");
        System.out.println("How many historical figures will you register?");

        int answer = scan.nextInt();
        String[][] database = new String[answer][3];
        scan.nextLine(); 

        for(int i = 0; i < answer; i++) {
            System.out.println("\n\tFigure" + (i + 1));
            System.out.print("\nName: ");
            database[i][0] = scan.nextLine();
            System.out.print("\nDate of birth: ");
            database[i][1] = scan.nextLine();
            System.out.print("\nOccupation: ");
            database[i][2] = scan.nextLine();
            scan.nextLine();
        }

        System.out.println("\nThese are the values you stored:"); 
        print2DArray(database);
      
        System.out.print("\nWho do you want information on? "); 
        String name = scan.nextLine();
        
        for (int i = 0; i < database.length; i++) {
            if (database[i][0].equals(name)) {
                System.out.println("\tName: " + database[i][0]);
                System.out.println("\tDate of birth: " + database[i][1]);
                System.out.println("\tOccupation: " + database[i][2]);
            }
        }  
        scan.close();
    }

     public static void print2DArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("\t");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}