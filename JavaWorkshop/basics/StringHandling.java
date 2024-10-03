public class StringHandling {
    private static String getString() {
        String string = "This is my first string program,I don't want to mess up with this";
        return string;
    }
    
    public static void main(String[] args) {
    
        String string = getString();
        String[] splitsent = string.split("\\,");
        for (String sentence : splitsent) {
            System.out.println("Divideing Two Sentence");
            System.out.println(sentence);
        }
    
        int count = 0;
        int countSpaces = 0;
    
    
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'i') {
                count++;
            }
            if (string.charAt(i) == ' ') {
                countSpaces++;
            }
    
        }
        System.out.println("Counting i");
        System.out.println("The letter 'i' appears " + count + " times in the sentence.");
    
        System.out.println("Counting spaces");
        System.out.println("The spaces appears " + countSpaces + " time in the sentence");
    
        String[] words = string.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    
        StringBuilder CamelCase = new StringBuilder();
        boolean nextUpperCase = false;
        for (char c : string.toCharArray()) {
            if (c == ' ' || c == ',') {
                nextUpperCase = true;
            } else {
                if (nextUpperCase) {
                    CamelCase.append(" ")
                            .append(Character.toUpperCase(c));
                    nextUpperCase = false;
                } else {
                    CamelCase.append(Character.toLowerCase(c));
                }
            }
        }

        System.out.println("CamelCase words: " + CamelCase);
    }
}
