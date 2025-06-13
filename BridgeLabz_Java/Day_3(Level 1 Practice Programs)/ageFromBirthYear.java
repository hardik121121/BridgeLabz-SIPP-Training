import java.util.*;
import java.time.LocalDate;
public class ageFromBirthYear {
 public static void main(String[] args) {
    LocalDate currentDate = LocalDate.now();
    Scanner sc = new Scanner(System.in);
    int birthYear = sc.nextInt();
    int currentyear = currentDate.getYear();
    int age = currentyear - birthYear;
    System.out.println("Harry's age in "+currentyear+" is : "+age); 
 }    
}
