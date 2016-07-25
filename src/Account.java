/**
 * Created by kenshoo-linux on 14/07/16.
 */
/**
 * Created by ken-linux2 on 12/07/16.
 */
public class Account {


    private String id;
    private String name;
    private String vendorClass;

    Account() {}
    Account(String id,String name, String vendorClass){
        this.id =id;
        this.name = name;
        this.vendorClass = vendorClass;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVendorClass() {
        return vendorClass;
    }

    public void setVendorClass(String vendorClass) {
        this.vendorClass = vendorClass;
    }
    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", vendorClass='" + vendorClass + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        if (!id.equals(account.id)) return false;
        if (!name.equals(account.name)) return false;
        return vendorClass.equals(account.vendorClass);

    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + vendorClass.hashCode();
        return result;
    }
}