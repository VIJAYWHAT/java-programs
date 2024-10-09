package JavaWorkshop.basics;

public class TryBlock {
    public static int divite(int i ,int j){                 
        
        int ans=0;
        try{
            ans=i/j;
        }
        catch(ArithmeticException a){
            System.out.println("0 can't devide by any number...");
        }
        return ans;
    }
    public static void main(String[] args) {
        int Result = divite(15, 2);
        System.out.println(Result);
    }
}
