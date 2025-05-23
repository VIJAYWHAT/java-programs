import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Vijay", "Dinesh", "Kishore", "Madasamy", "Sangamithra", "Kirubasankar",
                "RajaDurai", "Sathish Kumar", "Sangamithra");

        // for (String name : names) {
        // printName(name);
        // }

        // names.forEach(name -> {
        // if (name.startsWith("S")) {
        // System.out.println(name);
        // }
        // });

        // names.forEach(System.out::println); // Method reference

        List<String> newList = names.stream()
                .filter(name -> name.startsWith("S")) // -> Lambda expression
                .distinct() // Remove duplicates
                .sorted() // Sort the names
                // .forEach(System.out::println); // Method reference // ps -ef | grep java
                // .count();
                .collect(Collectors.toList());
        System.out.println(newList);

        // System.out.println("Count: " + nameCount);
    }

    public static void printName(String name) {
        if (name.startsWith("S")) {
            System.out.println(name);
        }
    }
}
