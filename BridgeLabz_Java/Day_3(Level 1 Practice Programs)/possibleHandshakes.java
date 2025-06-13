import java.util.*;
public class possibleHandshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfStudents = sc.nextInt();
        int maxNumOfHandShakes = (numberOfStudents*(numberOfStudents-1))/2;
        System.out.println("The total number of possible handshakes are :"+maxNumOfHandShakes);
    }
    
}
