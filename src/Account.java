/**
 * Created by ken-linux2 on 12/07/16.
 */

public class Account {

    private String name;
    private String vendorClass;
    private String id;

    public Account() {
    }

    public Account(String id, String vendorClass, String name) {
        this.id = id;
        this.vendorClass = vendorClass;
        this.name = name;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;

        Account account = (Account) o;

        if (name != null ? !name.equals(account.name) : account.name != null) return false;
        if (vendorClass != null ? !vendorClass.equals(account.vendorClass) : account.vendorClass != null) return false;
        return !(id != null ? !id.equals(account.id) : account.id != null);

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (vendorClass != null ? vendorClass.hashCode() : 0);
        result = 31 * result + (id != null ? id.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", vendorClass='" + vendorClass + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
