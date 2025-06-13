// Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. Find the average 
// percent mark in PCM
import java.util.Scanner;

public class averagePercentInPCM {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int Maths = 94;
    int Physics = 95;
    int Chemistry = 96;
    int total = Maths + Physics + Chemistry;
    double average = (double) total / 3;
    System.out.println("Sam's average mark in PCM is "+average+" % ");
 }    
}
