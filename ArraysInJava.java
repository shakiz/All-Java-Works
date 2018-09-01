
package arraysinjava;

import java.util.Scanner;

public class ArraysInJava {

 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int element;
        System.out.println("Enter size of the array:");
        int size=sc.nextInt();
        int array1[]=new int[size];
        System.out.println("Enter elements to the array:");
        for(int i=0;i<size;i++){
            element=sc.nextInt();
            array1[i]=element;
        }
        
        for(int i : array1){
            System.out.println("Element is:"+i);
        }
        array a=new array();
        a.passArray(array1);
    }    
}
class array{
        public void passArray(int[] array2){
            System.out.println("Prinrting from the class.");
            for(int i : array2){
                System.out.println("Element is:"+i);
            }
        }
}
