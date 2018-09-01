/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Shakil
 */
public class HackerRankArraylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter number of arraylist:");
        int size=sc.nextInt();
        
        ArrayList[] list=new ArrayList[size];
        
        for(int i=0;i<size;i++){
            list[i]=new ArrayList();
            int x=sc.nextInt();
            for(int j=0;j<x;j++){
                int value=sc.nextInt();
                list[i].add(value);
            }
        }
        
        int query=sc.nextInt();
        
        for(int i=0;i<query;i++){
            int a,b;
            a=sc.nextInt();
            b=sc.nextInt();
            
            try{
                System.out.println(list[a].get(b-1));
            }
            catch(Exception e){
                System.out.println("ERROR");
            }
        }
    }
    
}
