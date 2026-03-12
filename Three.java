public class Three {
    public static void main(String[] args) {
        // Define and populate String array using String.join() at declaration
        String[] lines = {
            String.join("", "  ***  ", "  ***  ", " ***** ", " ***** "),
            String.join("", " *   * ", " *   * ", " *   * ", "*      "),
            String.join("", " *   * ", " *   * ", " *   * ", "*      "),
            String.join("", " *   * ", " *   * ", " ***** ", " ***** "),
            String.join("", " *   * ", " *   * ", " *     ", "      *"),
            String.join("", " *   * ", " *   * ", " *     ", "      *"),
            String.join("", "  ***  ", "  ***  ", " *     ", " ***** ")
        };

        // Use a for-each loop to print each line of the banner
        for (String line : lines) {
            System.out.println(line);
        }
        
        System.out.println("\nOOPS Banner App - UC5: Concept GenAI Video");
    }
}