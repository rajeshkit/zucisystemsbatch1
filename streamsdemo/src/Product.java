import java.io.Serializable;
import java.time.LocalDate;

public class Product implements Serializable {
    private String productName;
    private int productId;
    private int cost;
    private LocalDate dom;
    Product(){

    }

    public Product(String productName, int productId, int cost, LocalDate dom) {
         this.productName = productName;
        this.productId = productId;
        this.cost = cost;
        this.dom = dom;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public LocalDate getDom() {
        return dom;
    }

    public void setDom(LocalDate dom) {
        this.dom = dom;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productId=" + productId +
                ", cost=" + cost +
                ", dom=" + dom +
                '}';
    }
}
