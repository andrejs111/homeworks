package io.codelex.arrays.practice;
import java.sql.Array;
import java.util.*;

public class TicTacToe {

    static ArrayList<Integer> humanPositions = new ArrayList<Integer>();
    static ArrayList<Integer> cpuPositions = new ArrayList<Integer>();         // these 2 lists will store the positions that CPU and human add later during the game

    private static char[][] board = new char[3][3];

    public static void main(String[] args) {

        initBoard();
        displayBoard();


        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your placement (1-9, left to right, top to bottom):");
            int placementHuman = input.nextInt();
            while(humanPositions.contains(placementHuman) || cpuPositions.contains(placementHuman)) {      // needed to not overwrite the other player's moves
                System.out.println("Placement taken. Choose another position: ");
                placementHuman = input.nextInt();
            }
            placeOnBoard(placementHuman, "human");
            checkWinner();                                                                              // need to check in case there are 5 moves need to win

            Random random = new Random();
            int placementCPU = random.nextInt(9) + 1;
            while(cpuPositions.contains(placementCPU) || humanPositions.contains(placementCPU)) {
                placementCPU = random.nextInt(9) + 1;
            }
            placeOnBoard(placementCPU, "CPU");

            displayBoard();
            checkWinner();

            }
        }

    public static void initBoard() {
        // fills up the board with blanks
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = ' ';
    }

    public static void displayBoard() {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }

    public static void placeOnBoard(int placement, String player) {
        char symbol = ' ';

        if (player.equals("human")) {
            symbol = 'X';
            humanPositions.add(placement);
        } else if (player.equals("CPU")) {
            symbol = 'O';
            cpuPositions.add(placement);
        }

        switch (placement) {
            case 1 -> board[0][0] = symbol;
            case 2 -> board[0][1] = symbol;
            case 3 -> board[0][2] = symbol;
            case 4 -> board[1][0] = symbol;
            case 5 -> board[1][1] = symbol;
            case 6 -> board[1][2] = symbol;
            case 7 -> board[2][0] = symbol;
            case 8 -> board[2][1] = symbol;
            case 9 -> board[2][2] = symbol;
        }
    }

    public static void checkWinner() {                       // creating lists of winning combinations
        List topRow = Arrays.asList(1, 2, 3);
        List middleRow = Arrays.asList(4, 5, 6);
        List bottomRow = Arrays.asList(7, 8, 9);
        List topColumn = Arrays.asList(1, 4, 7);
        List middleColumn = Arrays.asList(2, 5, 8);
        List bottomColumn = Arrays.asList(3, 6, 9);
        List diagonalOne = Arrays.asList(1, 5, 9);
        List diagonalTwo = Arrays.asList(3, 5, 7);

        List<List> victory = new ArrayList<List>();                  // adding winning lists to a new list, that will be used to check if someone won
        victory.add(topRow);
        victory.add(middleRow);
        victory.add(bottomRow);
        victory.add(topColumn);
        victory.add(middleColumn);
        victory.add(bottomColumn);
        victory.add(diagonalOne);
        victory.add(diagonalTwo);

        for(List l : victory) {                                      // iterates through each of the lists in victory list
            if(humanPositions.containsAll(l)) {                      // containsAll(l) checks if current iteration contains all of the positions for a winning combination
                System.out.println("Human player wins!");
                System.exit(0);
            } else if(cpuPositions.containsAll(l)) {
                System.out.println("CPU wins!");
                System.exit(0);
            } else if(humanPositions.size() + cpuPositions.size() == 9)  {                      // .size() same as .length for arrays
                System.out.println("Tie!");
                System.exit(0);
            }
        }
    }
}