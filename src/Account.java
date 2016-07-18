/**
 * Created by ken-linux2 on 12/07/16.
 */

public class Account {

    private String account_name;
    private String vendor_class; //? ad

    public String getAccount_name() {
        return account_name;
    }

    public void setAccount_name(String account_name) {
        this.account_name = account_name;
    }

    public String getVendor_class() {
        return vendor_class;
    }

    public void setVendor_class(String vendor_class) {
        this.vendor_class = vendor_class;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;

        Account account = (Account) o;

        if (account_name != null ? !account_name.equals(account.account_name) : account.account_name != null)
            return false;
        return !(vendor_class != null ? !vendor_class.equals(account.vendor_class) : account.vendor_class != null);
    }

    @Override
    public int hashCode() {
        int result = account_name != null ? account_name.hashCode() : 0;
        result = 31 * result + (vendor_class != null ? vendor_class.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Account{" +
                "account_name='" + account_name + '\'' +
                ", vendor_class='" + vendor_class + '\'' +
                '}';
    }
}
