package by.example.lecture12.domain;

public class Resource {

    private String name;
    private ResourceType type;
    private int ping;

    public Resource(String name, ResourceType type, int ping) {
        this.name = name;
        this.type = type;
        this.ping = ping;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ResourceType getType() {
        return type;
    }

    public void setType(ResourceType type) {
        this.type = type;
    }

    public int getPing() {
        return ping;
    }

    public void setPing(int ping) {
        this.ping = ping;
    }

    @Override
    public String toString() {
        return "Resource{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", ping=" + ping +
                '}';
    }

}
