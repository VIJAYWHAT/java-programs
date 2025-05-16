package oops;

import java.util.ArrayList;
import java.util.List;

public class Gerenics {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
    }
}
