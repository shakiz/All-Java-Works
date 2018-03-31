
package stack.implementation;

import javax.swing.JOptionPane;

public class StackClass {
    int[] array=new int[5];
    int top=0;
    public void insert(int data){
        try{
            array[top]=data;
            top++;
        }
        catch(ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null,""+e.getMessage());
        }
    }
    public int delete(){
        int data;
        top--;
        data=array[top];
        array[top]=0;
        return data;
    }
    public void show(){
        for(int i :array){
            System.out.print(" "+i);
        }
        System.out.println();
    }
    
    public int peek(){
        int data;
        data=array[top-1];
        return data;
    }
    
    public int stackSize(){
        return array.length;
    }
}
