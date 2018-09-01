
package collections;

import java.util.ArrayList;
import java.util.List;


public class Collections {

    public static void main(String[] args) {
        //creating a string array
        String name1[]={"Sagor","Jahid","Shakil"};
        //creating a list to store those strings taken from array
        List<String> list1=new ArrayList<String>();
        
        for(String refofname1:name1){
            list1.add(refofname1);
        }
        
        for(int i=0;i<list1.size();i++){
            System.out.println("Name of room one is:"+list1.get(i));
        }
        
        System.out.println("");
        
        //creating a string array
        String name2[]={"Koushik","Faisal","Shuvo"};
        //creating a list to store those strings taken from array
        List<String> list2=new ArrayList<String>();
        
        for(String refofname2:name2){
            list2.add(refofname2);
        }
        for(int i=0;i<list2.size();i++){
            System.out.println("Name of room two is:"+list2.get(i));
        }
    }
    
}
