package depth.first.search;

import java.util.Iterator;
import java.util.LinkedList;

class Graph{
    public int V;// no of vertices
    // Array  of lists for Adjacency List Representation
    private LinkedList<Integer> adj[];
    //constructor
    public Graph(int v){
        this.V=v;
        adj=new LinkedList[v];
        for(int i=0;i<v;i++){
            adj[i]=new LinkedList();
        }
    }
    
    //Function to add an edge into the graph
    public void addEdge(int v,int w){
        adj[v].add(w);// Add w to v's list.
    }
    
    //this function will be used to check whether a node is vistied or not and will be called
    //recursively untill every node is visited
    public void DFSUtill(int v,boolean visited[]){
        //marking as the current node is visited and will be print it
        visited[v]=true;
        System.out.println(v+" ");
        //recursively call this function for all the adjacent to this node
        Iterator<Integer> it=adj[v].listIterator();
        while(it.hasNext()){
            int n=it.next();
            if(!visited[n]){
                DFSUtill(n, visited);
            }
        }
    }
    //This function is just used to declare a boolean array and initialize it with the v
    public void DFS(int v){
        //marking all the nodes are unvisited and making the array as false and init with the no the vertices 
        boolean[] visitied=new boolean[V];
        DFSUtill(v, visitied);
    }
}

public class DepthFirstSearch {

    public static void main(String[] args) {
        Graph g=new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        System.out.println("Following is Depth First Traversal "+
                           "(starting from vertex 2)");
        //making the initial start of the traverse as 2
        g.DFS(2);
    }
    
}
