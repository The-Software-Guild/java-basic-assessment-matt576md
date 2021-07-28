/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mdavismthree.rockpaperscissors;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Mathieu Davis
 */
public class RockPaperScissors {
    //created global variables to store wins ties and best
    //public static int roundsToPlay = roundsToPlay();
    public static int userWins = 0;
    public static int compWins = 0;
    public static int ties = 0;
    public static String best = null;
    public static void main(String[] args) {
        
    
      
    
    
    go();
        while (playAgain())
        {
            go();
        }
    
    
    
 
        
    }
    public static void go()
    {
        
        int i;
        int roundsToPlay = roundsToPlay();
        
        for (i= 0; i < roundsToPlay; i++ ){
        
        //user();
        //computer()
        winner(user(), computer());
        }
        if (userWins > compWins){
            best = "user";
        }
        if (compWins > userWins){
            best = "comp";
        }else{
            best = "no one";
        }
        System.out.println("Computer won" + " " + compWins + " times, and you won" + " " + userWins + " you tied " + " " + ties + " times." + "The overall winner was" + " " + best);
         
    }
    public static int readValue(String prompt) {
    // declare and initialize a Scanner variable
    Scanner sc = new Scanner(System.in);
    // print prompt 
    System.out.println(prompt);
    // get input String data type
    String input = sc.nextLine();
    // convert to int
    int Val = Integer.parseInt(input);
    // return the int value
    return Val;
            }
    //need computer input
     public static String computer()
    {
     
        Random num = new Random();
        int compInput = num.nextInt(3) + 1;
        System.out.println("Computer input " + compInput);
        String comp = "choice";
        if (compInput == 1){
            comp = "Rock";
        }
        if (compInput == 2){
            comp = "Paper";
        }
        if (compInput == 3){
            comp = "Scissors";
        }
        return comp;
    } 
        
     //need user input
     public static String user()
     {
     int userInput = readValue("Enter choice 1 for rock, 2 for paper, and 3 for scissors:");
  //check to see if in range if not calls function again
     if (userInput > 0 && userInput < 4){
        System.out.println("valid range entered" + userInput);
     }else {
        System.out.println("invalid range entered");
        userInput = readValue("Enter choice 1 for rock, 2 for paper, and 3 for scissors:");
    }
    String user = "choice";
        if (userInput == 1){
            user = "Rock";
        }
        if (userInput == 2){
            user = "Paper";
        }
        if (userInput == 3){
            user = "Scissors";
        }
   
        return user;
    }
     //call function to get rounds
    public static int roundsToPlay()
    {
    int rounds;
    rounds = readValue("Enter how many rounds you want to play 1 - 10");{
    //check to see if in range if not calls function again
    if (rounds > 0 && rounds < 11){
        System.out.println("valid range entered " + rounds);
        
    }else {
        System.out.println("invalid range entered");
        System.exit(0);
    }
    } 
    return rounds;
    }    
     public static boolean playAgain()
    { 
       Scanner sc = new Scanner(System.in);
       System.out.println("Play again? yes or no");
       String input = sc.nextLine();
       //if capital Yes is typed in will revert to lowercase and work
        if (input.toLowerCase().equals("yes"))
        {
            return true;
        } else if (input.toLowerCase().equals("no"))
        {
            System.out.println("Thank you for playing");
            return false;
        } else
        {
            System.out.println("Invalid Input");
            return playAgain();
        }
  
    }
        
    
public static void winner(String user, String computer)
    {
        //int gamesPlayed;
        //int ties = 0;
        //int rounds = roundsToPlay();
        //int userWins = 0;
       // int compWins = 0;
        //String best = null;
 
      // for (gamesPlayed = 0; gamesPlayed < roundsToPlay; gamesPlayed++){
            
        System.out.println(" Computer Choice: " + computer);
        System.out.println("Your Choice : " + user);
        //using .equal instead of == just in case because equals compares values
        if (computer.equals("Rock") && user.equals("Scissors"))
        {
            compWins++;
            System.out.println(" Computer wins: " + compWins);
        }
        if (computer.equals("Scissors") && user.equals("Paper"))
        {
            compWins++;
            System.out.println(" Computer wins: " + compWins);
        }
        if (computer.equals("Paper") && user.equals("Rock"))
        {
            compWins++;
            System.out.println(" Computer wins: " + compWins);
        }
        if (computer.equals("Rock") && user.equals("Paper"))
        {
            userWins++;
            System.out.println(" You win: " + userWins);
        }
        if (computer.equals("Scissors") && user.equals("Rock"))
        {
            userWins++;
            System.out.println(" You win:" + userWins);
        }
       if (computer.equals("Paper") && user.equals("Scissors"))
        {
            System.out.println(" You win: " + userWins);
        } else if (computer.equals(user))
            ties++;
        {
            System.out.println(" Ties: " + ties);
        }
        
        
        
     /*if (userWins > compWins){
            best = "user";
        }
     if (compWins > userWins){
            best = "comp";
    }else{
            best = "no one";
        }
        System.out.println("Computer won" + " " + compWins + " times, and you won" + " " + userWins + " you tied " + " " + ties + " times." + "The overall winner was" + " " + best);
*/
}

} 






     
