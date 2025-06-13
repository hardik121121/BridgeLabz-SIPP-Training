import java.util.Scanner;

public class StudentFee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fee = sc.nextDouble();
        double discountPercent = sc.nextDouble();    
        double discountCalcuation = discountPercent*fee/100;
        double feeAfterDiscount = fee - discountCalcuation;
        System.out.println("The discount amount is INR "+discountCalcuation+" and final discounted fee is INR "+feeAfterDiscount);        
    }
    
}
