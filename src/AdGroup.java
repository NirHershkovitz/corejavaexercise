/**
 * Created by kenshoo-linux on 14/07/16.
 */

/**
 * Created by ken-linux2 on 12/07/16.
 */
public class AdGroup {


    private long id;
    private String engine;
    private String type;
    private String theme;

    public AdGroup(){}

    AdGroup(long id, String engine, String theme, String type){
        this.id = id;
        this.engine = engine;
        this.theme = theme;
        this.type = type;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

        if (id != adGroup.id) return false;
        if (!engine.equals(adGroup.engine)) return false;
        if (!type.equals(adGroup.type)) return false;
        return theme.equals(adGroup.theme);

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + engine.hashCode();
        result = 31 * result + type.hashCode();
        result = 31 * result + theme.hashCode();
        return result;
    }
    @Override
    public String toString() {
        return "AdGroup{" +
                "id=" + id +
                ", engine='" + engine + '\'' +
                ", type='" + type + '\'' +
                ", theme='" + theme + '\'' +
                '}';
    }
    //?  budgeting	fob
}