package loopingthrougharraylist;

import java.util.ArrayList;

public class LoopingThroughArraylist {

    public static void main(String[] args) {
        //there are four ways to loop through arraylist
        //for loop,enhanced for loop,while loop,iterator
        
        ArrayList<String> arraylist=new ArrayList<String>();
        
        //adding  value to the arraylist
        arraylist.add("Shakil");
        arraylist.add("Jahid");
        arraylist.add("Rashed");
        arraylist.add("Sagor");
        arraylist.add("Faisal");
        arraylist.add("koushik");
        arraylist.add("Shuvo");
        
        //for looping
        for(int counter=0;counter<arraylist.size();counter++){
            System.out.println("Name is :"+arraylist.get(counter));
        }
        System.out.println("\n\n");
        //enhanced for looping
        for(String name:arraylist){
            System.out.println("Name is :"+name);
        }
    }
    
}
