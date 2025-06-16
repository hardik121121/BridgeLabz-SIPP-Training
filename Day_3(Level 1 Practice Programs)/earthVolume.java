public class earthVolume {
    public static void main(String[] args) {
        int radius = 6378;
        double VEKm3 = 4/3 * Math.PI* Math.pow(radius,3);
        double KmToMiles = Math.pow(0.621371,3)*VEKm3;
        System.out.println("The volume of earth is cubic kilometers is "+VEKm3+" and cubic miles is "+KmToMiles);
    }
    
}
