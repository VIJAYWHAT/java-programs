class for_loop{
    public static void main(String[] args){

        String[] cars = {"audi","BMW","chevrolet","Ford"};

        for(String car : cars)
            System.out.println("I like " + car);

        System.out.println();

        for(int i = 0; i < cars.length;i++)
            System.out.println("I love " + cars[i]);

        System.out.println();
        
        for(int j = 0; j < 4; j++)
            System.out.println("I loves " + cars[j]);
        
    }
}