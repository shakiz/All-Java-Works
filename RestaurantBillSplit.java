
package restaurant.bill.split;

import java.util.Scanner;


public class RestaurantBillSplit {

 
    public static void main(String[] args) {
        // TODO code application logic here
        int count=0;
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int k=scan.nextInt();
        for(int i=0;i<n;i++){
            int price=scan.nextInt();
            if(i==k){
                continue;
            }
            else if(i!=k){
                count=count+price;
            }
        }
        
        int braincharged=scan.nextInt();
        if(count/2==braincharged){
            System.out.println("Bon Appetit");
        }
        else{
            int exceed=braincharged-(count/2);
            System.out.println(exceed);
        }
    }
    
}
