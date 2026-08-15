import java.util.*;

class TypingAccuracy {
    static void checkTypingAccuracy(String original, String typed) {
        int match = 0;
        int first = -1;

        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) == typed.charAt(i))
                match++;
            else if (first == -1)
                first = i;
        }

        double accuracy = (match * 100.0) / original.length();

        System.out.printf("Matched: %d/%d | Accuracy: %.2f%%",
                match, original.length(), accuracy);

        if (first == -1)
            System.out.println(" | No Mismatches");
        else
            System.out.println(" | First Mismatch at position " +
                    (first + 1) + " ('" + original.charAt(first) +
                    "' vs '" + typed.charAt(first) + "')");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Original: ");
        String original = sc.nextLine();

        System.out.print("Typed: ");
        String typed = sc.nextLine();

        checkTypingAccuracy(original, typed);
    }
}