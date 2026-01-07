package Level1;public class Level1_007 {
    public static void main(String[] args) {

        double radiusKm = 6378;               // Radius of Earth in km
        double pi = Math.PI;

        // Volume in cubic kilometers
        double volumeKm3 = (4.0 / 3) * pi * Math.pow(radiusKm, 3);

        // Convert km to miles (1 km = 0.621371 miles)
        double radiusMiles = radiusKm * 0.621371;

        // Volume in cubic miles
        double volumeMiles3 = (4.0 / 3) * pi * Math.pow(radiusMiles, 3);

        System.out.println(
                "The volume of earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3
        );
    }
}
