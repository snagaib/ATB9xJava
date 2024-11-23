package Nov2024.Collection_framework.Array_List.Basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//2. Iterating Through ArrayList
//    * What are the different ways to iterate through an ArrayList? Write a program to demonstrate them.
//    * If an ArrayList contains the elements [10, 20, 30, 40, 50], how would you use a loop to double each element in the list?
public class ArrList_iterate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> myNum = new ArrayList();

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter number"+(i+1)+":");
            int num = scanner.nextInt();
            myNum.add(num);

        }
        System.out.println(myNum);

        System.out.println("For loop");
        for (int i = 0; i < myNum.size(); i++){
            System.out.println(myNum.get(i));
        }

        System.out.println("For each");

        for (Object o : myNum){
            System.out.println(o);
        }

        System.out.println("Iterator");

        Iterator iterator = myNum.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


        System.out.println("Doubling");
        for (int i = 0; i < myNum.size(); i++) {
            int num = myNum.get(i);
            if (num == 10 || num == 20 || num == 30 || num == 40 || num == 50) {
                myNum.set(i, num * 2); // Double the value if condition is met
            }
        }
        System.out.println(myNum);


scanner.close();

    }
}
