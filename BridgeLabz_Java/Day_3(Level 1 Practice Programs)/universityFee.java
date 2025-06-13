public class universityFee {
    public static void main(String[] args) {
        double perStudentFee = 125000;
        double discountedAmount = 10*perStudentFee/100;
        double amountAfterDiscount = perStudentFee - discountedAmount;
        System.out.println("The discount amount is INR "+discountedAmount+" and final discounted fee is INR "+ amountAfterDiscount);
    }
}

