
package sub.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubString {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int query=scan.nextInt();
        scan.nextLine();
        String value=scan.nextLine();
        String element=null;
        List<String> list=new ArrayList<>();
        for(int i=0;i<query;i++){
            System.out.println("Enter slicing start:");
            int start=scan.nextInt();
            System.out.println("Enter slicing end:");
            int end=scan.nextInt();
            String substr=value.substring(start,end+1);
            
            for(int j=0;j<substr.length();j++){
                for(int k=0;k<substr.length();k++){
                    element=substr.substring(k,k+(j+1));
                    if(!list.contains(element)){
                        list.add(element);
                    }
                }
            }
            
            System.out.println(list.size());
        }
        
        
    }
    
}
