/**
 * Created by ken-linux2 on 12/07/16.
 */
public class Channel {

    private String name;
    private String CampaignId;
    private String AdgroupId;
    private String AccountId;
    private String AdId;


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
        return CampaignId;
    }

    public void setCampaignId(String campaignId) {
        checkNotNull(campaignId);
        this.CampaignId = campaignId;
    }

    public String getAdgroupId() {
        return AdgroupId;
    }

    public void setAdgroupId(String adgroupId) {
        this.AdgroupId = adgroupId;
    }

    public String getAccountId() {
        return AccountId;
    }

    public void setAccountId(String accountId) {
        checkNotNull(accountId);
        this.AccountId = accountId;
    }

    public String getAdId() {
        return AdId;
    }

    public void setAdId(String adId) {
        this.AdId = adId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Channel)) return false;

        final Channel channel = (Channel) o;

        if (name != null ? !name.equals(channel.name) : channel.name != null) return false;
        if (!CampaignId.equals(channel.CampaignId)) return false;
        if (AdgroupId != null ? !AdgroupId.equals(channel.AdgroupId) : channel.AdgroupId != null)
            return false;
        if (AccountId != null ? !AccountId.equals(channel.AccountId) : channel.AccountId != null)
            return false;
        return !(AdId != null ? !AdId.equals(channel.AdId) : channel.AdId != null);

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + CampaignId.hashCode();
        result = 31 * result + (AdgroupId != null ? AdgroupId.hashCode() : 0);
        result = 31 * result + (AccountId != null ? AccountId.hashCode() : 0);
        result = 31 * result + (AdId != null ? AdId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "name='" + name + '\'' +
                ", CampaignId='" + CampaignId + '\'' +
                ", AdgroupId='" + AdgroupId + '\'' +
                ", AccountId='" + AccountId + '\'' +
                ", AdId='" + AdId + '\'' +
                '}';
    }
}
