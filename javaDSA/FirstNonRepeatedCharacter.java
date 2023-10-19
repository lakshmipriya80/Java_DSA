import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {
    public static char findFirstNonRepeatedCharacter1(String word) {  
                Map<Character, Integer> charCount = new LinkedHashMap<>();

     
        
        for (char c : word.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

       
        for (char c : word.toCharArray()) {
            if (charCount.get(c) == 1) {
                return c; 
            }
        }

       
        return '\0'; 
    }

    public static void main(String[] args) {
        String word = "programmingppr";
        char firstNonRepeatedChar = findFirstNonRepeatedCharacter1(word);
        
        if (firstNonRepeatedChar != '\0') {
            System.out.println("The first non-repeated character is: " + firstNonRepeatedChar);
        } else {
            System.out.println("No non-repeated character found in the word.");
        }
    }
}
