public class MatchingBracket {
    public static void main(String[] args) {
        char[] input = {'{', '{', '}', '{', '{'};

        if (hasMatchingBrackets(input)) {
            System.out.println("Yes, there is at least one matching bracket pair.");
        } else {
            System.out.println("No matching bracket pairs found.");
        }
    }

    public static boolean hasMatchingBrackets(char[] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] == '{' && input[j] == '}') {
                    return true; 
                }
            }
        }

        return false; 
    }
}
