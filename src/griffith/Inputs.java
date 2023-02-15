package griffith;

import java.security.Principal;
import java.util.Random;
import java.util.concurrent.Phaser;

/*
 * Name: JOSHAN JOHN
 * STD no: 3092883
 * 10/02/2023
 */
public class Inputs {
    public static void main(String[] args) {
        Random rand = new Random();

        /*
         * PART ONE
         */

        // TASK ONE
        quoteGenerator();

        // TASK TWO
        int score[] = new int[56];
        System.out.println("\n\nThe grades are");
        for (int i = 0; i < score.length; i++) {
            score[i] = rand.nextInt(0, 100);
            System.out.print(score[i] + ",");
        }
        System.out.println("\nThe avarage was " + average(score));
        System.out.println(failed(score) + " failed");

        // task three

    }

    public static void quoteGenerator() {
        Random rand = new Random();

        String[] names = { "John Lennon", "keyla", "bianca" };
        String[] phrases = { "Time you enjoy wasting was not wasted", "Don’t be afraid to be afraid",
                "joshan we are coding" };

        int randInt = rand.nextInt(0, names.length);
        System.out.println(names[randInt]);
        System.out.println(phrases[randInt]);

    }

    public static int average(int[] grades) {
        int total = 0;
        for (int i : grades) {
            total += i;
        }
        int average = total / 50;
        return average;
    }

    public static int failed(int[] grades) {
        int failed = 0;
        for (int i : grades) {
            if (i < 40) {
                failed++;
            }
        }
        return failed;
    }

    public static void anagramCheck(String[] words) {

        for (String test : words) {

        }
    }
}
