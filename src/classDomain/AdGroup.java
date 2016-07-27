package classDomain;

/**
 * Created by ken-linux2 on 12/07/16.
 */
public class AdGroup {

    private String engine;
    private Long id;
    private String adType;
    private String theme;

    public AdGroup() {
    }

    public AdGroup(String engine, Long id, String adType, String theme) {
        this.engine = engine;
        this.id = id;
        this.adType = adType;
        this.theme = theme;
    }

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AdGroup)) return false;

        AdGroup adGroup = (AdGroup) o;

        if (engine != null ? !engine.equals(adGroup.engine) : adGroup.engine != null) return false;
        if (id != null ? !id.equals(adGroup.id) : adGroup.id != null) return false;
        if (adType != null ? !adType.equals(adGroup.adType) : adGroup.adType != null) return false;
        return !(theme != null ? !theme.equals(adGroup.theme) : adGroup.theme != null);

    }

    @Override
    public int hashCode() {
        int result = engine != null ? engine.hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (adType != null ? adType.hashCode() : 0);
        result = 31 * result + (theme != null ? theme.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "classDomain.AdGroup{" +
                "engine='" + engine + '\'' +
                ", id='" + id + '\'' +
                ", adType='" + adType + '\'' +
                ", theme='" + theme + '\'' +
                '}';
    }

}
