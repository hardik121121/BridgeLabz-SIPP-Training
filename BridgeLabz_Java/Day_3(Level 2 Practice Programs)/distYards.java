import java.util.Scanner;
public class distYards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float distanceInFeet = sc.nextInt();
        float distanceInYards = distanceInFeet / 3;
        float distanceInMiles = distanceInYards / 1760;
        System.out.println("Your Distance in yards is "+distanceInYards+" and in miles is "+distanceInMiles);
    }
    
}
