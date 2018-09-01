
package foreachinternalloop;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ForEAchInternalLoop {

    public static void main(String[] args) {
        
        Map<Integer,String> values=new HashMap<>();
        
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Enter the size of array:");
        int size=scan.nextInt();
        scan.nextLine();
        for(int i=0;i<size;i++){
            System.out.println("Enter key:");
            int key=scan.nextInt();
            scan.nextLine();
            System.out.println("Enter your name or value here :");
            String name=scan.nextLine();
            values.put(key, name);
        }
        
        Set<Integer> key=values.keySet();
        System.out.println("");
        for(int s: key){
            System.out.println(s+" : "+values.get(s));
        }
        values.foreach(i->System.out.println(i));
    }
    
}
