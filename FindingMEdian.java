
package finding.median;

import java.util.Scanner;


public class FindingMEdian {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter array size:");
        int size=scan.nextInt();
        int[] array=new int[size];
        System.out.println("Array elements :");
        for(int i=0;i<size;i++){
            array[i]=scan.nextInt();
        }
        System.out.println("Array elements after sorting:"+sort(array));

    }
    
    public static int[] sort(int[] array){
        int temp=0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<(array.length-i-1);j++){
                if(array[j]>array[j+1]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        return array;
    }
    
}
