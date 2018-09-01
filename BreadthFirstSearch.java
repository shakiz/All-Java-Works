package breadth.first.search;

import java.util.Iterator;
import java.util.LinkedList;

class Graph{
    private int no_of_vertices;// No. of vertices
    private LinkedList<Integer> adj[];//Adjacency Lists
    //Constructor
    public Graph(int no_of_vertices) {
        this.no_of_vertices=no_of_vertices;
        adj=new LinkedList[no_of_vertices];
        
        for(int i=0;i<no_of_vertices;++i){
            adj[i]=new LinkedList();
        }
    }
    // Function to add an edge into the graph
    public void add(int v,int w){
        adj[v].add(w);
    }
    //prints bfs from a given source s
    public void BFS(int s){
        // Mark all the vertices as not visited(By default
        // set as false)
        boolean visited[]=new boolean[no_of_vertices];
        //Create a queue for BFS
        LinkedList<Integer> queue=new LinkedList<Integer>();
        //Mark the current node as visited and enqueue it
        visited[s]=true;
        queue.add(s);
        while(queue.size()!=0){
            //Dequeue a vertex from queue and print it
            s=queue.poll();
            System.out.println(""+s);
            //Get all adjacent vertices of the dequeued vertex s
            //If a adjacent has not visited,then mark it,visit it and enqueue it
            Iterator<Integer> iterator=adj[s].listIterator();
            while(iterator.hasNext()){
                int n=iterator.next();
                if(!visited[n]){
                    visited[n]=true;
                    queue.add(n);
                }
            }
        }
    }
}

public class BreadthFirstSearch {

    public static void main(String[] args) {
        Graph graph=new Graph(4);
        graph.add(0, 1);
        graph.add(1, 0);
        graph.add(1, 2);
        graph.add(2, 0);
        graph.add(0, 3);
        System.out.println("Following is Breadth First Traversal "+
                           "(starting from vertex 0)");
        graph.BFS(0);
    }
    
}
