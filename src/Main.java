import java.util.*;

class WordLength {
    static void classifyWordLengths(String review) {
        String[] words = review.split(" ");
        int shortW = 0, medium = 0, longW = 0;

        for (String word : words) {
            int n = word.length();

            if (n <= 4)
                shortW++;
            else if (n <= 8)
                medium++;
            else
                longW++;
        }

        System.out.println("Short: " + shortW +
                " | Medium: " + medium +
                " | Long: " + longW);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter review: ");
        String review = sc.nextLine();

        classifyWordLengths(review);
    }
}