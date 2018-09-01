package arraylistinjava;

import java.util.ArrayList;

public class ArrayListInJava {
    
    public static void main(String[] args) {
        
        //declaring the arraylist
        ArrayList<String> arrayList=new ArrayList<String>();
        
       //adding  value to the arraylist
        arrayList.add("Shakil");
        arrayList.add("Jahid");
        arrayList.add("Rashed");
        arrayList.add("Sagor");
        arrayList.add("Faisal");
        arrayList.add("koushik");
        arrayList.add("Shuvo");
        
        System.out.println("Names are : "+arrayList+"\n");
        
        //adding an another index at 0
        System.out.println("Names in arraylist are:"+arrayList);
        arrayList.add(0,"Sakhawat Hossain");
        System.out.println("After changing new names are : "+arrayList+"\n");
        
        //removinf by indexing
        System.out.println("Names in arraylist are:"+arrayList);
        arrayList.remove(0);
        System.out.println("After removing in indexing new names are : "+arrayList+"\n");
        
        //removing by an object 
        arrayList.remove("Sagor");
        System.out.println("Names in arraylist are:"+arrayList);
        System.out.println("After removing with object new names are :"+arrayList+"\n");
        
        //updating
        arrayList.set(1,"Sakhawat Shakil");
        System.out.println("Names in arraylist are:"+arrayList);
        System.out.println("Printing the updated arraylist : "+arrayList+"\n");
        
        //getting index of an object
        //if the object doesnot appear in the arraylist then it will return -1
        int length=arrayList.indexOf("Shakil");
        System.out.println("Names in arraylist are:"+arrayList);
        System.out.println("The index of desire object is :"+length+"\n");
        
        //getting an object by the help of index
        String string=arrayList.get(0);
        System.out.println("Names in arraylist are :"+arrayList);
        System.out.println("The desire object is :"+string+"\n");
        
        //getting the arraylist size
        int sizeOfTheArray=arrayList.size();
        System.out.println("Names in arraylist are :"+arrayList);
        System.out.println("The dsize of the arraylist is :"+sizeOfTheArray+"\n");
        
        //confirming that a value is in the list or not
        //and if it appears in the arraylist it will return true else false
        System.out.println("Names in arraylist are:"+arrayList);
        System.out.println(""+arrayList.contains("Shakil"));
        System.out.println(""+arrayList.contains("Shaki"));
        
        //deleting or clearing all the elements in the arraylist
        System.out.println("Names in arraylist are:"+arrayList);
        arrayList.clear();
        System.out.println("After clearing :"+arrayList);
    }
    
}
