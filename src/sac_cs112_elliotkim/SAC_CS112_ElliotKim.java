/*
 * Assignment:  SAC_CS112-Java_Week04_Homework04_RockPaperScissor_ElliotKim
 * Objective:   Take input -> Process method conditional statement
 *              -> Output result 
 * Programmer:  Elliot Kim
 */
package sac_cs112_elliotkim;

// Import Scanner utility
import java.util.Scanner;
// Import Random utility
import java.util.Random;
import javax.swing.*;

public class SAC_CS112_ElliotKim 
{
    // main method begins execution of Java application
    public static void main(String[] args) 
    {
        
    
        // Create Scanner to obtain string input from commend line
        Scanner input = new Scanner (System.in);
        // Create Scanner to obtain char input from command line
        Scanner reader = new Scanner(System.in);
        
        // Declare variables
        char UserInput01 = 'A';
        char UserInput02 = 'B';
         
        // Welcome user to the Rock-Paper-Scissor program
        System.out.println("Welcome to Rock-Paper-Scissor Game.\n");
        
        // Ask user to put a input play the game
        // Place a input control by filtering out any input other than r or p or s
        while (UserInput01 != 'r' && UserInput01 != 'p' && UserInput01 != 's')
        {
            System.out.println("Please type your choice in a letter among R, P, S\nR = Rock\nP = Papter\nS = Scissor");
            // Put char value to UserInput, so I can switch with char value
            UserInput01 = reader.next().charAt(0);
        }
        
        // Place a input control by filtering out any input other than r or p or s
        while (UserInput02 != 'r' && UserInput02 != 'p' && UserInput02 != 's')
        {
            System.out.println("Please type your second choice in a letter.");
            // Put char value to UserInput, so I can switch with char value
            UserInput02 = reader.next().charAt(0);
        }
      
        
        switch (UserInput01)
            {
                // filter out invalid input from char UserInput
                
                case 'r':
                    if (UserInput02 == 'r')
                    {   System.out.println("You got a tie between Rock and Rock.");}
                    else
                    {   if (UserInput02 == 'p')
                        {   System.out.println("Rock lost over Paper.");}
                        else 
                        {System.out.println("Rock won over Scissor.");}
                    }
                case 'p':
                    if (UserInput02 == 'p')
                    {   System.out.println("You got a tie between Paper and Paper.");}
                    else
                    {   if (UserInput02 == 'r')
                        {   System.out.println("Paper won over Rock.");}
                        else 
                        {System.out.println("Paper lost over Scissor.");}
                    }
                case 's':
                    if (UserInput02 == 's')
                    {   System.out.println("You got a tie between Scissor and Scissor.");}
                    else
                    {   if (UserInput02 == 'r')
                        {   System.out.println("Scissor lost over Rock.");}
                        else 
                        {System.out.println("Scissor won over Paper.");}
                    }  
            }
    }
}        
        /*
        // Compare 2 input for tie result
        if (UserInput01 == UserInput02)
        {
            System.out.println("Hey, you got a tie.");
        }
        else
        {
            if (UserInput01 == 'r' || UserInput02 == 'p' || )
            {
                System.out.println("Hey, Rock won over Paper.");
            }
            else 
            {   System.out.println("Hey, Paper won over Rock."); }
        }
        */
        
        /*
        if ('r' == UserInput)
        {   
            // Verify user's input
            System.out.println("Your input is " + UserInput + ".");
        }
        
        // Verify user's input
        System.out.println("Your input is " + UserInput );
        */
        
        /*
        if ('p' == UserInput)
        {
            // Verify user's input
            System.out.println("Your input is " + UserInput + ".");
        }
        */
         
        /*
        // Put a loop for user to play the game again only user says "yes"
        do
        {
            // Setup random input, variable "ComputerRandomInput" to match with user's input
            final String ComputerRandomInputFrom = "RPS";
            final int N = ComputerRandomInputFrom.length();
            Random ComputerRandomInput = new Random();
            for (int i = 0; i < 1; i++) 
            // Convert ComputerRandomInput in final string type to ConvertComputerRandomInputToChar in char data type
            ConvertComputerRandomInputToChar = ComputerRandomInputFrom.charAt(ComputerRandomInput.nextInt(N));
        }
        */      
            // Ask user to put a input play the game
            // System.out.println("Please type your choice among R, P, S\nR = Rock\nP = Papter\nS = Scissor");
            // put char value to UserInput, so I can switch with char value
            
            
            /*
            String UserInputString = JOptionPane.showInputDialog("Please type your choice among R, P, S\nR = Rock\nP = Papter\nS = Scissor");
            char UserInputChar = UserInputString.charAt(0); //get the first char.
            switch(UserInputChar)
            {
                case 'r': 
                    if (ConvertComputerRandomInputToChar == UserInputChar)
                    {
                        System.out.println("You tied");
                        
                    }
            }
            */
            
            /*
            // Inform user user's input and computer's input
            // Inform user of the result
            // Prompt user whether wants to play it again
            String Result = "Result";
            System.out.println("You choice of weapon is " 
                     + "against " + ConvertComputerRandomInputToChar 
                    + " And result is you " + Result
                    + "\nDo you want to play again? Type \"Yes\"\n"
                    + "Otherwise, the program will quit.");
            PlayAgain = input.next();
            */
            
         //while (PlayAgain == "yes"); // Filter out 2 same input because they result in tie. 
         //String PlayAgain = "yes";
        
            
            
            /*
            String UserInputString = "";
            UserInputString=JOptionPane.showInputDialog("Please type your choice among R, P, S\nR = Rock\nP = Papter\nS = Scissor"); 
            char UserInput = UserInputString;
            */
            
            //UserInput = reader.next().charAt(0);
            
            /*
            // Calculate game result
            // Use switch statement to direct user's input into modulized conditional statement
            char R = 'r';
            char P = 'p';
            char S = 's';
            String Result = "Result";
            
            Result = "tied";
            */
            
            
            /*
            switch (UserInput)
            {
                // filter out invalid input from char UserInput
                
                case 'r':
                    if (ConvertComputerRandomInputToChar == 'r')
                    {
                        System.out.println("Why doesn't it work?\n");
                        Result = "tied"; 
                    }
                    if (ConvertComputerRandomInputToChar == 'p')
                    {
                        Result = "won";
                    }
                    if (ConvertComputerRandomInputToChar == 's')
                    {
                        Result = "lost";
                    }
            }
            */
                      
            /*
            
              */                      
            
        
        
        
        /*
            {
                ConvertComputerRandomInputToChar = ComputerRandomInputFrom.charAt(ComputerRandomInput.nextInt(N));
                System.out.println(Testing);
                // System.out.print(alphabet.charAt(r.nextInt(N)));
                // It prints the random input value
            }
            */

      // Elliot. just do it easiest way first and then do add on as an advanced.
        
        // Process the input with conditional statement
        
        
      
        
      
      //  if (FirstChoice != SecondChoice)
      //  {
      //  }
        
      //  System.out.println("Result of the game is tie.");     
        
            
        
        
    
        

//// Hmm you ask user to enter R/P/S and you checked for r/p/s    
    

