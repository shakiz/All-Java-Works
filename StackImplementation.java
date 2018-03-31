
package stack.implementation;


public class StackImplementation {

    public static void main(String[] args) {
        StackClass stackClass=new StackClass();
        stackClass.insert(10);
        stackClass.insert(20);
        stackClass.insert(30);
        stackClass.insert(40);
        stackClass.insert(50);
        System.out.println("Before pop:");
        stackClass.show();
        System.out.print("Pop element:");
        System.out.println(""+stackClass.delete());
        stackClass.show();
        System.out.println(""+stackClass.stackSize());
        System.out.println("Peek : "+stackClass.peek());
    }
    
}
