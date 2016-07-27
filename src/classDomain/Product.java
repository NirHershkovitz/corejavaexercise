package classDomain;

/**
 * Created by ken-linux2 on 12/07/16.
 */

public class Product {
    private Long id;
    private Long groupId;
    private String class1;
    private String class2;
    private String class3;
    private String cta;

    public Product() {
    }

    public Product(Long id, Long groupId, String class1, String class2, String class3, String cta) {
        this.id = id;
        this.groupId = groupId;
        this.class1 = class1;
        this.class2 = class2;
        this.class3 = class3;
        this.cta = cta;
    }

    public String getCta() {
        return cta;
    }

    public void setCta(String cta) {
        this.cta = cta;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getClass1() {
        return class1;
    }

    public void setClass1(String class1) {
        this.class1 = class1;
    }

    public String getClass2() {
        return class2;
    }

    public void setClass2(String class2) {
        this.class2 = class2;
    }

    public String getClass3() {
        return class3;
    }

    public void setClass3(String class3) {
        this.class3 = class3;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;

        Product product = (Product) o;

        if (id != null ? !id.equals(product.id) : product.id != null) return false;
        if (groupId != null ? !groupId.equals(product.groupId) : product.groupId != null) return false;
        if (class1 != null ? !class1.equals(product.class1) : product.class1 != null) return false;
        if (class2 != null ? !class2.equals(product.class2) : product.class2 != null) return false;
        if (class3 != null ? !class3.equals(product.class3) : product.class3 != null) return false;
        return !(cta != null ? !cta.equals(product.cta) : product.cta != null);

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (groupId != null ? groupId.hashCode() : 0);
        result = 31 * result + (class1 != null ? class1.hashCode() : 0);
        result = 31 * result + (class2 != null ? class2.hashCode() : 0);
        result = 31 * result + (class3 != null ? class3.hashCode() : 0);
        result = 31 * result + (cta != null ? cta.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "classDomain.Product{" +
                "id='" + id + '\'' +
                ", groupId='" + groupId + '\'' +
                ", class1='" + class1 + '\'' +
                ", class2='" + class2 + '\'' +
                ", class3='" + class3 + '\'' +
                ", cta='" + cta + '\'' +
                '}';
    }
}