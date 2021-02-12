package by.example.lecture12.domain;

public enum ResourceType {

    FILE_SYSTEM("File System"),
    NETWORK("Network"),
    DATABASE("Database");

    private String value;

    ResourceType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
