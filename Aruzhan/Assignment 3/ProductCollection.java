

public class ProductCollection implements Collection {
    private String[] products;

    public ProductCollection(String[] products) {
        this.products = products;
    }

    @Override
    public Iterator createIterator() {
        return new ProductIterator(products);
    }
}
