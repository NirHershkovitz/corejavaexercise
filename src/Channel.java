/**
 * Created by kenshoo-linux on 14/07/16.
 */
/**
 * Created by ken-linux2 on 12/07/16.
 */
public class Channel {

    private String name;
    private String campaignId;
    private String adgroupId;
    private String accountId;
    private String adId;

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if(name==null)
            throw new RuntimeException("name cannot be null");
        this.name = name;
    }

    public String getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(String campaignId) {
        if(campaignId ==null)
            throw new RuntimeException("channel campaign id cannot be null");
        this.campaignId = campaignId;
    }

    public String getAdgroupId() {
        return adgroupId;
    }

    public void setAdgroupId(String adgroupId) {
        this.adgroupId = adgroupId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        if(accountId ==null)
            throw new RuntimeException("channel account id cannot be null");
        this.accountId = accountId;
    }

    public String getAdId() {
        return adId;
    }

    public void setAdId(String adId) {
        this.adId = adId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Channel)) return false;

        Channel channel = (Channel) o;

        if (name != null ? !name.equals(channel.name) : channel.name != null) return false;
        if (!campaignId.equals(channel.campaignId)) return false;
        if (adgroupId != null ? !adgroupId.equals(channel.adgroupId) : channel.adgroupId != null)
            return false;
        if (accountId != null ? !accountId.equals(channel.accountId) : channel.accountId != null)
            return false;
        return !(adId != null ? !adId.equals(channel.adId) : channel.adId != null);

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + campaignId.hashCode();
        result = 31 * result + (adgroupId != null ? adgroupId.hashCode() : 0);
        result = 31 * result + (accountId != null ? accountId.hashCode() : 0);
        result = 31 * result + (adId != null ? adId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "name='" + name + '\'' +
                ", campaignId='" + campaignId + '\'' +
                ", adgroupId='" + adgroupId + '\'' +
                ", accountId='" + accountId + '\'' +
                ", adId='" + adId + '\'' +
                '}';
    }
}