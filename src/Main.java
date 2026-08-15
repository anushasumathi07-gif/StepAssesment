import java.util.*;

class Inventory {
    static void parseInventoryRecord(String csvLine) {
        String[] a = csvLine.split(",");

        if (a.length != 3)
            System.out.println("Invalid Record");
        else
            System.out.println("Product: " + a[0] +
                    " | SKU: " + a[1] + " | Qty: " + a[2]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter CSV: ");
        parseInventoryRecord(sc.nextLine());
    }
}