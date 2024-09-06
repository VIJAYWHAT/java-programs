import java.util.*;

class student {
    
    private int id;
    private String name;
    private long number;
    
    
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNumber(long number) {
        this.number = number;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    
    public long getNumber() {
        return number;
    }
      
}

class marks extends student {

    private int tamil;
    private int english;
    private int maths;
    private int science;
    private int social;

    public void setTamil(int tamil) {
        this.tamil = tamil;
    }
    public void setEnglish(int english) {
        this.english = english;
    }
    public void setMaths(int maths) {
        this.maths = maths;
    }
    public void setScience(int science) {
        this.science = science;
    }
    public void setSocial(int social) {
        this.social = social;
    }
    
    public int getTamil() {
        return tamil;
    }
    public int getEnglish() {
        return english;
    }
    public int getMaths() {
        return maths;
    }
    public int getScience() {
        return science;
    }
    public int getSocial() {
        return social;
    }
}

public class studentsDetails {
    
    public static void main(String... args) {
        
        marks s1 = new marks();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n=============================");
        
        System.out.print("Enter student roll NO: "); s1.setId(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter student name: "); s1.setName(sc.nextLine());
        System.out.print("Enter student mobile number: "); s1.setNumber(sc.nextLong());
        System.out.print("Enter Tamil mark: "); s1.setTamil(sc.nextInt());
        System.out.print("Enter English mark: "); s1.setEnglish(sc.nextInt());
        System.out.print("Enter Maths mark: "); s1.setMaths(sc.nextInt());
        System.out.print("Enter Science mark: "); s1.setScience(sc.nextInt());
        System.out.print("Enter social: "); s1.setSocial(sc.nextInt());
        
        
        System.out.println("=============================");
        System.out.println("Student Roll: " + s1.getId());
        System.out.println("Student Name: " + s1.getName());
        System.out.println("Student Mobile NO: " + s1.getNumber());
        System.out.println("=============================");
        System.out.println("Tamil mark:" + s1.getTamil());
        System.out.println("English mark: " + s1.getEnglish());
        System.out.println("Maths work: " + s1.getMaths());
        System.out.println("Scince mark: " + s1.getScience());
        System.out.println("Social mark: " + s1.getSocial() ) ;
        System.out.println("=============================");

    }
}
