/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negatuve.subarray.in.java;

import java.util.Scanner;

/**
 *
 * @author Shakil
 */
public class NegatuveSubarrayInJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] array=new int[size];
        int[][] newarr=new int[size][size];
        int j=0;
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
            
            if(array[i]<0){
                j++;
                System.out.println("In first if condition to check arr[i]<0,Value of j:"+j);
            }
            newarr[i][i]=array[i];
            for(int k=0;k<i;k++){
                newarr[k][i]=newarr[k][i-1]+array[i];
                if(newarr[k][i]<0){
                    j++;
                    System.out.println("In second if condition to check newarr[k][i]<0,Value of j:"+j);
                }
            }
        }
        System.out.println(j);
    }
    
}
