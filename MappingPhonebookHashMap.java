
package mapping.phonebook.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MappingPhonebookHashMap {

  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String,Integer> phonebook=new HashMap<String,Integer>();
        System.out.println("Enter phonebook length:");
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("Enter username:");
            String name = in.next();
            System.out.println("Enter user phone no:");
            int phone = in.nextInt();
            // Wentering the value into the map
            phonebook.put(name,phone);
        }

        while(in.hasNext()){
            System.out.println("Enter the key to search:");
            String s = in.next();
            if(phonebook.containsKey(s)){
                //getting the value by means of the key
                int value=phonebook.get(s);
                System.out.println(s+"="+value);
            }
            else{
                System.out.println("Not found");
            }
        }
        in.close();
    }
    
}
