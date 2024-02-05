    public class SalesTaxCalculator {
        public static void main(String[] args) {
            // Given price of a purchase
            double purchasePrice = 100.00;

            // Compute sales tax (5% of the purchase price)
            double salesTax = purchasePrice * 0.05;

            // Output statements
            System.out.println("Price of the purchase: $" + purchasePrice);
            System.out.println("Sales tax (5%): $" + salesTax);
        }
    }
