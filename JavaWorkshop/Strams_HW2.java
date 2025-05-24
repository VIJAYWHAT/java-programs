import java.util.List;
import java.util.stream.Collectors;

public class Strams_HW2 {
    public static void main(String[] args) {
        List<Integer> rollNo = List.of(230001, 230002, 230003, 230004, 230005, 230006, 230007, 230008, 230009, 230010);

        List<Integer> oddRollNo = rollNo.stream()
                .filter(roll -> roll % 2 != 0)
                .collect(Collectors.toList());
        System.out.println("Odd Roll Numbers: " + oddRollNo);

        List<Integer> evenRollNo = rollNo.stream()
                .filter(roll -> roll % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even Roll Numbers: " + evenRollNo);

    }
}
