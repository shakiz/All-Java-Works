
package array.printing.using.recursion;

import java.util.Scanner;

public class ArrayPrintingUsingRecursion {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number of elements on the array:");
        int size=scan.nextInt();
        int[] array=new int[size];
        for(int i=0;i<size;i++){
            array[i]=scan.nextInt();
        }
        arrayRecursion(0,array, size);
    }
    
    public static void arrayRecursion(int i,int[] array,int size){
        
        if(i<=size){
            System.out.println(array[i]+" "+array[size-1]);
            arrayRecursion(i+1, array, size-1);
        }
    }
    
}
