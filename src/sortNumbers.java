import java.util.Collections;
import java.util.Arrays;

public class sortNumbers {

    //variable to store array of numbers
    static Integer[] numberArray = new Integer[10];

    //methods to manipulate these numbers
    public void numberSort(int option, Integer newValue[]) {

        if(option == 1) {

            Arrays.sort(newValue);
            System.out.println("\nSorted Ascending Order Numbers: ");
            Arrays.stream(newValue).forEach(System.out::println);
            System.out.println("\n");

            numberArray = newValue;
        }

        if(option == 2) {

            Arrays.sort(newValue, Collections.reverseOrder());
            System.out.println("\nSorted Descending Order Numbers: ");
            Arrays.stream(newValue).forEach(System.out::println);
            System.out.println("\n");

            numberArray = newValue;
        }
    }
    
}