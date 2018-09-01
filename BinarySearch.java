package binary.search;

import java.util.Scanner;

/**
 * Based on the sorted array
 * Divide the array by means of middle index
 * The if the search value is greater than the middle index take only the right half array
 * Else if the search element id less than the middle element then take only the left element
 * Else if the middle element is equal to the search element then value is found
 */
public class BinarySearch {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Array size:");
        int size=scan.nextInt();
        int start=0;
        int end=size;
        int[] array=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Element in array:");
            int element=scan.nextInt();
            array[i]=element;
        }
        System.out.println("Enter the value to be searhed:");
        int value=scan.nextInt();
        binarySearch(array,start,end,value);
    }
    
    
    public static void binarySearch(int[] array,int start,int end,int svalue){
        int middle=0;
        middle=(start+end)/2;
        if(start<=end){
            if(array[middle]>svalue){
                end=middle-1;
                middle=(start+end)/2;
                System.out.println("Value found at the position:"+middle+" and the value is :"+array[middle]);
            }
            else if(array[middle]<svalue){
                start=middle+1;
                middle=(start+end)/2;
                System.out.println("Value found at the position:"+middle+" and the value is :"+array[middle]);
            }
            else if(array[middle]==svalue){
                System.out.println("Value found at the position:"+middle+" and the value is :"+array[middle]);
            }
        }
    }
    
}
