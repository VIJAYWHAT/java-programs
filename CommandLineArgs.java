public class CommandLineArgs{

        public static void main(String[] args){

                String Name = args[0];

                System.out.println("Name: " + Name);

                int ArgsLength = args.length;

                if(ArgsLength > 1){

                        String FirstArgs = args[0];
                        System.out.println("First Name : " + FirstArgs);

                        String LastArgs = args[ArgsLength-1];
                        System.out.println("Last Name : "+ LastArgs );
                        
                }

        }
}
