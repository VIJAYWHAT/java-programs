public class GenericTest {

    public static void main(String[] args) {

        Pair<String, Integer> genericStudent = new Pair<>();
        genericStudent.setKey("Abhishek");
        genericStudent.setValue(34234);
        System.out.println("Name :" + genericStudent.getKey() + " Id :" + genericStudent.getValue());

        Pair<String, String> rmkStudent = new Pair<>();
        rmkStudent.setKey("Raja");
        rmkStudent.setValue("23USC013");

        System.out.println("Name :" + rmkStudent.getKey() + " Id :" + rmkStudent.getValue());
    }
}
