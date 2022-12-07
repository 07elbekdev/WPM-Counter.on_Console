import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    static final String GREEN = "\u001B[32m";
    static final String BLUE = "\u001B[34m";
    static final String BROWN = "\u001B[31m";
    static final String WHITE = "\u001B[37m";
    static final String YELLOW = "\u001B[33m";
    static final String CYAN = "\u001B[36m";
    static String[] words = {"something", "You're", "the best", "thing", "ever", "So", "what", "I", "you",
            "creative", "sought", "all", "that", "one", "player", "think", "all", "is"};
    public static void main(String[] args) throws InterruptedException {


        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.print(YELLOW + words[rand.nextInt(9)] + " ");
        }
        System.out.println();
        System.out.println(GREEN + "3" + GREEN);
        TimeUnit.SECONDS.sleep(1);

        System.out.println(BLUE + "2" + BLUE);
        TimeUnit.SECONDS.sleep(1);

        System.out.println(BROWN + "1" + BROWN);
        TimeUnit.SECONDS.sleep(1);
        System.out.println(CYAN + "---<< GO >>---" + CYAN);

        double start = LocalTime.now().toNanoOfDay();

        Scanner scan = new Scanner(System.in);
        String typeWords = scan.nextLine();

        double end = LocalTime.now().toNanoOfDay();
        double elapsedTime = end - start;
        double seconds = elapsedTime / 1000000000.0;
        System.out.println(WHITE+seconds+WHITE);
        int numChars = typeWords.length();
        int WPM = (int) (((numChars / 5) / seconds) * 60);

        System.err.println("Your speed is : " + WPM + " WPM");
    }
}