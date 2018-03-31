package linkedlist.implementation;
import java.util.Scanner;
//ways of implementation
//1.Create  MyLinkedList class
//2.Create the nodes
//3.Link the nodes
public class LinkedlistImplementation {

    public static class MyLinkedList{
        public int data;//data field
        MyLinkedList addressofnextnode;//address part

        public MyLinkedList() {
            this.addressofnextnode=null;
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //init the variables or objets or creating a node
        MyLinkedList a=new MyLinkedList();
        MyLinkedList b=new MyLinkedList();
        MyLinkedList c=new MyLinkedList();
        
        System.out.println("Enter the value for a:");
        a.data=scan.nextInt();
        
        System.out.println("Enter the value for b:");
        b.data=scan.nextInt();
        
        System.out.println("Enter the value for c:");
        c.data=scan.nextInt();
        
        a.addressofnextnode=b;
        b.addressofnextnode=c;
        
        System.out.println("Address of next node from a : "+a.addressofnextnode);//this will bring the output of address of next node for b
        System.out.println("Address of next node from b : "+b.addressofnextnode);//this will bring the output of address of next node for c
        System.out.println("Address of next node from c : "+c.addressofnextnode);//this will bring the output as null because after this there is no node
        
        //printing the content or data of each node
        
        System.out.println("Data of node a : "+a.data);
        System.out.println("Data of node b : "+b.data);
        System.out.println("Data of node c : "+c.data);
        
        //printing all the elemnets of linkedlist using while loop
        
        while(a.addressofnextnode!=null){
            System.out.print("-->>"+a.data);
            a=a.addressofnextnode;
        }
        
    }
    
}
