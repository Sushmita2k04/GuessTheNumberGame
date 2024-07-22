package GuessTheNumberGame;


import java.util.Random;
import java.util.Scanner;

class game{
    private int noOfGuesses;
    private int inputNumber;
    private int number;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }
    public void setNoOfGuesses(int noOfGuesses) {

        this.noOfGuesses = noOfGuesses;
    }
    game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    void takeUserInput( ){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("guess the number the number: ");
        inputNumber = sc.nextInt();
    }
   boolean isCorrectNumber(){
        noOfGuesses++;
        if(inputNumber==number){
            System.out.format("Yes you guessed it right it was %d\nYou guessed it in %d attempts ",number,noOfGuesses);
            return true;
        } else if (inputNumber<number) {
            System.out.println("Too low...");
        }else{
            System.out.println("Too high...");
        }
               return false;
    }                        
}
public class game {
    public static void main(String[] args) {
        /*Create a class Game, which allows a user to play "Guess the Number" game once.
         Game should have the following methods:
         Constructor to generate the random number
         takeUserInput() to take a user input of number
         isCorrectNumber() to detect whether the number entered by the user is true
         getter and setter for noOfGuesses
         Use properties such as noOfGuesses(int), etc to get this task done!*/
        game g = new game();
        boolean b=false;
        int  count=10;
        while(!b && count!=0) {
            g.takeUserInput();
            b=g.isCorrectNumber();
            count--;
            if(count==0){
                System.out.println("game over");
            }
        }
    }
}
