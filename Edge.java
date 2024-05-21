/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project2;

class Edge implements Comparable<Edge>
{
Location source;
Location dest;
double distance;

public Edge (Location source, Location dest) {
this.source = source;
this.dest = dest;
this.distance = Haversine_Distance.Distance(source.latitude, source.longitude, dest.latitude, dest.longitude);
}
public void display()
{
// System.out.println(source.name+"——"+distance+"———"+dest.name);
System.out.printf("%-32s %-15.3f%-32s\n",source.name,distance,dest.name);
}


public int compareTo(Edge o) {

return (int) (1000*(distance-o.distance));

}
}