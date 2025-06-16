// Create a program to calculate the profit and loss in number and percentage based on the 
// cost price of INR 129 and the selling price of INR 191
public class profitOrLoss {
    public static void main(String[] args) {
        int costPrice = 129;
        int sellingPrice = 191;
        System.out.println("The Cost Price is INR "+costPrice+" and the Selling Price is INR "+sellingPrice);

        if (sellingPrice > costPrice) {
            int profit = sellingPrice - costPrice;
            double profitPercentage = ((double) profit / costPrice) * 100;
            System.out.printf("The Profit is INR %d and the Profit Percentage is %.2f%%\n", profit, profitPercentage);
        } else if (costPrice > sellingPrice) {
            int loss = costPrice - sellingPrice;
            double lossPercentage = ((double) loss / costPrice) * 100;
            System.out.printf("The Loss is INR %d and the Loss Percentage is %.2f%%\n", loss, lossPercentage);
        } else {
            System.out.println("No Profit, No Loss.");
        }
    }
}
