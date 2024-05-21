package com.mycompany.project2;
public class Haversine_Distance 
{
   public static double Distance(double lat1, double lon1, double lat2, double lon2) {
    double R = 6371; // Radius of the Earth in kilometers

    double dLat = Math.toRadians(lat2 - lat1);
    double dLon = Math.toRadians(lon2 - lon1);

    double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
               Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) *
               Math.sin(dLon / 2) * Math.sin(dLon / 2);

    double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

    double distance = R * c;
    return distance;
}
  public static void main(String[]args){
      System.out.println(Distance(29.30857, 30.84263, 29.97678, 31.13282));
  }
 
}
