/*
    Characteristics of hashset
    1.As it implements the Set Interface, duplicate values are not allowed.
    2.Objects that you insert in HashSet are not guaranteed to be inserted in same order. Objects are inserted based on their hash code.
    3.NULL elements are allowed in HashSet.
    4.HashSet also implements Searlizable and Cloneable interfaces.
 */
package hashset.part.pkg1;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetPart1 {

    public static void main(String[] args) {
        HashSet set=new HashSet<>();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter hashset size:");
        int size=scan.nextInt();
        for(int i=0;i<size;i++){
            System.out.println("Element:");
            String element=scan.next();
            set.add(element);
        }
        System.out.println(set);
        
        System.out.println("Enter key to check availability:");
        String check=scan.next();
        if(set.contains(check)){
            System.out.println("Yes ,your key "+check+" is avialable into the hashset.");
        }
        else{
            System.out.println("No ,your key "+check+" is not avialable into the hashset.");
        }
        System.out.println(set);
    }
    
}
