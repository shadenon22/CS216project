package com.mycompany.project2;
import java.util.*;
public class Kruskal {
     public static List<Edge> A = new ArrayList<>();
     public static Graph graph;
     private static int[] parent;
    public Kruskal(Graph graph) {
        this.graph=graph;        
    }
    public void initialize_parents() //make_set
    {
        int n=graph.locations.size();
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    public int find(int v) {
        while (v != parent[v]) {
            v = parent[v];
        }
        return v;
    }
    //another solution
    public  int find1(int v) {
        if(parent[v]==v)
          return v;
        return find(parent[v]);
    } 

    public  void union(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);
        if (rootP != rootQ) {
            parent[rootP] = rootQ;
        }
    }
    public  List<Edge> kruskalMST() { 
        initialize_parents();
         graph.sort();
        for (Edge e:graph.edges) {
            int sourceIdx = graph.locations.indexOf(e.source);
            int destIdx = graph.locations.indexOf(e.dest);
           
            if(find(sourceIdx)!=find(destIdx))    
            {                
                union(sourceIdx, destIdx);                
                A.add(e);
            }
        }

        return A;
    }

public static  void display_kruskal()
{
     System.out.println("--------------------------");
     System.out.println("\nMinimum Spanning Tree:");
        for (int i=0;i<A.size();i++) {
            A.get(i).display();
        }
}

}


