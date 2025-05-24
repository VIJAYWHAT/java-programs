import java.util.List;

public class Streams_HW1 {
    public static void main(String[] args) {
        List<Integer> salaries = List.of(10000, 25000, 55000, 60000, 30000, 120000, 75000, 150000);

        long salary50k = salaries.stream()
                .filter(salary -> salary > 50000)
                .count();

        long salary1L = salaries.stream()
                .filter(salary -> salary > 100000)
                .count();

        System.out.println("Count of salaries above 50k: " + salary50k);
        System.out.println("Count of salaries above 1L: " + salary1L);
    }
}
