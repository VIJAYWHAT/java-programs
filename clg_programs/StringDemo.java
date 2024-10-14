package clg_programs;

class StringDemo {
    public static void main(String args[]) {
        // charAt example
        char ch;
        ch = "abcd".charAt(1);
        System.out.println("charAt: ");
        System.out.println(ch);

        // String Concatenation example
        String age = "9";
        System.out.println("String Concatenation: ");
        String s1 = "He is " + age + " years old";
        System.out.println(s1);

        // String length example
        char chars[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        String s2 = new String(chars);
        System.out.println("String length:");
        System.out.println(s2.length());

        // Using start index in string constructor
        char Chars[] = {'a', 'b', 'c'};
        String s3 = new String(chars, 1, 2);
        System.out.println("Using start index:");
        System.out.println(s3);

        // Substring examples
        String s4 = "javapoint";
        System.out.println("Substring examples:");
        System.out.println(s4.substring(2, 4));  // Output: "va"
        System.out.println(s4.substring(2));     // Output: "vapoint"
        System.out.println("Full String: " + s4);

        // String replace example
        String s5 = "Hello".replace('l', 'w');
        System.out.println("String replace:");
        System.out.println(s5);

        // String equals method
        String s6 = "hello";
        String s7 = "HELLO";
        System.out.println("Equals method:");
        System.out.println(s6 + " equals " + s7 + " == " + s6.equals(s7));

        // Searching strings (indexOf and lastIndexOf)
        String s8 = "This is index example";
        int index1 = s8.lastIndexOf("is");
        int index2 = s8.indexOf("index");
        System.out.println("Searching strings:");
        System.out.println("Last index of 'is': " + index1);
        System.out.println("Index of 'index': " + index2);

        // String trim method
        String s9 = " hello ";
        System.out.println("Trim method:");
        System.out.println(s9 + "how are you");
        System.out.println(s9.trim() + " how are you");
    }
}
