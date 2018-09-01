package treemapimplementation;
import java.util.Map;
import java.util.TreeMap;

//Advantages of treemap
/*
    1.No duplication of value
    2.Maintain order
    3.Uses red black tree which ensures no duplication
    4.For operations like add, remove, containsKey, time complexity is O(log n where n is number of elements present in TreeMap.
    5.TreeMap always keeps the elements in a sorted(increasing) order, while the elements in a HashMap have no order. 
      TreeMap also provides some cool methods for first, last, floor and ceiling of keys.
*/
public class TreeMapImplementation {

    public static void main(String[] args) {
        TreeMap<Integer,Integer> map=new TreeMap<Integer,Integer>();
        int[] array={1,1,1,2,3,4,5,23,2,2,2,43,23};
        for(int i=0;i<array.length;i++){
            Integer c=map.get(array[i]);
            if(c==null){
                map.put(array[i], 1);
            }
            else{
                map.put(array[i], ++c);
            }
        }
        for(Map.Entry mmap:map.entrySet()){
            //prints an tree map with no duplication of value
            System.out.println("Key:"+mmap.getKey()+"Values:"+mmap.getValue());
        }
    }
    
}

