import java.util.Scanner;

public class GuessMovie {
    static boolean contains(char c, char[] array) {
        for (char x : array) {
            if (x == c) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args){
        String movie = "hangover";
        int movieChars = movie.length();
        char[] blank = movie.toCharArray();
        Scanner scanner = new Scanner(System.in);
        String g;
        boolean win = false;

        System.out.println("This is the movie you have to guess: ");
        for (int i = 0; i < movieChars; i++){
            blank[i] = '-';
        }
        System.out.println(blank);
        System.out.println();
        while(!win){
            System.out.println("Guess a letter: ");
            g = scanner.next();
            char guess = g.charAt(0);
            for (int i = 0; i < movie.length(); i++){
                if (guess == movie.charAt(i)){
                    blank[i] = guess;
                    System.out.println(blank);
                }
                if (!contains('-', blank)){
                    win = true;
                }

            }

        }
        System.out.println("You win!");

    }
}
