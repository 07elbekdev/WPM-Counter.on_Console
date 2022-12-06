import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    static final String GREEN = "\u001B[32m";
    static final String BLUE = "\u001B[34m";
    static String[] words = {"something", "You're", "the best", "thing", "ever", "So", "what", "I", "you",
            "creative", "sought", "all", "that", "one", "Ronaldo", "player", ",", "think", "all", "is"};

    public static void main(String[] args) throws InterruptedException {
        System.out.println(GREEN+"3"+GREEN);
        TimeUnit.SECONDS.sleep(1);

        System.out.println(BLUE+"2"+BLUE);
        TimeUnit.SECONDS.sleep(1);

        System.out.println("1");
        TimeUnit.SECONDS.sleep(1);
        System.err.println("---<< GO >>---");
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.print(words[rand.nextInt(9)] + " ");
        }
        System.out.println();

        double start = LocalTime.now().toNanoOfDay();

        Scanner scan = new Scanner(System.in);
        String typeWords = scan.nextLine();

        double end = LocalTime.now().toNanoOfDay();
        double elapsedTime = end - start;
        double seconds = elapsedTime / 1000000000.0;
        System.out.println(seconds);
        int numChars = typeWords.length();
        int WPM = (int) (((numChars / 5) / seconds) * 60);

        System.out.println("Your speed is : " + WPM + " WPM");
    }
}