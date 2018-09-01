package naive.pattern.searching;

import java.util.Scanner;

public class NaivePatternSearching {

    public static void search(String text,String pattern){
        int M=pattern.length();
        int N=text.length();
        /* A loop to slide pat one by one */
        for(int i=0;i<=N-M;i++){
            int j;
            /* For current index i, check for pattern 
            match */
            for(j=0;j<M;j++){
                if(text.charAt(i+j)!=pattern.charAt(j)){
                    break;
                }
            }
            if(j==M){
                System.out.println("Match found at the index of : "+i);
            }
            else{
                System.out.println("Match is not found.");
            }
        }
    }
    public static void main(String[] args) {
        String txt = "AABAACAADAABAAABAA";
        String pat = "AABA";
        search(txt, pat);
    }
    
}
