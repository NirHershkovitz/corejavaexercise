/**
 * Created by ken-linux2 on 12/07/16.
 */
public class AdGroup {

    private String engine;
    private String adType;
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

    public String getAdType() {
        return adType;
    }

    public void setAdType(String adType) {
        this.adType = adType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AdGroup)) return false;

        final AdGroup ad = (AdGroup) o;

        if (!engine.equals(ad.engine)) return false;
        if (adType != null ? !adType.equals(ad.adType) : ad.adType != null) return false;
        return !(theme != null ? !theme.equals(ad.theme) : ad.theme != null);

    }

    @Override
    public int hashCode() {
        int result = engine.hashCode();
        result = 31 * result + (adType != null ? adType.hashCode() : 0);
        result = 31 * result + (theme != null ? theme.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "AdGroup{" +
                "engine='" + engine + '\'' +
                ", adType='" + adType + '\'' +
                ", theme='" + theme + '\'' +
                '}';
    }
//?  budgeting	fob
}
