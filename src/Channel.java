/**
 * Created by ken-linux2 on 12/07/16.
 */
public class Channel {

    private String name;
    private String channel_campaign_id;
    private String channel_adgroup_id;
    private String channel_account_id;
    private String channel_ad_id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new RuntimeException("name cannot be null");
        }
        this.name = name;
    }

    public String getChannel_campaign_id() {
        return channel_campaign_id;
    }

    public void setChannel_campaign_id(String channel_campaign_id) {
        if(channel_campaign_id==null)
        {
            throw new RuntimeException("not can be null");
        }
        this.channel_campaign_id = channel_campaign_id;
    }

    public String getChannel_adgroup_id() {
        return channel_adgroup_id;
    }

    public void setChannel_adgroup_id(String channel_adgroup_id) {
        this.channel_adgroup_id = channel_adgroup_id;
    }

    public String getChannel_account_id() {
        return channel_account_id;
    }

    public void setChannel_account_id(String channel_account_id) {
        if(channel_account_id==null)
        {
            throw new RuntimeException("not can be null");
        }
        this.channel_account_id = channel_account_id;
    }

    public String getChannel_ad_id() {
        return channel_ad_id;
    }

    public void setChannel_ad_id(String channel_ad_id) {
        this.channel_ad_id = channel_ad_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Channel)) return false;

        Channel channel = (Channel) o;

        if (name != null ? !name.equals(channel.name) : channel.name != null) return false;
        if (!channel_campaign_id.equals(channel.channel_campaign_id)) return false;
        if (channel_adgroup_id != null ? !channel_adgroup_id.equals(channel.channel_adgroup_id) : channel.channel_adgroup_id != null)
            return false;
        if (channel_account_id != null ? !channel_account_id.equals(channel.channel_account_id) : channel.channel_account_id != null)
            return false;
        return !(channel_ad_id != null ? !channel_ad_id.equals(channel.channel_ad_id) : channel.channel_ad_id != null);

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + channel_campaign_id.hashCode();
        result = 31 * result + (channel_adgroup_id != null ? channel_adgroup_id.hashCode() : 0);
        result = 31 * result + (channel_account_id != null ? channel_account_id.hashCode() : 0);
        result = 31 * result + (channel_ad_id != null ? channel_ad_id.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "name='" + name + '\'' +
                ", channel_campaign_id='" + channel_campaign_id + '\'' +
                ", channel_adgroup_id='" + channel_adgroup_id + '\'' +
                ", channel_account_id='" + channel_account_id + '\'' +
                ", channel_ad_id='" + channel_ad_id + '\'' +
                '}';
    }
}
