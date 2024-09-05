public class ProductService {

    ClusterService clusterService = new ClusterService();

    public void addNewProduct(String clusterRef, String name, double price) {

        Product product = new Product(name, price);
        clusterService.addProductToCluster(clusterRef, product);
    }
}
