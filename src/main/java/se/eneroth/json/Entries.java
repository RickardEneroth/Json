package se.eneroth.json;

import java.util.List;
import java.util.Map;

public class Entries {
    private MetaData _meta;
    private String title;
    private List<String> containers;
    private List<String> items;
    private Map<String, Object> attributes;

    public MetaData get_meta() {
        return _meta;
    }

    public void set_meta(MetaData _meta) {
        this._meta = _meta;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getContainers() {
        return containers;
    }

    public void setContainers(List<String> containers) {
        this.containers = containers;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    public Map<String, Object> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, Object> attributes) {
        this.attributes = attributes;
    }
}
