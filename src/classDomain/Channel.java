package classDomain;

/**
 * Created by ken-linux2 on 12/07/16.
 */
public class Channel {

    private String name;
    private Long campaignId;
    private AdGroup adGroup;
    private Account account;
    private Product product;
    private Long adId;

    public Channel() {
    }

    public Channel(String name, Long campaignId, AdGroup adGroup, Account account, Product product, Long adId) {
        this.name = name;
        this.campaignId = campaignId;
        this.adGroup = adGroup;
        this.account = account;
        this.product = product;
        this.adId = adId;
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

    public Long getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(Long campaignId) {
        checkNotNull(campaignId);
        this.campaignId = campaignId;
    }

    public Long getAdId() {
        return adId;
    }

    public void setAdId(Long adId) {
        this.adId = adId;
    }

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
        checkNotNull(account);
        this.account = account;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Channel)) return false;

        Channel channel = (Channel) o;

        if (!name.equals(channel.name)) return false;
        if (!campaignId.equals(channel.campaignId)) return false;
        if (adGroup != null ? !adGroup.equals(channel.adGroup) : channel.adGroup != null) return false;
        if (!account.equals(channel.account)) return false;
        if (product != null ? !product.equals(channel.product) : channel.product != null) return false;
        return !(adId != null ? !adId.equals(channel.adId) : channel.adId != null);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + campaignId.hashCode();
        result = 31 * result + (adGroup != null ? adGroup.hashCode() : 0);
        result = 31 * result + account.hashCode();
        result = 31 * result + (product != null ? product.hashCode() : 0);
        result = 31 * result + (adId != null ? adId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "classDomain.Channel{" +
                "name='" + name + '\'' +
                ", campaignId='" + campaignId + '\'' +
                ", adGroup=" + adGroup +
                ", account=" + account +
                ", product=" + product +
                ", adId='" + adId + '\'' +
                '}';
    }
}
