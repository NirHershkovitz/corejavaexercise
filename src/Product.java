/**
 * Created by ken-linux2 on 12/07/16.
 */

public class Product {
    private String productGroupId;
    private String productClass1;
    private String productClass2;
    private String productClass3;
    private String theme;
    private String cta;

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getCta() {
        return cta;
    }

    public void setCta(String cta) {
        this.cta = cta;
    }

    public String getProductGroupId() {
        return productGroupId;
    }

    public void setProductGroupId(String productGroupId) {
        this.productGroupId = productGroupId;
    }

    public String getProductClass1() {
        return productClass1;
    }

    public void setProductClass1(String productClass1) {
        this.productClass1 = productClass1;
    }

    public String getProductClass2() {
        return productClass2;
    }

    public void setProductClass2(String productClass2) {
        this.productClass2 = productClass2;
    }

    public String getProductClass3() {
        return productClass3;
    }

    public void setProductClass3(String productClass3) {
        this.productClass3 = productClass3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;

        Product product = (Product) o;

        if (!productGroupId.equals(product.productGroupId)) return false;
        if (productClass1 != null ? !productClass1.equals(product.productClass1) : product.productClass1 != null)
            return false;
        if (productClass2 != null ? !productClass2.equals(product.productClass2) : product.productClass2 != null)
            return false;
        if (productClass3 != null ? !productClass3.equals(product.productClass3) : product.productClass3 != null)
            return false;
        if (theme != null ? !theme.equals(product.theme) : product.theme != null) return false;
        return !(cta != null ? !cta.equals(product.cta) : product.cta != null);

    }

    @Override
    public int hashCode() {
        int result = productGroupId.hashCode();
        result = 31 * result + (productClass1 != null ? productClass1.hashCode() : 0);
        result = 31 * result + (productClass2 != null ? productClass2.hashCode() : 0);
        result = 31 * result + (productClass3 != null ? productClass3.hashCode() : 0);
        result = 31 * result + (theme != null ? theme.hashCode() : 0);
        result = 31 * result + (cta != null ? cta.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productGroupId='" + productGroupId + '\'' +
                ", productClass1='" + productClass1 + '\'' +
                ", productClass2='" + productClass2 + '\'' +
                ", productClass3='" + productClass3 + '\'' +
                ", theme='" + theme + '\'' +
                ", cta='" + cta + '\'' +
                '}';
    }
}
