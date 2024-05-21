package com.mycompany.project2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Graph {
List< Location> locations;
List<Edge> edges;
public Graph () {
locations = new ArrayList<> ();
edges = new ArrayList<> ();
}

public void display_locations ()
{
System.out.println("all locations are :" );
System.out.printf("%-35s%-15s%-15s\n", "name" , "latitude" , "longitude");
for(int i=0; i<locations.size();i++)
{
locations.get(i).display();
}
}
public void display_Edges()
{

System.out.println("———————");
System.out.println("all Edges are :");
System.out.printf("%-32s %-15s%-32s\n", "source", "distance", "dest");
for(int i=0; i<edges.size();i++)
{
edges.get(i).display();
}
}
public void display_graph()
{
display_locations();
display_Edges();
}
public void addLocation (String name, double latitude, double longitude) {
locations.add(new Location(name, latitude, longitude));
}
public Location get_Loc (String name) 
{
for(Location loc:locations) {
if(loc.name.equals(name))
return loc;
}
return null;
}
public boolean edge_exist (String source, String dest)
{
for(Edge e:edges) {
if(e.source.equals(source)&&e.dest.equals(dest))
return true;
}
return false;
}
public void addEdge (String source, String dest) {
Location sourceLoc = get_Loc(source);
Location destLoc = get_Loc(dest);
if (sourceLoc != null && destLoc != null&&!edge_exist (source, dest)) {
Edge edge = new Edge (sourceLoc, destLoc);
edges.add(edge);
} else {
if (sourceLoc==null)
System.out.println(source+"not found in graph");
if (destLoc==null)
System.out.println(dest+"not found in graph");
}
}
public void sort()
{
Collections.sort(edges);
}
}