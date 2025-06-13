import java.util.Scanner;

public class areaOfSquare {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double base = sc.nextDouble();
    double height = sc.nextDouble();
    double areaInInches = (0.5 * base * height);
    double areaInCm = areaInInches * 6.4516;
    System.out.println("The are of square in inches square is "+areaInInches+ " and in cm square is "+areaInCm);
 }    
}
