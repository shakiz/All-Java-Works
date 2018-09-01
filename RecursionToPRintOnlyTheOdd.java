
package recursion.to.print.only.the.odd;

import java.util.Scanner;


public class RecursionToPRintOnlyTheOdd {

  
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter array size:");
        int size=scan.nextInt();
        int[] array=new int[size];
        for(int i=0;i<size;i++){
            array[i]=scan.nextInt();
        }
        
        returnodd(array, size);

    }
    
    public static void returnodd(int[] array,int size){
        for(int i=0;i<size;i++){
            if(array[i]%2==0){
                for(int j=0;j<1;j++){
                    array[j]=array[i];
                    System.out.println("Element of even number sinto the array:"+array[j]);
                }
            }
        }

    }
    
}
