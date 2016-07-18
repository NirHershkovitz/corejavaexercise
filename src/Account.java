/**
 * Created by ken-linux2 on 12/07/16.
 */

public class Account {

    private String Name;
    private String vendorClass; //? ad

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
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
        if (Name != null ? !Name.equals(account.Name) : account.Name != null)
            return false;
        return !(vendorClass != null ? !vendorClass.equals(account.vendorClass) : account.vendorClass != null);
    }

    @Override
    public int hashCode() {
        int result = Name != null ? Name.hashCode() : 0;
        result = 31 * result + (vendorClass != null ? vendorClass.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Account{" +
                "Name='" + Name + '\'' +
                ", vendorClass='" + vendorClass + '\'' +
                '}';
    }
}
