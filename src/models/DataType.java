package models;

import java.util.HashMap;

public class DataType {

    private final String name;
    private final HashMap<String, DataMember> members;

    public DataType(String name) {
        this.name = name;
        this.members = new HashMap<>();
    }

    public DataType(String name, HashMap<String, DataMember> members) {
        this.name = name;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public HashMap<String, DataMember> getMembers() {
        return members;
    }

}

