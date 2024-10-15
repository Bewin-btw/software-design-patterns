public class ProductIterator implements Iterator {
    private String[] products;
    private int position;

    public ProductIterator(String[] products) {
        this.products = products;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < products.length;
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            return products[position++];
        }
        return null;
    }
}
