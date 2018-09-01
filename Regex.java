package regex;

public class Regex {

    public static void main(String[] args) {
        // TODO code application logic here
        String any=".*";
        System.out.println("Hello".matches(any));
        System.out.println("".matches(any));
        System.out.println("27272".matches(any));
        
        System.out.println();
        
        String atleastone=".+";
        System.out.println("Hello".matches(atleastone));
        System.out.println("".matches(atleastone));
        System.out.println("236234".matches(atleastone));
        
        System.out.println();
        
        String charonly="\\w";
        System.out.println("s".matches(charonly));
        System.out.println("Shakil".matches(charonly));
        
        System.out.println();
        
        String longwordonly="\\W";
        System.out.println("s".matches(longwordonly));
        System.out.println("697 797698567 97.".matches(longwordonly));
        
        System.out.println();
        
        String grayorgrey="gr(a|e)y";
        System.out.println("gray".matches(grayorgrey));
        System.out.println("grey".matches(grayorgrey));
        System.out.println("".matches(grayorgrey));
        
        System.out.println();
        
        String colorpick="red|blue|black";
        System.out.println("red".matches(colorpick));
        System.out.println("black".matches(colorpick));
        System.out.println("yellow".matches(colorpick));
    }
    
}
