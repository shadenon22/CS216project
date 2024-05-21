package com.mycompany.project2;
public class vertex implements Comparable<vertex>
{   
     double vertex_distance;
     int vertex;

    public vertex(int v, double w)
    {
	vertex = v;
        vertex_distance = w; 
       
    }

    @Override
    public int compareTo(vertex o) {
       return (int)(1000*(vertex_distance-o.vertex_distance));
    }
    
}
