
package hashtablee;

import java.util.Enumeration;
import java.util.Hashtable;


public class HashTablee {

    public static void main(String[] args) {
        
        //creating integer key for key 
        int key;
        
        //creating a enumeration
        Enumeration names;
        
        //creating a hashtable
        Hashtable<Integer, String> hashtable = new Hashtable<Integer, String>();
        
        //putting value 
        hashtable.put(1304,"Rakiba");
        hashtable.put(1305,"Rashed");
        hashtable.put(1309,"Sagor");
        hashtable.put(1316,"Faisal");
        hashtable.put(1335,"Shakil");
        hashtable.put(1318,"Shuvo");
        hashtable.put(1341,"Logic baba kouhsik");
        hashtable.put(1392,"Jahid");
        
        //initialling names 
        names=hashtable.keys();
        
        //printing keys and values
        while(names.hasMoreElements()){
            key=(int) names.nextElement();
            System.out.println("Key is :"+key+"\tValue is :"+hashtable.get(key));
        }
    }
    
}
