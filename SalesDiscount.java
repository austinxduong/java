public class SalesDiscount {
    public static double doubleSalesDiscount(int price, int percentage) {
        double decimal = percentage / 100.00;
        double discount = price * decimal;
        double totalPrice = price - discount;
        return totalPrice;
    }
    public static void main(String[] args){
        int price = 500;
        int percentage = 25;
        System.out.println("Total Price =" + " " + doubleSalesDiscount(price, percentage));
    }
}

// Total Price = 375.0