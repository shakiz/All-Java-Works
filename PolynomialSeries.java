
package polynomial.series;

import java.util.Scanner;


public class PolynomialSeries {

    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter size:");
        int size=scan.nextInt();
        
        recursivepolynomial(0,size);
    }

    private static void recursivepolynomial(int i,int a) {
        if(i<a){
            if(i==0){
                System.out.print("1");
            }
            else if(i==1){
                System.out.print("+x");
            }
            else{
                System.out.print("+x^"+i);
            }
        }
        else if(i>a){
            System.exit(0);
        }
        i++;
        
        //will pass i with incremented value and the size of a
        recursivepolynomial(i, a);
    }
    
}
