/*
    Advantages of LinkedHashSet
    1.Contains unique elements only like HashSet. It extends HashSet class and implements Set interface.
    2.Maintains insertion order.
 */
package linkedhashset.pkg1;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class LinkedHashSet1 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        LinkedHashSet<String> linkedhashset=new LinkedHashSet<>();
        System.out.println("Enter linkedhashset size:");
        int size=scan.nextInt();
        for(int i=0;i<size;i++){
            System.out.println("Enter element:");
            String element=scan.next();
            linkedhashset.add(element);
        }
        System.out.println("Element in linkedhashset:");
        for(String s:linkedhashset){
            System.out.print(s+"\t");
        }
        
    }
    
}
