
package iterator.in.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class IteratorInJava {

    
    public static void main(String[] args) {
        //creating a string array
        String name1[]={"Sagor","Jahid","Shakil","Faisal","Shuvo"};
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
        System.out.println("");
        editList(list1,list2);
        for(int i=0;i<list1.size();i++){
            System.out.println("Name of room two is:"+list1.get(i));
        }
    }

    private static void editList(Collection<String> l1, Collection<String> l2) {
        Iterator<String> itList1=l1.iterator();
        
        while(itList1.hasNext()){
            if(l2.contains(itList1.hasNext())){
                l2.remove(l2);
            }
        }
    }
    
}
