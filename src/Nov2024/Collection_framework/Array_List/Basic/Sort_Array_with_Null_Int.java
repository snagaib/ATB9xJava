package Nov2024.Collection_framework.Array_List.Basic;
//3. Sorting an ArrayList
//    * Write a program to sort an ArrayList of strings in ascending and descending order.
//    * What happens if the ArrayList contains null elements while sorting?
//
//    Sorting null throws exception with Intergers. try with String though

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sort_Array_with_Null_Int {
    public static void main(String[] args) {
        ArrayList<Integer> myNum = new ArrayList<>();
        myNum.addAll(Arrays.asList(10,24,65,34,76));

        myNum.add(36);


        System.out.println(myNum);

        Collections.sort(myNum);

        System.out.println(myNum);

       // myNum.add(null);
        //Collections.sort(myNum);


        System.out.println(myNum);







    }
}
