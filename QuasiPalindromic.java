
package quasi.palindromic;

import java.util.Scanner;


public class QuasiPalindromic {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        String temp = Integer.toString(t);
        String temp2;
        int temp3;
        int [] newGuess = new int[temp.length()];
        for(int i=0;i<temp.length();i++) {
            if (i!=temp.length()) {
                temp2 = temp.substring(i, i+1);
            } else {
                temp2 = temp.substring(i);
                //System.out.println(i);
            }
            temp3 =  Integer.parseInt(temp2);    
            newGuess[i] = temp3;
        }
        int power=(int)Math.pow(10,9);
        if(t>=1 && t<=power){
            for(int i=0;i<newGuess.length;i++) {
            if(newGuess[newGuess.length-1]==0 && newGuess[newGuess.length-2]==0){
                    System.out.println("YES");
                    break;
                }
            if(newGuess[i]==newGuess[newGuess.length-1]){
                System.out.println("YES");
                break;
            }
            else{
                System.out.println("NO");
                break;
            }
        }       
        } 
    }
    
}
