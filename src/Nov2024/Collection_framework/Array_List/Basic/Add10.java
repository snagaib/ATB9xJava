package Nov2024.Collection_framework.Array_List.Basic;
import java.util.ArrayList;
//1. Creating and Manipulating ArrayList
//    * Write a program to create an ArrayList of integers. Add 10 numbers to the list, remove the 5th element, and print the modified list.
//    * How would you check if an ArrayList is empty? Write a code snippet.

public class Add10 {
    public static void main(String[] args) {
        ArrayList<Integer> myNum = new ArrayList<Integer>();
        myNum.add(1);
        myNum.add(2);
        myNum.add(3);
        myNum.add(4);
        myNum.add(5);
        myNum.add(6);
        myNum.add(7);
        myNum.add(8);
        myNum.add(9);
        myNum.add(10);

        myNum.remove(4);

       //for(int i : myNum){
           System.out.println(myNum);

        //System.out.println(myNum.isEmpty());
if(myNum.isEmpty()){
    System.out.println("List empty");
}
else {
    System.out.println("Not empty");
}
        //}


    }
}
