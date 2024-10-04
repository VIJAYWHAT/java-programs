package JavaWorkshop.basics;
import java.util.List;

public class Exception {
    public static void main(String[] args) {
    myMethod();
    
}

    @SuppressWarnings({ "unchecked", "rawtypes", "deprecation" })
    private static void myMethod() {
        try {
            List list = (List) Class.forName("com.techatpark.practices.oops.HelloClass").newInstance();
            list.add("VJ");
            System.out.println(list);
        }
        catch(ClassNotFoundException cnf){
            System.out.println("Class ah kanam...");
        } catch (InstantiationException e) {
            System.out.println("Instance create panna mutiyalaa...");
        } catch (IllegalAccessException e) {
            System.out.println("You are under arrest!");
        }
    }
}
