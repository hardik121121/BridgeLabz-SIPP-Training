import java.util.*;
public class itemAndQuantity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float unitPrice = sc.nextFloat();
        int quantity = sc.nextInt();
        float totalPrice = quantity * unitPrice;
        System.out.println("The total purchase price is INR "+totalPrice+" if the quantity "+quantity+" and the unit price is INR "+unitPrice);
    }

}
