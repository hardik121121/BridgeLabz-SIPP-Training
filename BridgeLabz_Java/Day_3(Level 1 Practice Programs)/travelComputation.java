// Eric Travels from Chennai to Bangalore via Vellore. From Chennai to 
// Vellore distance is 156.6 km and the time taken is 4 Hours and 4 Mins and from Vellore to 
// Bangalore is 211.8 km and will take 4 Hours and 25 Mins. Compute the total distance and total time from Chennai to Bangalore

public class travelComputation {
    public static void main(String args[]){
        String fromCity = "Chennai";
        String viaCity = "Velore";
        String toCity = "Bangalore";
        double distanceFromToVia = 156.6;
        int timeFromToVia = 4*60+4;
        double distanceViaToFinalCity = 211.8;
        int timeViaToFinalCity = 4*60+25;
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;
        System.out.println("Total Distance Travelled is : "+totalDistance+" km "+" and "+" Total Time Taken is : "+totalTime+" min ");
    }
}