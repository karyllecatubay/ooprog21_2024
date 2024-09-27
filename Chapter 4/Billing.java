public class Billing {

    public static void main(String[] args) {
    
        Billing b = new Billing();

        b.computeBill(23.2);
        b.computeBill(24.4, 2);
        b.computeBill(25.3, 3, 5);
    }

    public double computeBill(double price) {
        double total = price + (price * 0.08);
        System.out.println("The total price for the bill is: $" + total);
        return total;
    }

    public double computeBill(double price, int quantity) {
        double total = (price * quantity) + ((price * quantity) * 0.08);
        System.out.println("The total price for the bill is: $" + total);
        return total;

    }

    public double computeBill(double price, int quantity, int couponDiscount) {
        double discount = (price * quantity) - couponDiscount;
        double total = discount + (discount * 0.08) ;
        System.out.println("The total price for the bill is: $" + total);
        return total;
    }
}
