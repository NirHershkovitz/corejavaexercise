/**
 * Created by nirh on 06/07/16.
 */
public class Student {
    private String name;

    public void setName(String name) {
        if (name == null) {
            throw new RuntimeException("name cannot be null");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
