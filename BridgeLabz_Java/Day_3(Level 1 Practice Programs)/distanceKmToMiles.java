// Create a program to convert the distance of 10.8 kilometers to miles. 
// Hint: 1 km = 1.6 miles
import java.util.Scanner;

public class distanceKmToMiles {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int km = sc.nextInt();
    double Miles = km * 1.6;
    System.out.println("The distance "+km+" km in miles is "+Miles);
 }    
}
