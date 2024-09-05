import java.util.HashMap;
import java.util.Map;

public class ClusterService {

    private Map<String,Cluster> clusters = new HashMap<>();

    public void addProductToCluster(String clusterRef, Product product) {

        Cluster cluster = clusters.get(clusterRef);
        if (cluster != null) {
            if(cluster.getProducts().size() < cluster.getProductCount()) {
                cluster.getProducts().add(product);
            }else{
                System.out.println(" no place");
            }

        } else {
            System.out.println("no cluster");
        }

    }

    public Map<String, Product> getProduct(Map<String,Cluster> clusters) {
        Map<String, Product> products = new HashMap<>();
        Product productPri = new Product("name",  0.0);
        for(Cluster cluster : clusters.values()) {
            for(Product product : cluster.getProducts()) {
                if(product.getPrice() > productPri.getPrice()) {
                    productPri = product;
                }
            }
            products.put(cluster.getRef(), productPri);
        }
        return products;
    }

    public void createCluster(Map<String, Product> products) {
        Cluster cluster = new Cluster("3",100,null);
        for (Product product : products.values()) {
            if(product.getPrice() % 2 == 0) {
                cluster.getProducts().add(product);
            }
        }
    }

    public Cluster getCluster(String clusterRef) {
        return clusters.get(clusterRef);
    }
}
