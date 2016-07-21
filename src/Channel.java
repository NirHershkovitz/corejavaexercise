/**
 * Created by kenshoo-linux on 14/07/16.
 */
/**
 * Created by ken-linux2 on 12/07/16.
 */
public class Channel {

    private String name;
    private String campaignId;
    private AdGroup adGroup;
    private Account account; //add getters-done!
    private String adId;
    private Product product; //add-done!


    public AdGroup getAdGroup() {
        return adGroup;
    }

    public void setAdGroup(AdGroup adGroup) {
        this.adGroup = adGroup;
    }



    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }



    public static <T> T checkNotNull(T reference) {
        if (reference == null) {
            throw new NullPointerException();
        }
        return reference;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        checkNotNull(name);
        this.name = name;
    }

    public String getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(String campaignId) {
     checkNotNull(campaignId);
        this.campaignId = campaignId;
    }

    public String getAdId() {
        return adId;
    }

    public void setAdId(String adId) {
        this.adId = adId;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "name='" + name + '\'' +
                ", campaignId='" + campaignId + '\'' +
                ", adGroup=" + adGroup +
                ", account=" + account +
                ", adId='" + adId + '\'' +
                ", product=" + product +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Channel channel = (Channel) o;

        if (!name.equals(channel.name)) return false;
        if (!campaignId.equals(channel.campaignId)) return false;
        if (!adGroup.equals(channel.adGroup)) return false;
        if (!account.equals(channel.account)) return false;
        if (!adId.equals(channel.adId)) return false;
        return product.equals(channel.product);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + campaignId.hashCode();
        result = 31 * result + adGroup.hashCode();
        result = 31 * result + account.hashCode();
        result = 31 * result + adId.hashCode();
        result = 31 * result + product.hashCode();
        return result;
    }
}