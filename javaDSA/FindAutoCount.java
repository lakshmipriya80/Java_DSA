
import java.util.Scanner;

public class FindAutoCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String userInput = scanner.nextLine();

        int result = FindAutoCount1(userInput);
        System.out.println("Output: " + result);

        scanner.close();
    }

    public static int FindAutoCount1(String n) {
        if (n == null) {
            return 0;
        }

        int length = n.length();
        int[] count = new int[10];

        for (int i = 0; i < length; i++) {
            char c = n.charAt(i);
            if (c >= '0' && c <= '9') {
                count[c - '0']++;
            }
        }

        for (int i = 0; i < length; i++) {
            if (n.charAt(i) - '0' != count[i]) {
                return 0;
            }
        }

        int distinctCount = 0;
        for (int i = 0; i < 10; i++) {
            if (count[i] > 0) {
                distinctCount++;
            }
        }

        return distinctCount;
    }
}