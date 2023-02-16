package griffith;

import java.util.Arrays;
import java.util.Random;

/*
 * Name: JOSHAN JOHN
 * STD no: 3092883
 * 10/02/2023
 */
public class Inputs {
    public static void main(String[] args) {
        Random rand = new Random(); // random object

        /*
         * PART ONE
         */

        // TASK ONE
        quoteGenerator();

        System.out.println("\n-----------------------------");
        // TASK TWO
        int score[] = new int[56]; // Integer array with fixed size of 56 elements
        System.out.println("\nThe grades are");
        /*
         * storing displaying the randomly generated scores
         */
        for (int i = 0; i < score.length; i++) {

            score[i] = rand.nextInt(0, 100); // storing the number that generated randomly from 0 to 100
            System.out.print(score[i] + ","); // displaying scores
            /*
             * display only 5 grades in a line
             */
            if (i % 5 == 4) {
                System.out.println();
            }
        }
        /*
         * displaying the avarage score
         */
        System.out.println("\nThe avarage was " + average(score));
        /*
         * displaying number of failures
         */
        System.out.println(failed(score) + " failed");

        // task three
        System.out.println("\n-----------------------");
        String[] words = { "a red", "cat", "dare", "race", "care", "read", "acre" }; // array of words
        anagramCheck(words); // calling anagramCheck method by passing words as parameter

        // task four
        System.out.println("\n---------------------");
        int[][] shape = { { 32, 32, 95, 95, 95, 95 }, // two dimensional array
                { 32, 47, 92, 95, 95, 95, 92 },
                { 47, 92, 32, 92, 95, 95, 95, 92 },
                { 92, 32, 92, 47, 32, 47, 32, 47 },
                { 32, 92, 47, 95, 47, 95, 47 } };
        asciiDraw(shape); // calling asciiDraw method
    }

    public static void quoteGenerator() {
        /*
         * quoteGenerator generate quotes and the name of the person
         */
        Random rand = new Random(); // random object

        String[] names = { "Mahatma Gandhi", "Nikolas Tesla", "Eleanor Roosevelt", "Abraham Lincoln",
                "Ralph Waldo Emerson" }; // names of people
        // people
        String[] phrases = { "The best way to find yourself is to lose yourself in the service of others.",
                "I don\'t care that they stole my idea . . I care that they don\'t have any of their own", // quotes in
                                                                                                           // order
                "If life were predictable it would cease to be life and be without flavor.",
                "In the end, it\'s not the years in your life that count. It\'s the life in your years.",
                "Life is a succession of lessons which must be lived to be understood" };

        int randInt = rand.nextInt(0, names.length); // generating random number based on name array length
        System.out.println("As " + names[randInt] + " once said"); // name is acessed using random number as index
        System.out.println("\'" + phrases[randInt] + "\'"); // quote is acessed used random number as index

    }

    public static int average(int[] grades) {
        /*
         * average method returns avarage from array of grades
         */
        int total = 0; // total sum of scores

        // acessing through each grades
        for (int i : grades) {
            total += i; //
        }
        int average = total / 50; // total by 50 gives the avarage
        return average; // returing average
    }

    public static int failed(int[] grades) {
        /*
         * failed method return number of failed from grades array
         */
        int failed = 0;
        for (int i : grades) { // acessing grades
            /*
             * checking grade less than 40
             */
            if (i < 40) {
                failed++; // updating failed
            }
        }
        return failed; // return number of failed
    }

    public static void anagramCheck(String[] words) {
        /*
         * method to check anagram of a word from array of words
         */

        for (int i = 0; i < words.length; i++) {
            /*
             * getting each word
             */
            for (int j = i; j < words.length; j++) {
                /*
                 * getting other comparing words
                 */

                /*
                 * checking if the letters of the word and comparing word are equal after
                 * removing all whitespaces
                 * ensure the repeatation
                 */
                if (!(words[i].replaceAll(" ", "").equals(words[j].replaceAll(" ", "")))) {

                    char first[] = words[i].replaceAll(" ", "").toCharArray(); // turning word to charcter array and
                    char second[] = words[j].replaceAll(" ", "").toCharArray(); // second word to character array

                    Arrays.sort(first); // sorting the first character array
                    Arrays.sort(second); // sorting the second character array

                    if (Arrays.equals(first, second)) {
                        /*
                         * checking the first character array equal to second one
                         */
                        System.out.println(words[i] + " is anagram of " + words[j]);

                    }
                }
            }
        }
    }

    public static void asciiDraw(int[][] shape) {
        /*
         * asciiDraw method print the 2D diagram from 2D array
         * by casting the number to character
         */
        for (int i = 0; i < shape.length; i++) {
            /*
             * loop for number of lines
             */
            for (int j = 0; j < shape[i].length; j++) {
                /*
                 * loop for acessing the numbers from array
                 * and printing its character in a single line
                 */
                System.out.print((char) (shape[i][j]));
            }

            System.out.println(); // for new line
        }
    }
}
