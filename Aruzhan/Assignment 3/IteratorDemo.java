public class IteratorDemo {
    public static void main(String[] args) {
        String[] products = {"Laptop", "Smartphone", "Tablet", "Monitor"};
        ProductCollection productCollection = new ProductCollection(products);
        Iterator iterator = productCollection.createIterator();

        System.out.println("Product list:");
        while (iterator.hasNext()) {
            String product = (String) iterator.next();
            System.out.println(product);
        }
    }
}
