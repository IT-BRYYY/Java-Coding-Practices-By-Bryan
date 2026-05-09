public class ProductSorter {

    // Selection Sort from Listing 7.8 - adapted for product prices
    public static void selectionSort(double[] price) {
        for (int i = 0; i < price.length - 1; i++) {
            double currentMin = price[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < price.length; j++) {
                if (currentMin > price[j]) {
                    currentMin = price[j];
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i) {
                price[currentMinIndex] = price[i];
                price[i] = currentMin;
            }
        }
    }

    public static void main(String[] args) {
        String[] products = {
                "Samsung Galaxy S24",
                "Nike Air Max",
                "MacBook Air M2",
                "Levi's Jeans",
                "Sony Headset"
        };

        double[] prices = {54990.00, 7995.00, 109990.00, 3299.00, 19995.00};

        System.out.println("Before sorting:");
        for (int i = 0; i < products.length; i++)
            System.out.println(products[i] + " - PHP " + prices[i]);

        selectionSort(prices);

        System.out.println("\nAfter sorting (lowest to highest price):");
        for (int i = 0; i < products.length; i++)
            System.out.println(products[i] + " - PHP " + prices[i]);
    }
}