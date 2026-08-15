import java.util.*;

class WordFrequency {
    static void printFilteredWordFrequency(String feedback) {
        String[] stop = {"the","was","and","a","is","of","in"};

        feedback = feedback.toLowerCase()
                .replace(".", "")
                .replace(",", "");

        String[] words = feedback.split("\\s+");
        HashMap<String, Integer> map = new HashMap<>();

        for (String w : words) {
            boolean skip = false;

            for (String s : stop)
                if (w.equals(s))
                    skip = true;

            if (!skip)
                map.put(w, map.getOrDefault(w, 0) + 1);
        }

        ArrayList<Map.Entry<String,Integer>> list =
                new ArrayList<>(map.entrySet());

        list.sort((x, y) -> y.getValue() - x.getValue());

        for (Map.Entry<String,Integer> e : list)
            System.out.println(e.getKey() + ": " + e.getValue());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter feedback: ");
        printFilteredWordFrequency(sc.nextLine());
    }
}