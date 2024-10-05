class ProductBuilder {
    private String partA;
    private String partB;
    private String partC;

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }

    @Override
    public String toString() {
        return "Product [partA=" + partA + ", partB=" + partB + ", partC=" + partC + "]";
    }
}

abstract class Builder {
    protected ProductBuilder product;

    public Builder() {
        this.product = new ProductBuilder();  
    }

    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();

    public ProductBuilder getResult() {
        return product;  
    }
}

class ConcreteBuilder extends Builder {
    @Override
    public void buildPartA() {
        product.setPartA("Часть A");
    }

    @Override
    public void buildPartB() {
        product.setPartB("Часть B");
    }

    @Override
    public void buildPartC() {
        product.setPartC("Часть C");
    }
}

class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
    }
}

public class BuilderDemo {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        
        Director director = new Director(builder);
        
        director.construct();
        
        ProductBuilder product = builder.getResult();
        
        System.out.println(product);
    }
}
