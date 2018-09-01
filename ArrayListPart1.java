/*
    Characteristics in arraylist:
    1.ArrayList inherits AbstractList class and implements List interface.
    2.ArrayList is initialized by a size, however the size can increase if collection grows or shrunk if objects are removed from the collection.
    3.Java ArrayList allows us to randomly access the list.
    4.ArrayList can not be used for primitive types, like int, char, etc. We need a wrapper class for such cases (see this for details).
    5.ArrayList in Java can be seen as similar to vector in C++.
 */
package arraylist.part1;

import java.util.ArrayList;

public class ArrayListPart1 {

    public static void main(String[] args) {
        // size of ArrayList
        int n = 5;
 
        //declaring ArrayList with initial size n
        ArrayList<Integer> arrli = new ArrayList<Integer>(n);
 
        // Appending the new element at the end of the list
        for (int i=1; i<=n; i++){
            arrli.add(i);
        }
        // Printing elements
        System.out.println(arrli);
 
        // Remove element at index 3
        arrli.remove(3);
 
        // Displaying ArrayList after deletion
        System.out.println(arrli);
 
        // Printing elements one by one
        for (int i=0; i<arrli.size(); i++)
            System.out.print(arrli.get(i)+" ");
    }
    
}
