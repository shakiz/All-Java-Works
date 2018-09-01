
package listwithcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListWithComparator {

    public static void main(String[] args) {
        // TODO code application logic here
        List<Integer> list=new ArrayList<Integer>();
        
        list.add(101);
        list.add(109);
        list.add(102);
        list.add(108);
       
        System.out.println("Before sorting:");
        for(int i: list){
            System.out.println(i);
        }
        //sorting the list by using sort method
        Collections.sort(list);
        System.out.println("After sorting:");
        for(int i : list){
            System.out.println(i);
        }
        
        Comparator<Integer> com=new ComClass();
        
        Collections.sort(list,com);
        System.out.println("After sorting with the last no:");
        for(int i : list){
            System.out.println(i);
        }
    }
    
    public static class ComClass implements Comparator<Integer>{

        @Override
        public int compare(Integer t, Integer t1) {
            if(t%10>t1%10)
                return 0;
            return -1;
        }
        
    }
    
}
