
package finding.even.and.odd.character;

import java.util.Scanner;

public class FindingEvenAndOddCharacter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();
        for(int i=0;i<T;i++){
            String s=scan.next();
            char[] chararray=s.toCharArray();
            int size=chararray.length;
            for(int j=0;j<size;j+=2){
                System.out.print(chararray[j]);
            }
            System.out.print(" ");
            for(int j=1;j<size;j+=2){
                System.out.print(chararray[j]);
            }
            System.out.println();
        }
    }
    
}
