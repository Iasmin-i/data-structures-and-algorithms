public class SubstringExample {
    public static void main(String[] args) {
        String sentence = "Kimi ni Todoke";

        // Getting a substring from index 0 to 4 (excludes index 4)
        String part1 = sentence.substring(0, 4);
        System.out.println(part1); // Output: "Kimi"

        // Getting a substring from index 7 to the end
        String part2 = sentence.substring(7);
        System.out.println(part2); // Output: "Todoke"
    }
}