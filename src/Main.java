import java.util.*;

class SeatDuplicate {
    static void checkDuplicateSeats(int[] a) {
        boolean found = false;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.println("Duplicate Seat Number Found: " + a[i]);
                    found = true;
                    break;
                }
            }
        }

        if (!found)
            System.out.println("No Duplicate Seats Found");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of seats: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter seat numbers:");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        checkDuplicateSeats(a);
    }
}