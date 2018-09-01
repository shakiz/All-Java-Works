package linkedhashmap;


import java.util.HashMap;
import java.util.LinkedHashMap;
//Advantages of LinkedHashMap
/*
    1.A LinkedHashMap contains values based on the key. It implements the Map interface and extends HashMap class.
    2.It contains only unique elements (See this for details)..
    3.It may have one null key and multiple null values (See this for details).
    4.It maintains insertion order. For example, when we ran the code with HashMap, we got different oder of elements (See this).
*/
public class LinkedhashMap {

    public static void main(String[] args) {
        LinkedHashMap<String,String> phonebook=new LinkedHashMap<>();
        //insert based on the order
        phonebook.put("Shakil","01739574727");
        phonebook.put("Sagor","01688655785");
        phonebook.put("rashed","01761265800");    
        System.out.println(phonebook);
        System.out.println("Size of linkedhashmap:"+phonebook.size());
        
        
        //insert not in the base of order
        HashMap<String,String> phonebook2=new HashMap<>();
        phonebook2.put("Shakil","01739574727");
        phonebook2.put("Sagor","01688655785");
        phonebook2.put("rashed","01761265800");    
        System.out.println(phonebook2);
        System.out.println("Size of hashmap:"+phonebook2.size());
    }
    
}
