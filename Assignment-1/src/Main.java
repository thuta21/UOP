import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a paragraph or a lengthy text:");
        String input = scanner.nextLine().trim();

        // Character Count
        int characterCount = input.length();
        System.out.println("Character Count: " + characterCount);

        // Word Count
        String[] words = input.split("\\s");
        int wordCount = words.length;
        System.out.println("Word Count: " + wordCount);

        // Most Common Character
        Map<Character, Integer> charFrequency = new HashMap<>();
        for (char c : input.toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }

        char mostCommonChar = ' ';
        int maxFrequency = 0;
        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            char currentChar = entry.getKey();
            if (Character.isLetter(currentChar) && entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mostCommonChar = currentChar;
            }
        }
        System.out.println("Most Common Character: " + mostCommonChar);


        // Character Frequency
        System.out.println("Enter a character to check its frequency:");
        char charToCheck = scanner.next().toLowerCase().charAt(0);
        int charFrequencyCount = charFrequency.getOrDefault(charToCheck, 0);
        System.out.println("Frequency of '" + charToCheck + "': " + charFrequencyCount);

        // Word Frequency
        System.out.println("Enter a word to check its frequency:");
        String wordToCheck = scanner.next().toLowerCase();
        int wordFrequencyCount = 0;
        for (String word : words) {
            if (word.equalsIgnoreCase(wordToCheck)) {
                wordFrequencyCount++;
            }
        }
        System.out.println("Frequency of '" + wordToCheck + "': " + wordFrequencyCount);

        // Unique Words
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
        int uniqueWordCount = uniqueWords.size();
        System.out.println("Unique Words Count: " + uniqueWordCount);
    }
}
