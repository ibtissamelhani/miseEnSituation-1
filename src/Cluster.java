import java.util.ArrayList;
import java.util.List;

public class Cluster {

    private String ref;
    private int productCount;
    private List<Product> products;

    public Cluster() {
    }

    public Cluster(String ref, int productCount, List<Product> products) {
        this.ref = ref;
        this.productCount = productCount;
        this.products = new ArrayList<>();
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
