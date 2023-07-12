import java.util.Scanner;

public class StudentsList {
    public static void main(String... args) 
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Number Of Students: ");
        int n = s.nextInt();
        s.nextLine();

        String[] name = new String[n];
        int[] age = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter Student " + (i + 1) + " Name: ");
            name[i] = s.nextLine();

            System.out.print("Enter Student " + (i + 1) + " Age: ");
            age[i] = s.nextInt();
            s.nextLine(); 
        }
        
        System.out.println("\n==========================");

        System.out.println("\nStudents Details:");
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.println("Name: " + name[i]);
            System.out.println("Age: " + age[i]);
            System.out.println();
        }

        int eldest = 0;
        int youngest = 0;

        for (int i = 1; i < n; i++) {
            if (age[i] > age[eldest]) {
                eldest = i;
            }

            if (age[i] < age[youngest]) {
                youngest = i;
            }
        }

        System.out.println("No Of Students: " + n);

        System.out.println("Eldest Student:");
        System.out.println("Name: " + name[eldest]);
        System.out.println("Age: " + age[eldest]);

        System.out.println("\nYoungest Student:");
        System.out.println("Name: " + name[youngest]);
        System.out.println("Age: " + age[youngest]);
    }
}
