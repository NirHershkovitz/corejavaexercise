/**
 * Created by ken-linux2 on 12/07/16.
 */

public class Product {
    private String GroupId;
    private String Class1;
    private String Class2;
    private String Class3;
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

    public String getGroupId() {
        return GroupId;
    }

    public void setGroupId(String groupId) {
        this.GroupId = groupId;
    }

    public String getClass1() {
        return Class1;
    }

    public void setClass1(String class1) {
        this.Class1 = class1;
    }

    public String getClass2() {
        return Class2;
    }

    public void setClass2(String class2) {
        this.Class2 = class2;
    }

    public String getClass3() {
        return Class3;
    }

    public void setClass3(String class3) {
        this.Class3 = class3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;

        final Product product = (Product) o;

        if (!GroupId.equals(product.GroupId)) return false;
        if (Class1 != null ? !Class1.equals(product.Class1) : product.Class1 != null)
            return false;
        if (Class2 != null ? !Class2.equals(product.Class2) : product.Class2 != null)
            return false;
        if (Class3 != null ? !Class3.equals(product.Class3) : product.Class3 != null)
            return false;
        if (theme != null ? !theme.equals(product.theme) : product.theme != null) return false;
        return !(cta != null ? !cta.equals(product.cta) : product.cta != null);

    }

    @Override
    public int hashCode() {
        int result = GroupId.hashCode();
        result = 31 * result + (Class1 != null ? Class1.hashCode() : 0);
        result = 31 * result + (Class2 != null ? Class2.hashCode() : 0);
        result = 31 * result + (Class3 != null ? Class3.hashCode() : 0);
        result = 31 * result + (theme != null ? theme.hashCode() : 0);
        result = 31 * result + (cta != null ? cta.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Product{" +
                "GroupId='" + GroupId + '\'' +
                ", Class1='" + Class1 + '\'' +
                ", Class2='" + Class2 + '\'' +
                ", Class3='" + Class3 + '\'' +
                ", theme='" + theme + '\'' +
                ", cta='" + cta + '\'' +
                '}';
    }
}
