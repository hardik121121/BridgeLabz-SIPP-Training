import java.util.*;
public class QuotientAndRemainder {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number1 = sc.nextInt();
    int number2 = sc.nextInt();
    double quotient = number1 / number2;
    double remainder = number1 % number2;
    System.out.println("The quotient is "+quotient+ " and Remainder is "+remainder+" of two number "+number1+ " and "+number2);
 }    
}
