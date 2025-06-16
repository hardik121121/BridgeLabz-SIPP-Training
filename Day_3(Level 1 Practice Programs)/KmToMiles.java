import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km = sc.nextDouble();
        double KmToMile = 1.6*km;
        System.out.println("The total mile is "+KmToMile+" mile for the given "+km+"km");
    }
    
}
