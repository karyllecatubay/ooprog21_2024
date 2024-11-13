import java.util.Scanner;

public class SpoonerismGenerator {

    public static String getWord(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.next();
    }

    public static int vowelIndex(String word) {
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < word.length(); i++) {
            if (vowels.indexOf(word.charAt(i)) != -1) {
                return i;
            }
        }
        return -1; 
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);

        String word1 = getWord(scanner, "Word 1: ");
        String word2 = getWord(scanner, "Word 2: ");

        int vowelIndex1 = vowelIndex(word1);
        int vowelIndex2 = vowelIndex(word2);

        if (vowelIndex1 > 0 && vowelIndex2 > 0) {
            String consonants1 = word1.substring(0, vowelIndex1);
            String consonants2 = word2.substring(0, vowelIndex2);
            String restOfWord1 = word1.substring(vowelIndex1);
            String restOfWord2 = word2.substring(vowelIndex2);

            String spoonerizedWord1 = consonants2 + restOfWord1;
            String spoonerizedWord2 = consonants1 + restOfWord2;

            System.out.println("First character: " + word1.charAt(0)); 
            System.out.println("Second character: " + word2.charAt(0));
            System.out.println("When spoonerized, " + word1 + " and " + word2 + " become " + spoonerizedWord1 + " and " + spoonerizedWord2 + ".");
        } else {
            System.out.println("The " + word1 + " and " + word2 +" cannot be spoonerized.");
        }

        scanner.close();
    }

    public static void main(String[] args) {
        run();
    }
}
