/**
 * Created by ken-linux2 on 12/07/16.
 */
public class Ad {

    private String engine;
    private String ad_type;
    private String theme;

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getAd_type() {
        return ad_type;
    }

    public void setAd_type(String ad_type) {
        this.ad_type = ad_type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ad)) return false;

        Ad ad = (Ad) o;

        if (!engine.equals(ad.engine)) return false;
        if (ad_type != null ? !ad_type.equals(ad.ad_type) : ad.ad_type != null) return false;
        return !(theme != null ? !theme.equals(ad.theme) : ad.theme != null);

    }

    @Override
    public int hashCode() {
        int result = engine.hashCode();
        result = 31 * result + (ad_type != null ? ad_type.hashCode() : 0);
        result = 31 * result + (theme != null ? theme.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Ad{" +
                "engine='" + engine + '\'' +
                ", ad_type='" + ad_type + '\'' +
                ", theme='" + theme + '\'' +
                '}';
    }
//?  budgeting	fob
}
