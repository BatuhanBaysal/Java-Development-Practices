import java.util.Scanner;

public class TicTacToe {

    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        
      System.out.println("\nLet's play tic tac toe.");
      System.out.println("Row and Column numbers are between 0-2!");

      char[][] table = {
        { '_', '_', '_' },
				{ '_', '_', '_' },
				{ '_', '_', '_' }
      };

      printBoard(table);
      int attempsX = 1;
      int attempsY = 1;
            
      for (int i = 0; i < 9; i++) {
        if (i % 2 == 0) {
          System.out.println("Turn: X  >>>  Trial " + attempsX + "! Remaining trial " + (4 - attempsX));
          int[] spot = askUser(table);
          table[spot[0]][spot[1]] = 'X';
          attempsX++;
        } else {
          System.out.println("Turn: O  >>>  Trial " + attempsY + "! Remaining trial " + (4 - attempsY));
          int[] spot = askUser(table);
          table[spot[0]][spot[1]] = 'O';
          attempsY++;
        }
              
        printBoard(table);
        int count = checkWin(table);

			  if (count == 3) {
				  System.out.println("X WINS! Try: " + (attempsX - 1));
				  break;
			  } else if (count == -3) {
				  System.out.println("O WINS! Try: " + (attempsY - 1));
				  break;
			  } else if (i == 8) {
				  System.out.println("IT'S A TIE!");
			  }
      }

      scan.close();
    }

     public static void printBoard(char[][] table) {
        System.out.println("\n");
        for (int i = 0; i < table.length; i++) {
          for (int j = 0; j < table[i].length; j++) {
              System.out.print("\t" + table[i][j] + " ");
          }
          System.out.println("\n"); 
      }
     }

     public static int[] askUser(char[][] table) {
      int row, column;
      while (true) {
          System.out.print("Enter row and column numbers >>> ");
          row = scan.nextInt();
          column = scan.nextInt();
          
          if (row >= 0 && row <= 2 && column >= 0 && column <= 2) { 
              if (table[row][column] == '_') {
                  break; 
              } else {
                  System.out.println("This spot is already taken, choose another one.");
              }
          } else {
              System.out.println("Row and column numbers must be between 0 and 2. Try again.");
          }
      }
      return new int[] { row, column };
  }  

    public static int checkWin(char[][] table) {
      int rows = checkRows(table);
      if (Math.abs(rows) == 3)
			  return rows;

      int columns = checkColumns(table);
      if (Math.abs(columns) == 3)
        return columns;

      int leftDiagonal = checkLeft(table);
		  if (Math.abs(leftDiagonal) == 3)
			  return leftDiagonal;

		  int rightDiagonal = checkRight(table);
		  if (Math.abs(rightDiagonal) == 3)
			  return rightDiagonal;

      return -1;
    }

    public static int checkRows(char[][] table) {
      int count = 0;
      for (int i = 0; i < table.length; i++) {
        for ( int j = 0; j < table[i].length; j++) {
          if (table[i][j] == 'X') {
            count++;
          } else if (table[i][j] == 'O') {
            count--;
          }
        }

        if (Math.abs(count) == 3) {
          return count;
        } else {
          count = 0;
        }
      }
      return count;
    }

    public static int checkColumns(char[][] table) {
      int count = 0;
      for (int i = 0; i < table.length; i++) {
        for (int j = 0; j < table[i].length; j++) {
          if (table[j][i] == 'X') {
            count++;
          } else if (table[j][i] == 'O') {
            count--;
          }
        }

        if (Math.abs(count) == 3) {
          return count;
        } else {
          count = 0;
        }
      }
      return count;
    }

    public static int checkLeft(char[][] table) {
      int count = 0;
      for(int i = 0; i < table.length; i++) {
          if (table[i][i] == 'X') {
            count++;
          } else if (table[i][i] == 'O'){
            count--;
          }
      }
      return count;
    }

    public static int checkRight(char[][] table) {
      int count = 0;
      for (int i = 0; i < table.length; i++) {
        if (table[i][(table.length-1) - i] == 'X') {
          count++;
        } else if (table[i][(table.length-1) - i] == 'O') {
          count--;
        }
      }
      return count;
    }
}