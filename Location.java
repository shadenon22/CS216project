package com.mycompany.project2;
class Location {

public String name;
public double latitude;
public double longitude;
public Location (String name, double latitude, double longitude) {
this.name = name;
this.latitude = latitude;
this.longitude = longitude;
}
public void display ()
{
System.out.printf("%-35s%-15.4f%-15.4f\n", name,latitude,longitude);
}
}