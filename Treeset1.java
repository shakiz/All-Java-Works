/*
    Advantages
    1.TreeSet implements the SortedSet interface so duplicate values are not allowed.
    2.TreeSet does not preserve the insertion order of elements but elements are sorted by keys.
    3.TreeSet does not allow to insert Heterogeneous objects. It will throw classCastException at Runtime if trying to add hetrogeneous objects.
    4.TreeSet is basically implementation of a self-balancing binary search tree like Red-Black Tree. Therefore operations like add, 
    remove and search take O(Log n) time. And operations like printing n elements in sorted order takes O(n) time.
 */
package treeset.pkg1;

import java.util.TreeSet;

public class Treeset1 {

    public static void main(String[] args) {
        TreeSet ts5 = new TreeSet();
 
        // Uncommenting below  throws NoSuchElementException
        // System.out.println(ts5.first());
 
        // Uncommenting below throws NoSuchElementException
        // System.out.println(ts5.last());
 
        ts5.add("GeeksforGeeks");
        ts5.add("Compiler");
        ts5.add("practice");
 
        System.out.println(ts5.first()); // Compiler
        System.out.println(ts5.last()); //Practice
 
        // Elements less than O. It prints
        // [Compiler,GeeksforGeeks]
        System.out.println(ts5.headSet("O"));
 
        // Elements greater than or equal to G.
        // It prints [GeeksforGeeks, Practice]
        System.out.println(ts5.tailSet("G"));
 
        // Elements ranging from C to P
        // It prints [Compiler,GeeksforGeeks]
        System.out.println(ts5.subSet("C","P"));
 
        // Deletes all elements from ts5.
        ts5.clear();
 
        // Prints nothing
        System.out.println(ts5);
        
        /*TreeSet ts2= new TreeSet();
        ts2.add("A");
        ts2.add("B");
        ts2.add("C");
        ts2.add(null); // Throws NullPointerException*/
        
        TreeSet ts1= new TreeSet();
        ts1.add("A");
        ts1.add("B");
        ts1.add("C");
 
        // Duplicates will not get insert
        ts1.add("C");
 
        // Elements get stored in default natural
        // Sorting Order(Ascending)
        System.out.println(ts1);  // [A,B,C]
 
        // ts1.add(2) ; will throw ClassCastException
        //             at run time
    }
    
}
