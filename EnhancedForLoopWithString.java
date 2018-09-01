
package enhancedforloopwithstring;

public class EnhancedForLoopWithString {

  
    public static void main(String[] args) {
        String shakil[]={"Shakil","Pakil","Shaki","Shakilla","Pakilla"};
        
        //enhenced for lop starts here
        //strng is the variable where we store the arrays values and shakil is the array name
        for(String stng:shakil){
            if(stng.startsWith("sha")){
                System.out.println(stng+" starts with sha"+"\n");
            }
            else if(stng.startsWith("Pak")){
                System.out.println(stng+" starts with pak"+"\n");
            }
        }
        
        for(String stng:shakil){
            if(stng.endsWith("killa")){
                System.out.println(stng+" ends with killa"+"\n");
            }
            else if(stng.startsWith("kil")){
                System.out.println(stng+" ends with kil"+"\n");
            }
        }
    }
    
}
