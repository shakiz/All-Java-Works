
package divisible.sum.pairs;

import java.util.Scanner;


public class DivisibleSumPairs {

   
    public static void main(String[] args) {
        int n,k,count=0;
        int a;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter array size:");
        n=scan.nextInt();
        System.out.print("Enter divisible element:");
        k=scan.nextInt();
        
        int[] array=new int[n];
        System.out.println("Enter array element:");
        for(int i=0;i<n;i++){
            array[i]=scan.nextInt();
        }
        
        
        for(int i=0;i<n;i++){
            System.out.println("Outter for loop");
            System.out.println("Value of i:"+i);
            for(int j=i+1;j<n;j++){
                System.out.println("Inner for loop");
                System.out.println("Value of j:"+j);
                a=array[i]+array[j];
                System.out.println("Value of a is : "+a);
                if(a%k==0){
                    count++;
                    System.out.println("Count from if condition:"+count);
                }
            }
        }
        
        System.out.println("The total count of divisible by k is:"+count);
    }
    
}
