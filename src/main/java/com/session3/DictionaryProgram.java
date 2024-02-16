import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Homework
//1.  Create a new variable dictionary that is a Map where keys represent words and values represent their definitions
//2. Create a method that initializes the dictionary with some words and definitions:
//java: A high-level, class-based, object-oriented programming language.
//algorithm: A set of steps or rules to be followed in problem-solving or calculation.
//variable: A storage location identified by a memory address and an associated symbolic name.
//loop: A sequence of statements that is specified once but executed repeatedly.
//dictionary: A collection of words and their definitions.
//3. Create a new variable that reads data from keyboard, print the message “Enter a new word:”
//4. Create a method called consultWord() that receives the dictionary and a string attribute <word> and prints on the screen the word
// and its definition if that word is present in the dictionary, otherwise displays a custom message, i.e. “Word <word> not found!”
//5. Create a method called defineWord(), the user can give a definition for it, the dictionary is updated with the new word and the new definition.
//6. The program must run until the user inserts the word “exit”

public class DictionaryProgram {
    public static Map<String, String> dictionary =new HashMap<>();
    public static void main(String[] args) {
        initializeDictionary();
        Scanner scanner1 = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a new word (type 'exit' to stop):");
            String word = scanner1.next();

            if (word.equalsIgnoreCase("exit")) {
                break;
            }
            consultWord(word);
            defineWord(word, scanner1);
        }
        System.out.println("Exiting the program.");
        scanner1.close();
    }
    private static void initializeDictionary() {
        dictionary.put("java", "A high-level, class-based, object-oriented programming language.");
        dictionary.put("algorithm", "A set of steps or rules to be followed in problem-solving or calculation.");
        dictionary.put("variable", "A storage location identified by a memory address and an associated symbolic name.");
        dictionary.put("loop", "A sequence of statements that is specified once but executed repeatedly.");
        dictionary.put("dictionary", "A collection of words and their definitions.");
    }
    public static void consultWord(String word) {
        if (dictionary.containsKey(word)) {
            System.out.println("Definition of '" + word + "': " + dictionary.get(word));
        } else {
            System.out.println("Word '" + word + "' not found!");
        }
    }
    private static void defineWord(String word, Scanner scanner){
        System.out.println("Do you want to define '" + word + "'? (yes/no)");
        String response = scanner.next();
        if (response.equalsIgnoreCase("yes")) {
            System.out.println("Enter the definition for '" + word + "':");
            String definition = scanner.nextLine(); // Consume the newline character
            definition = scanner.nextLine(); // Read the actual input
            dictionary.put(word, definition);
            System.out.println("Word '" + word + "' defined successfully!");
        }
    }
}
