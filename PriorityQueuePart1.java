/*
    Characteristics
    1.To process the objects in the queue based on the priority, we tend to use Priority Queue.
    2.PriorityQueue doesn’t allow null
    3.We can’t create PriorityQueue of Objects that are non-comparable
    4.The elements of the priority queue are ordered according to their natural ordering, or by a Comparator provided at queue construction time, depending on which constructor is used.
    5.The head of this queue is the least element with respect to the specified ordering. If multiple elements are tied for least value, the head is one of those elements — 
    ties are broken arbitrarily.
    6.The queue retrieval operations poll, remove, peek, and element access the element at the head of the queue.
    7.It inherits methods from AbstractQueue, AbstractCollection, Collection and Object class.
 */
package priority.queue.part1;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueuePart1 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        // Creating empty priority queue
        PriorityQueue<String> pQueue =new PriorityQueue<String>();
        System.out.println("Queue size:");
        int size=scan.nextInt();
        for(int i=0;i<size;i++){
            System.out.print("Queue element:");
            String element=scan.next();
            System.out.println();
            //adding elements into priority queue
            pQueue.add(element);
        }
        //printing all the elements of priority queue
        for(String s:pQueue){
            System.out.println("Elements in priority queue:"+s);
        }
        //using iterator to print all the elements
        Iterator itr=pQueue.iterator();
        while (itr.hasNext()) {
            System.out.println("Element:"+itr.next());
        }
        
        //getting peek value
        System.out.println("Peek value:"+pQueue.peek());
        //removing peek value
        System.out.println(pQueue);
        pQueue.poll();
        //after removing peek value
        System.out.println(pQueue);
        //contains or not
        System.out.println(""+pQueue.contains("C"));
    }
    
}
