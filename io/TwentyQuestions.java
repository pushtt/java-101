public class TwentyQuestions {
    public static void main(String[] args) {
        int secret = 1 + (int) (Math.random() * 1e6);
        System.out.print("I'm thinking of a number ");
        System.out.println("between 1 and 1,000,000");
        int guess = 0;
        while (guess != secret) {
            System.out.print("What's your guess ");
            guess = StdIn.readInt();
            if (guess < secret) System.out.println("Too low");
            if (guess > secret) System.out.println("Too high");
            if (guess == secret) System.out.println("You win");
        }
    }
}