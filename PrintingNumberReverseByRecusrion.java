
package printing.number.reverse.by.recusrion;

import java.util.Scanner;


public class PrintingNumberReverseByRecusrion {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] array=new int[5];
        for(int i=0;i<5;i++){
            array[i]=scan.nextInt();
        }
        for(int num : array){
            System.out.println("Array element:"+num);
        }
        
        reversearray(array,5);
    }
    
    public static void reversearray(int[] array,int size){
        int data=0;
        if(size>0){
            data=size-1;
            System.out.println(""+array[data]);
            reversearray(array,data);
        }
    }
    
}
