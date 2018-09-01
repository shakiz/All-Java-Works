
package funwithstringmethods;


public class FunWithStringMethods {

 
    public static void main(String[] args) {
        String shakil1="Shakil ";
        String shakil2="is ";
        String shakil3="monster";
        
        //showing all the strings together
        System.out.println(shakil1+shakil2+shakil3);
        
        //finding the index of any string
        System.out.println(shakil1.indexOf('a'));
        
        //changing the case type lower to upper
        System.out.println(shakil1.toUpperCase());
        System.out.println(shakil2.toUpperCase());
        System.out.println(shakil3.toUpperCase());
        
        //changing a character to a string
        System.out.println(shakil1.replace('S','P'));
        
        
    }
    
}
