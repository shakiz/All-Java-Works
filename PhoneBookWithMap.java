
package phonebookwithmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PhoneBookWithMap {


    public static void main(String[] args) {
        
        Map<String,String> phonebook=new HashMap<>();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your phonebook size:");
        int size=scan.nextByte();
        scan.nextLine();
        for(int i=0;i<size;i++){
            System.out.println("Enter name :");
            String name=scan.nextLine();
            System.out.println("Enter phone number:");
            String mobile_no=scan.nextLine();
            phonebook.put(name,mobile_no);
        }
        
        Set<String> key=phonebook.keySet();
        System.out.println("");
        for(String s: key){
            System.out.println(s+" : "+phonebook.get(s));
        }
        
    }
    
}
