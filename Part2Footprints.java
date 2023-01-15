package Culminating;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Part2Footprints {
	
public static String toTheRightFootprints;
public static String toTheLeftFootprints;
	
public static void main(String[] args) {
		  
		  
	Scanner scanner = new Scanner(System.in);

	// Ask the user for the number of steps
		    
	System.out.print("Enter the number of steps: ");
		    
	double numSteps = scanner.nextInt();
	
	if ((numSteps % 1) != 0)
	{
		System.out.println("This is not a vaild entry please try again");
	}

	 // Ask the user which foot to start with
		    
	System.out.print("Starting off with left or right foot (left/right): ");
		    
	String startFoot = scanner.next();

	// Ask the user which direction to walk in
		    
	System.out.print("Walking up, down, left to right, or right to left  the screen (up/down/left/right): ");
		    
	String direction = scanner.next();

		    
	// Walk across the screen
		    
	walk(numSteps, startFoot, direction);

}
	
	
  // Method to output a single left foot
  public static void printLeftFoot() {
   
	  System.out.println("_________________$$$$$   \n"
		    		+ "____________$$__$$$$$$$  \n"
		    		+ "___________$$$$_$$$$$$$$ \n"
		    		+ "________$$_$$$$_$$$$$$$$ \n"
		    		+ "_______$$$$_$$___$$$$$$  \n"
		    		+ "____$$_$$$$____________  \n"
		    		+ "___$$$$_$$__$$$$$$$$$$$$ \n"
		    		+ "___$$$$__$$$$$$$$$$$$$$$$\n"
		    		+ "_$$_$$__$$$$$$$$$$$$$$$$$\n"
		    		+ "$$$$___$$$$$$$$$$$$$$$$$$\n"
		    		+ "$$$$__$$$$$$$$$$$$$$$$$$$\n"
		    		+ "_$$__$$$$$$$$$$$$$$$$$$$ \n"
		    		+ "____$$$$$$$$$$$$$$$$$$$$ \n"
		    		+ "____$$$$$$$$$$$$$$$$$$$  \n"
		    		+ "____$$$$$$$$$$$$$$$$$$   \n"
		    		+ "____$$$$$$$$$$$$$$$$$$   \n"
		    		+ "_____$$$$$$$$$$$$$$$$$   \n"
		    		+ "______$$$$$$$$$$$$$$$$   \n"
		    		+ "_______$$$$$$$$$$$$$$$$  \n"
		    		+ "________$$$$$$$$$$$$$$$$ \n"
		    		+ "_________$$$$$$$$$$$$$$$$\n"
		    		+ "__________$$$$$$$$$$$$$$$\n"
		    		+ "___________$$$$$$$$$$$$$$\n"
		    		+ "_____________$$$$$$$$$$$ \n"
		    		+ "_______________$$$$$$$$  \n"
		    		+ "_________________$$$$$   \n"); 
	 	

  }

  // Method to output a single right foot
  
  public static void printRightFoot() {
    
	  System.out.println("			__$$$$$                  \n"
			    		+ "			__$$$$$$$__$$            \n"
			    		+ "			_$$$$$$$$_$$$$           \n"
			    		+ "			_$$$$$$$$_$$$$_$$        \n"
			    		+ "			__$$$$$$___$$_$$$$       \n"
			    		+ "			______________$$$$_$$    \n"
			    		+ "			_$$$$$$$$$$$$__$$_$$$$   \n"
			    		+ "			$$$$$$$$$$$$$$$$__$$$$   \n"
			    		+ "			$$$$$$$$$$$$$$$$$__$$_$$ \n"
			    		+ "			$$$$$$$$$$$$$$$$$$___$$$$\n"
			    		+ "			$$$$$$$$$$$$$$$$$$$__$$$$\n"
			    		+ "			$$$$$$$$$$$$$$$$$$$__$$  \n"
			    		+ "			_$$$$$$$$$$$$$$$$$$$$    \n"
			    		+ "			__$$$$$$$$$$$$$$$$$$$    \n"
			    		+ "			___$$$$$$$$$$$$$$$$$$    \n"
			    		+ "			___$$$$$$$$$$$$$$$$$$    \n"
			    		+ "			___$$$$$$$$$$$$$$$$$     \n"
			    		+ "			___$$$$$$$$$$$$$$$$      \n"
			    		+ "			__$$$$$$$$$$$$$$$$       \n"
			    		+ "			_$$$$$$$$$$$$$$$$        \n"
			    		+ "			$$$$$$$$$$$$$$$$         \n"
			    		+ "			$$$$$$$$$$$$$$$          \n"
			    		+ "			$$$$$$$$$$$$$$           \n"
			    		+ "			_$$$$$$$$$$$             \n"
			    		+ "			__$$$$$$$$               \n"
			    		+ "			___$$$$$                 \n");
    
    
  }
  
  // Method to output a single right foot (upside-down)
  
  public static void printRightFootUpsideDown() {
   
	  System.out.println("_________________$$$$$   \n"
				  		+ "_______________$$$$$$$$  \n"
				  		+ "_____________$$$$$$$$$$$ \n"
				  		+ "___________$$$$$$$$$$$$$$\n"
				  		+ "__________$$$$$$$$$$$$$$$\n"
				  		+ "_________$$$$$$$$$$$$$$$$\n"
				  		+ "________$$$$$$$$$$$$$$$$ \n"
				  		+ "_______$$$$$$$$$$$$$$$$  \n"
				  		+ "______$$$$$$$$$$$$$$$$   \n"
				  		+ "_____$$$$$$$$$$$$$$$$$   \n"
				  		+ "____$$$$$$$$$$$$$$$$$$   \n"
				  		+ "____$$$$$$$$$$$$$$$$$$   \n"
				  		+ "____$$$$$$$$$$$$$$$$$$$  \n"
				  		+ "____$$$$$$$$$$$$$$$$$$$$ \n"
				  		+ "_$$__$$$$$$$$$$$$$$$$$$$ \n"
				  		+ "$$$$__$$$$$$$$$$$$$$$$$$$\n"
				  		+ "$$$$___$$$$$$$$$$$$$$$$$$\n"
				  		+ "_$$_$$__$$$$$$$$$$$$$$$$$\n"
				  		+ "___$$$$__$$$$$$$$$$$$$$$$\n"
				  		+ "___$$$$_$$__$$$$$$$$$$$$ \n"
				  		+ "____$$_$$$$____________  \n"
				  		+ "_______$$$$_$$___$$$$$$  \n"
				  		+ "________$$_$$$$_$$$$$$$$ \n"
				  		+ "___________$$$$_$$$$$$$$ \n"
				  		+ "____________$$__$$$$$$$  \n"
				  		+ "_________________$$$$$   \n");  

  }

//Method to output a single left foot (upside-down)
  
 public static void printLeftFootUpsideDown() {
  
	  System.out.println("			___$$$$$                \n"
				  		+ "			__$$$$$$$$               \n"
				  		+ "			_$$$$$$$$$$$             \n"
				  		+ "			$$$$$$$$$$$$$$           \n"
				  		+ "			$$$$$$$$$$$$$$$          \n"
				  		+ "			$$$$$$$$$$$$$$$$         \n"
				  		+ "			_$$$$$$$$$$$$$$$$        \n"
				  		+ "			__$$$$$$$$$$$$$$$$       \n"
				  		+ "			___$$$$$$$$$$$$$$$$      \n"
				  		+ "			___$$$$$$$$$$$$$$$$$     \n"
				  		+ "			___$$$$$$$$$$$$$$$$$$    \n"
				  		+ "			___$$$$$$$$$$$$$$$$$$    \n"
				  		+ "			__$$$$$$$$$$$$$$$$$$$    \n"
				  		+ "			_$$$$$$$$$$$$$$$$$$$$    \n"
				  		+ "			$$$$$$$$$$$$$$$$$$$__$$  \n"
				  		+ "			$$$$$$$$$$$$$$$$$$$__$$$$\n"
				  		+ "			$$$$$$$$$$$$$$$$$$___$$$$\n"
				  		+ "			$$$$$$$$$$$$$$$$$__$$_$$ \n"
				  		+ "			$$$$$$$$$$$$$$$$__$$$$   \n"
				  		+ "			_$$$$$$$$$$$$__$$_$$$$   \n"
				  		+ "			______________$$$$_$$    \n"
				  		+ "			__$$$$$$___$$_$$$$       \n"
				  		+ "			_$$$$$$$$_$$$$_$$        \n"
				  		+ "			_$$$$$$$$_$$$$           \n"
				  		+ "			__$$$$$$$__$$            \n"
				  		+ "			__$$$$$                  \n");  

 }
 
//Method to output a right foot (walking right)
 
public static String FootprintstoTheRight() {
	
	    String rightFoot = "                                __$$$$$                  \n"
				    		+ "                                __$$$$$$$__$$            \n"
				    		+ "                                _$$$$$$$$_$$$$           \n"
				    		+ "                                _$$$$$$$$_$$$$_$$        \n"
				    		+ "                                __$$$$$$___$$_$$$$       \n"
				    		+ "                                ______________$$$$_$$    \n"
				    		+ "                                _$$$$$$$$$$$$__$$_$$$$   \n"
				    		+ "                                $$$$$$$$$$$$$$$$__$$$$   \n"
				    		+ "                                $$$$$$$$$$$$$$$$$__$$_$$ \n"
				    		+ "                                $$$$$$$$$$$$$$$$$$___$$$$\n"
				    		+ "                                $$$$$$$$$$$$$$$$$$$__$$$$\n"
				    		+ "                                $$$$$$$$$$$$$$$$$$$__$$  \n"
				    		+ "                                _$$$$$$$$$$$$$$$$$$$$    \n"
				    		+ "                                __$$$$$$$$$$$$$$$$$$$    \n"
				    		+ "                                ___$$$$$$$$$$$$$$$$$$    \n"
				    		+ "                                ___$$$$$$$$$$$$$$$$$$    \n"
				    		+ "                                ___$$$$$$$$$$$$$$$$$     \n"
				    		+ "                                ___$$$$$$$$$$$$$$$$      \n"
				    		+ "                                __$$$$$$$$$$$$$$$$       \n"
				    		+ "                                _$$$$$$$$$$$$$$$$        \n"
				    		+ "                                $$$$$$$$$$$$$$$$         \n"
				    		+ "                                $$$$$$$$$$$$$$$          \n"
				    		+ "                                $$$$$$$$$$$$$$           \n"
				    		+ "                                _$$$$$$$$$$$             \n"
				    		+ "                                __$$$$$$$$               \n"
				    		+ "                                ___$$$$$                 \n";
	    
		  return rightFoot;
	
	
}

//Method to output a left foot (walking right)

public static String printLeftFootWalkingRight() {

	String leftFoot = "_________________$$$$$                                   \n"
    		+ "____________$$__$$$$$$$                                  \n"
    		+ "___________$$$$_$$$$$$$$                                 \n"
    		+ "________$$_$$$$_$$$$$$$$                                 \n"
    		+ "_______$$$$_$$___$$$$$$                                  \n"
    		+ "____$$_$$$$____________                                  \n"
    		+ "___$$$$_$$__$$$$$$$$$$$$                                 \n"
    		+ "___$$$$__$$$$$$$$$$$$$$$$                                \n"
    		+ "_$$_$$__$$$$$$$$$$$$$$$$$                                \n"
    		+ "$$$$___$$$$$$$$$$$$$$$$$$                                \n"
    		+ "$$$$__$$$$$$$$$$$$$$$$$$$                                \n"
    		+ "_$$__$$$$$$$$$$$$$$$$$$$                                 \n"
    		+ "____$$$$$$$$$$$$$$$$$$$$                                 \n"
    		+ "____$$$$$$$$$$$$$$$$$$$                                  \n"
    		+ "____$$$$$$$$$$$$$$$$$$                                   \n"
    		+ "____$$$$$$$$$$$$$$$$$$                                   \n"
    		+ "_____$$$$$$$$$$$$$$$$$                                   \n"
    		+ "______$$$$$$$$$$$$$$$$                                   \n"
    		+ "_______$$$$$$$$$$$$$$$$                                  \n"
    		+ "________$$$$$$$$$$$$$$$$                                 \n"
    		+ "_________$$$$$$$$$$$$$$$$                                \n"
    		+ "__________$$$$$$$$$$$$$$$                                \n"
    		+ "___________$$$$$$$$$$$$$$                                \n"
    		+ "_____________$$$$$$$$$$$                                 \n"
    		+ "_______________$$$$$$$$                                  \n"
    		+ "_________________$$$$$                                   \n"; 


return leftFoot;


}



	//Method to rotate a 2D array by 90 degrees to the right

	public static char[][] rotate90Degrees(char[][] matrix) {
		
	  // Determine the dimensions of the matrix
		
	  int rows = matrix.length;
	  
	  int cols = matrix[0].length;

	  // Create a new 2D array to store the rotated matrix
	  
	  char[][] rotated = new char[cols][rows];

	  // Iterate through the original matrix and add each element to the rotated matrix
	  
	  for (int i = 0; i < rows; i++) 
	  {
	    for (int j = 0; j < cols; j++) 
	    {
	      rotated[j][rows - 1 - i] = matrix[i][j];
	    }
	  }

	  	return rotated;
	 }
	
	
	
	//Method to rotate a 2D array by 90 degrees to the left
	
	public static char[][] rotate90DegreesLeft(char[][] matrix) {
		
		  // Determine the dimensions of the matrix
		
		  int rows = matrix.length;
		  int cols = matrix[0].length;


		  // Create a new 2D array to store the rotated matrix
		  
		  char[][] rotated = new char[cols][rows];

		  // Iterate through the original matrix and add each element to the rotated matrix
		  
		  for (int i = 0; i < rows; i++) 
		  {
		    for (int j = 0; j < cols; j++) 
		    {
		      rotated[cols - 1 - j][i] = matrix[i][j];
		    }
		  }

		  return rotated;
		}

 
  
  // Method to walk across the screen based on the given inputs
  
  public static void walk(double numSteps, String startFoot, String direction) {
	  
	  
	 if (direction.equals("up") || direction.equals("down") || direction.equals("left") || direction.equals("right")) 
	 {
   
	  if (direction.equals("up"))
	  {
		  // Print the remaining steps
		    
		    for (int i = 1; i < numSteps; i++) 
		    {
		      // Check for overlap
		    	
		      if (i != numSteps - 1 && i != 0) 
		      {
		        System.out.print("");
		      }

		      // Print the next foot
		      
		      if (startFoot.equals("left")) 
		      {
		        printRightFoot();
		        
		        startFoot = "right";
		      } 
		      
		      else 
		      {
		        printLeftFoot();
		        startFoot = "left";
		      }

		     
		    }
	  }
	  
	  if (direction.equals("down"))
	  {
		  // Print the remaining steps
		    
		    for (int i = 1; i < numSteps; i++) 
		    {
		      // Check for overlap
		    	
		      if (i != numSteps - 1 && i != 0) 
		      {
		        System.out.print("");
		      }

		      // Print the next foot
		      
		      if (startFoot.equals("left")) 
		      {
		    	printRightFootUpsideDown();
		        
		        startFoot = "right";
		      } 
		      
		      else 
		      {
		        printLeftFootUpsideDown();
		        startFoot = "left";
		      }
		      
		    }
		    
		    
	  }
	  
	  if (direction.equals("left"))
	  {
		      
		  // Print the remaining steps
		    
		    for (int i = 0; i < numSteps; i++) 
		    {
		      // Check for overlap
		    	
		      if (i != numSteps - 1 && i != 0) 
		      {
		        System.out.print("");
		      }

		      // Print the next foot
		      
		      if (startFoot.equals("left")) 
		      {
		    	toTheRightFootprints += FootprintstoTheRight();
		        
		        startFoot = "right";
		      } 
		      
		      else 
		      {
		    	  toTheRightFootprints += printLeftFootWalkingRight();
		        
		        startFoot = "left";
		      }
		      
		    }
		    
		    // Split the string into an array of strings, where each string represents a line of the text art
			
			String[] lines = toTheRightFootprints.split("\n");
				
			// Create a new 2D array to store the characters
			
			  char[][] textArt;
			  
			  
			  
			  if (lines.length > 0) 
			  {
			      textArt = new char[lines.length][lines[0].length()];
			  } 
			  else 
			  {
			      textArt = new char[0][0];
			  }
			
			// Iterate through the array of strings and add each character to the 2D array
			  int maxLineLength = 0;
			  
			  for (String line : lines) 
			  {
			    maxLineLength = Math.max(maxLineLength, line.length());
			  }

			  textArt = new char[lines.length][maxLineLength];

			  
			for (int i = 0; i < lines.length && i < textArt.length; i++) 
			{
			    for (int j = 0; j < lines[i].length() && j < textArt[i].length; j++) 
			    {
			        textArt[i][j] = lines[i].charAt(j);
			    }
			}

			// Rotate the 2D array by 90 degrees to the right

			
			char [][] rotatedTextArt = rotate90DegreesLeft(textArt);


			// Iterate through the rotated 2D array and print each character on a separate line

			
			for (char[] line : rotatedTextArt) 
			{
				
				  for (char c : line) 
				  {
				    System.out.print(c);
				  }
				  
				  System.out.println();
			}
		    
	  }
	  if (direction.equals("right"))
	  {
		  for (int i = 0; i < numSteps; i++) 
		    {
		      // Check for overlap
		    	
		      if (i != numSteps - 1 && i != 0) 
		      {
		        System.out.print("");
		      }

		      // Print the next foot
		      
		      if (startFoot.equals("left")) 
		      {
		    	toTheLeftFootprints += FootprintstoTheRight();
		        
		        startFoot = "right";
		      } 
		      
		      else 
		      {
		    	  toTheLeftFootprints += printLeftFootWalkingRight();
		        
		        startFoot = "left";
		      }
		      
		    }
		    
		    // Split the string into an array of strings, where each string represents a line of the text art
			
			String[] lines = toTheLeftFootprints.split("\n");

			// Create a new 2D array to store the characters
			
			char[][] textArt = new char[lines.length][lines[0].length()];

			// Iterate through the array of strings and add each character to the 2D array
			
			for (int i = 0; i < lines.length; i++) 
			{
			  for (int j = 0; j < lines[i].length(); j++) 
			  {
			    textArt[i][j] = lines[i].charAt(j);
			  }
			}

			// Rotate the 2D array by 90 degrees to the right
			
			char[][] rotatedTextArt = rotate90Degrees(textArt);

			// Iterate through the rotated 2D array and print each character on a separate line
			
			for (char[] line : rotatedTextArt) 
			{
			  for (char c : line) 
			  {
			    System.out.print(c);
			  }
			  System.out.println();
			}
	  }
		  
	 } 
	 else {
		 System.out.println("Invaild entry please try again");
	 }
    
    
    
  }
  
  
  
  
  
  
  
  
}

 
