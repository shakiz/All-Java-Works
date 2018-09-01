package hashmap.part1;

import java.util.HashMap;
import java.util.Scanner;

//advantages of hashmap
/*
    1.If no synchronization is needed
    2.fast to insert ,search or delete
    3.Updated version of hashtable
    4.Stores values against key and support only one null key and multiple null values
*/

public class HashMapPart1 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        HashMap<String,Long> map=new HashMap<>();
        print(map);
        System.out.println("Enter size of phonebook:");
        int size=scan.nextInt();
        for(int i=0;i<size;i++){
            System.out.println("Key:");
            String key=scan.next();
            System.out.println("Value:");
            long value=scan.nextLong();
            map.put(key,value);
        }
        print(map);
        System.out.println("Enter key to get value:");
        String getKey=scan.next();
        if(map.containsKey(getKey)){
            long getValue=map.get(getKey);
            System.out.println("The value for key : "+getKey+" is : "+getValue);
        }
        else{
            System.out.println("No results found.");
        }
        System.out.println("Size of the map or phonebook:"+map.size());
    }
    
    public static void print(HashMap<String,Long> map){
        if(map.isEmpty()){
            System.out.println("PhoneBook is empty.");
        }
        else{
            System.out.println(map);
        }
    }
    
}
