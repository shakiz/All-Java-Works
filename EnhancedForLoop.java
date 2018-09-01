
package enhancedforloop;


public class EnhancedForLoop {

    public static void main(String[] args) {
        int shakil[]={2,3,4,5,6,7};
        int total=0;
        
        //now enhenced for loop
        
        //here int is datattpe , x is the identifier and shakil is the array name
        for(int var:shakil){
            total+=var;
        }
        
        System.out.println("Total is :"+total);
    }
    
}
