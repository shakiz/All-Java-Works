package kmp.pattern.matching;

class KMP_string_matching{
    public  void KMPserach(String pattern,String text){
        int m=pattern.length();
        int n=text.length();
        // create lps[] that will hold the longest
        // prefix suffix values for pattern
        int[] lps=new int[m];
        // index for pat[]
        int j=0;
        // Preprocess the pattern (calculate lps[]
        // array)
        computeLpsArray(pattern,m,lps);
        int i=0;
        while(i<n){
            if(pattern.charAt(j)==text.charAt(i)){
                j++;
                i++;
            }
            if(j==m){
                System.out.println("Found pattern at index : "+(i-j));
                j=lps[j-1];
            }
            // mismatch after j matches
            else if(i<n && pattern.charAt(j)!=text.charAt(i)){
                // Do not match lps[0..lps[j-1]] characters,
                // they will match anyway
                if(j!=0){
                    j=lps[j-1];
                }
                else{
                    i++;
                }
            }
        }
    }
    public void computeLpsArray(String pattern,int m,int[] lps){
        // length of the previous longest prefix suffix
        int len=0;
        int i=1;
        // lps[0] is always 0
        lps[0]=0;
         // the loop calculates lps[i] for i = 1 to M-1
         while(i<m){
             if(pattern.charAt(i)==pattern.charAt(len)){
                 len++;
                 lps[i]=len;
                 i++;
             }
              // (pat[i] != pat[len])
             else{
                // This is tricky. Consider the example.
                // AAACAAAA and i = 7. The idea is similar 
                // to search step.
                if(len!=0){
                    len=lps[len-1];
                    // Also, note that we do not increment
                    // i here
                }
                // if (len == 0)
                else{
                    lps[i]=len;
                    i++;
                }
             }
         }
    }
}

public class KmpPatternMatching {

    public static void main(String[] args) {
        KMP_string_matching kmp=new KMP_string_matching();
        String text="AAAABAAAA";
        String pattern="AAAA";
        kmp.KMPserach(pattern, text);
    }
    
}
