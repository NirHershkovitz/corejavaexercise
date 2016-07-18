/**
 * Created by ken-linux2 on 12/07/16.
 */

public class Account {

    private String accountName;
    private String vendorClass; //? ad

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
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

        if (accountName != null ? !accountName.equals(account.accountName) : account.accountName != null)
            return false;
        return !(vendorClass != null ? !vendorClass.equals(account.vendorClass) : account.vendorClass != null);
    }

    @Override
    public int hashCode() {
        int result = accountName != null ? accountName.hashCode() : 0;
        result = 31 * result + (vendorClass != null ? vendorClass.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountName='" + accountName + '\'' +
                ", vendorClass='" + vendorClass + '\'' +
                '}';
    }
}
