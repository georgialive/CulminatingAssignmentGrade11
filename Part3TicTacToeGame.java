package Culminating;

import java.util.Scanner;
import java.util.Random;



/*
 * To play the game, the user simply needs to enter the row and column of their desired move at the prompt,
 * and the game will update the board and check for a win or draw. The game will continue until one of these
 * conditions is met, at which point it will print the result and exit.
 * 
 * */

public class Part3TicTacToeGame {

// 'final' in orange means that it is a constant and cannot be changed.
	
	  // Constants for the board dimensions
	  public static final int ROWS = 3;
	  public static final int COLUMNS = 3;
	
	  // Constants for the players
	  public static final char PLAYER_X = 'X';
	  public static final char PLAYER_O = 'O';
	
	  // Constant for the win conditions
	  public static final String[] WIN_CONDITIONS = {
			 			  
	    "012", "345", "678", // rows
	    "036", "147", "258", // columns
	    "048", "246" // diagonals
	  
	  };

  public static void main(String[] args) {
	  
	
	char[][] board = new char[ROWS][COLUMNS];			// Initialize the game board as a 2D array of character (or a matrix), where each element in the array is itself an array.
	
    Scanner scanner = new Scanner(System.in); 
    
    Random random = new Random();						// Initialize the random number generator for deciding who goes first

    
    char currentPlayer = random.nextInt(2) == 0 ? PLAYER_X : PLAYER_O;			// Decide who goes first

    
    boolean gameFinished = false;						// Initialize the game as not finished

    
    while (!gameFinished) 								// Initialize the game loop
    {								
      
      printBoard(board);								// Print the game board

      
      System.out.print("Player " + currentPlayer + ", enter your move (row column): "); // Prompt the user for their next move
      int row = scanner.nextInt();
      int col = scanner.nextInt();

// Validate the move
      
      if (row >= 0 && row < ROWS && col >= 0 && col < COLUMNS && board[row][col] == 0) 
      {
        
        board[row][col] = currentPlayer;			// Make the move

// Check for a win
        
        if (checkWin(board, currentPlayer)) 
        {
        	
          gameFinished = true;	
          // The game is finished, the current player has won
          
          System.out.println("Player " + currentPlayer + " wins!");
          
        } 
        else 
        {
          // Check for a draw
          boolean draw = true;
          
          
          for (int i = 0; i < ROWS; i++) 
          {
        	  
            for (int j = 0; j < COLUMNS; j++) 
            	
            {
            	
              if (board[i][j] == 0) 
              {
                draw = false;
                
                break;
                
              }
              
            }
            
          }
          if (draw) 
          {
            // The game is finished, it's a draw
        	  
            gameFinished = true;
            
            System.out.println("It's a draw!");
          } 
          else 
          {
            // Switch players
        	  
            currentPlayer = (currentPlayer == PLAYER_X) ? PLAYER_O : PLAYER_X;
          }
        }
      } 
      else 
      {
        // The move was invalid, print an error message
    	  
        System.out.println("Invalid move, try again.");
      }
    }
  }

// Method that prints the game board

  public static void printBoard(char[][] board) {
	  
    // Print the top row of column numbers
	  
    System.out.print("  ");
    
    for (int i = 0; i < COLUMNS; i++) 
    {
    	
      System.out.print(i + " ");
      
    }
    	System.out.println();

    // Print each row of the board
    	
    for (int i = 0; i < ROWS; i++) 
    {
      // Print the row number
      System.out.print(i + " ");

      // Print each cell in the row
      
      for (int j = 0; j < COLUMNS; j++) 
      {
        char cell = board[i][j];
        
        if (cell == 0) 
        {
          System.out.print("  ");
        } 
        
        else 
        {
          System.out.print(cell + " ");
        }
      }
      
      System.out.println();
    }
  }

  // Method to check if the current player has won
  
  public static boolean checkWin(char[][] board, char player) {
    
	// Convert the board to a string for easier comparisons
	  
    StringBuilder sb = new StringBuilder();
    
    
    for (int i = 0; i < ROWS; i++) 
    {
      for (int j = 0; j < COLUMNS; j++) 
      {
        sb.append(board[i][j]);
      }
    }
    
    String boardString = sb.toString();

    // Check each win condition
    
    for (String winCondition : WIN_CONDITIONS) 
    {
      boolean win = true;
      
      for (int i = 0; i < winCondition.length(); i++) 
      {
        int index = Character.getNumericValue(winCondition.charAt(i));
        
        if (boardString.charAt(index) != player) 
        {
          win = false;
          
          break;
        }
        
      }
      
      if (win) 
      {
        return true;
      }
    }

    // No win conditions were met
    return false;
  }
}