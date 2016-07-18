/**
 * Created by nirh on 06/07/16.
 */
public class Student {

    private String name;
    private String id;

    public void setName(String name) {
        if (name == null) {
            throw new RuntimeException("name cannot be null");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id == null) {
            throw new RuntimeException("id cannot be null");
        }
        this.id = id;
    }

}
