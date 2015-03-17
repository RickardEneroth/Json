package se.eneroth.json;

import java.util.Map;

/**
 * Created by Rickard on 2015-03-17.
 */
public class Model {
    private int id;
    private Map<String, Object> attributes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Map<String, Object> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, Object> attributes) {
        this.attributes = attributes;
    }
}
