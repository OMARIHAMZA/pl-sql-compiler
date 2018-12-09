package models;

public abstract class ScopeSymbol {

    private final String name;
    private final String type;

    public ScopeSymbol(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
