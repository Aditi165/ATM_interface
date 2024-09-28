import java.util.*;
public class test2{
    private static final int MIN_RANGE =1;
    private static final int MAX_RANGE =100;
    private static final int MAX_ATTEMPTS = 10;
    private static final int MAx_ROUNDS =3;
    public static void main(String args[]){
        Random random =new Random();
        Scanner scanner =new Scanner(System.in);
        int totalScore=0;
        System.out.println("NUMBER GUESSING GAME ");
        System.out.println("Total Number of Rounds: 3");
        System.out.println("Attempts to guess Number in each Round : 10\n");
        for(int i=1;i <= MAX_ROUND;i++){
            int number = random.nextInt(MAX_RANGE) + MIN_RANGE;
            int attempts=0;
            System.out.println("Round %d : Guess the number between %d and %d in %d attempts.\n",i,MIN_RANGE,MAX_RANGE,MAX_ATTEMPTS);
            While(attempts < MAX_ATTEMPTS);{
                System.out.println("Enter your guess : ");
                int guess_number=scanner.nextInt();
                attempts =attempts +1;
                if(guess_number == number){
                    int score = MAX_ATTEMPTS-attempts;
                    totslScore = totalScore+score;
                    System.out.print("Hurray!Number Guessed successfully,Attempts =%d,Round Score=%d\n ",attempts,score);
                    break;
                }
                else if(guess_number < number){
                    System.out.print("The number is greater than %d.Attempts Left =%d.\n ",guess_number,MAX_ATTEMPTS -attempts);
                }
               else if (guess_number > number){
                System.out.print("The number is less than %d.Attempts Left =%d.\n",guess_number,MAX_ATTEMPTS-attempts);
               }}
            if(attempts == MAX_ATTEMPTS){
                System.out.print("\nRound=%d\n",i);
                Sytsem.out.println("Attempts =0");
                System.out.print("The Random Number is : %d\n\n ",number);

            } 
    }
    System.out.print("Game Over. Total Score =%d\n",totalScore);
    scanner.close();
    }}