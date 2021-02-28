import java.util.ArrayList;
import java.util.List;

public class Multiples {
    public static void main(String[] args) {
        //Arraylist to hold values
        List<Integer> multiples = new ArrayList<>();

        //Loop over 0 - 999 and check if it's a multiple of 3 and five. If so, put it in the list
        for (int i = 0; i < 1000; i++) {
            if(i % 3 == 0 || i % 5 == 0){
                multiples.add(i);
            }
        }

        int total = 0;
        for (Integer multiple : multiples) {
            System.out.println(multiple);
            total += multiple;
        }

        System.out.println("The total for all multiples of 3 or 5 below 1000 is " + total + ".");
    }
}
