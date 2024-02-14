package Quiz;
import java.lang.Math;

/** SufraceArea.java by kernel.rb
  
   Input:  PI
           earthRaduisInMiles
           planetRadius
           
 
   Output: planetVolume
           earthVolume
           proportion
           planetSurfaceArea
*/
public class SufraceArea {
    public static void  main() 
    {
       final double PI = Math.PI; // tp represent to value of pi 
       final int earthRaduisInMiles = 3963 ; // earth raduis
       double planetRadius = 2.5; // planet raduis 
       double planetVolume = 4.0 * PI * planetRadius * planetRadius * planetRadius / 3.0; // volume of the palnet
       double earthVolume = 4.0 * PI * earthRaduisInMiles * earthRaduisInMiles * earthRaduisInMiles / 3.0; // earch volume 
       double proportion = planetVolume / earthVolume; // calculate the proportion
       double planetSurfaceArea = 4 * PI * Math.pow(planetRadius ,2) ; // Calculate planet surface area
       System.out.println("Your planet has a radius of " + planetRadius + " miles"); // print the planet raduis 
       System.out.println("and has a volume of " + planetVolume + " cubic miles."); // print the volume of the planet
       System.out.println("This volume is " + proportion + " times the earth's volume."); // print the proportion
       System.out.println("The planet's surface area is " + planetSurfaceArea + " square miles."); // print the palanete sufarce area 
    } // End planet
}
