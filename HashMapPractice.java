package hashmap.practice;

import java.util.HashMap;
import java.util.Scanner;

class mMap{
    public void addItem(HashMap<Integer,Integer> map,int key,int value){
        map.put(key, value);
        System.out.println("Value added");
    }
    public int mapSize(HashMap<Integer,Integer> map){
        return map.size();
    }
    public HashMap removeItem(HashMap<Integer,Integer> map,int key){
        map.remove(key);
        return map;
    }
    public int checkavialability(HashMap<Integer,Integer> map,int key){
        if(map.containsKey(key)){
            return map.get(key);
        }
        else{
            return -1;
        }
    }
}
public class HashMapPractice {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        HashMap<Integer,Integer> map=new HashMap<>();
        mMap mmap=new mMap();
        System.out.println("Enter map size:");
        int size=scan.nextInt();
        System.out.println("Enter map elements:");
        for(int i=0;i<size;i++){
            System.out.println("Value:");
            int value=scan.nextInt();
            mmap.addItem(map, i, value);
        }
        
        System.out.println("Enter your operation:");
        System.out.println("[1].Remove item"+"\n+"+"[2].Map Size"+"\n"+"[3].Check Value");
        int choice=scan.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter key to remove item:");
                int key=scan.nextInt();
                if(map.containsKey(key)){
                    System.out.println(""+mmap.removeItem(map, key));;
                }
                break;
            case 2:
                System.out.println("Map size:"+mmap.mapSize(map));
                break;
            case 3:
                System.out.println("Enter key to search or get item:");
                int key1=scan.nextInt();
                System.out.println(""+mmap.checkavialability(map, key1));
                break;
                
        }
    }
    
}
