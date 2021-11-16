import java.util.Date;

public class Product {
    private String productid;
    private String name;
    private double unitPrice;
    private String dateMfd;

    public Product(String productid, String name, double unitPrice, String dateMfd) {
        this.productid = productid;
        this.name = name;
        this.unitPrice = unitPrice;
        this.dateMfd = dateMfd;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productid='" + productid + '\'' +
                ", name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", dateMfd=" + dateMfd +
                '}';
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getDateMfd() {
        return dateMfd;
    }

    public void setDateMfd(String dateMfd) {
        this.dateMfd = dateMfd;
    }


}
