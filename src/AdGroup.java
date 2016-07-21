/**
 * Created by kenshoo-linux on 14/07/16.
 */

/**
 * Created by ken-linux2 on 12/07/16.
 */
public class AdGroup {

    private String engine;
    private String type;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdGroup adGroup = (AdGroup) o;

        if (engine != null ? !engine.equals(adGroup.engine) : adGroup.engine != null) return false;
        if (type != null ? !type.equals(adGroup.type) : adGroup.type != null) return false;
        return !(theme != null ? !theme.equals(adGroup.theme) : adGroup.theme != null);

    }

    @Override
    public int hashCode() {
        int result = engine != null ? engine.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (theme != null ? theme.hashCode() : 0);
        return result;
    }
    @Override
    public String toString() {
        return "AdGroup{" +
                "engine='" + engine + '\'' +
                ", type='" + type + '\'' +
                ", theme='" + theme + '\'' +
                '}';
    }

    //?  budgeting	fob
}