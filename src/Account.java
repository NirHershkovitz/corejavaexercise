/**
 * Created by kenshoo-linux on 14/07/16.
 */
/**
 * Created by ken-linux2 on 12/07/16.
 */
public class Account {
    private Long id;//add setters
    private String name;
    private String vendorClass; //? ad

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;

        Account account = (Account) o;

        if (name != null ? !name.equals(account.name) : account.name != null)
            return false;
        return !(vendorClass != null ? !vendorClass.equals(account.vendorClass) : account.vendorClass != null);

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (vendorClass != null ? vendorClass.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", vendorClass='" + vendorClass + '\'' +
                '}';
    }
}