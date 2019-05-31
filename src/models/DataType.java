package models;

import utils.TypeRepository;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Data type class
 */
public class DataType {

    private final String name;
    private final LinkedHashMap<String, DataMember> members;
    private boolean isTemp = false;
    private String tableLocation, fieldTerminator;

    public DataType(String name) {
        this.name = name;
        this.members = new LinkedHashMap<>();
    }

    public DataType(String name, String tableLocation, String fieldTerminator) {
        this.name = name;
        this.members = new LinkedHashMap<>();
        this.tableLocation = tableLocation;
        this.fieldTerminator = fieldTerminator;
        TypeRepository.createDirectories(tableLocation, name);
    }

    public DataType(String name, LinkedHashMap<String, DataMember> members) {
        this.name = name;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public HashMap<String, DataMember> getMembers() {
        return members;
    }

    public String getTableLocation() {
        return tableLocation;
    }

    public void setTableLocation(String tableLocation) {
        this.tableLocation = tableLocation;
    }

    public String getFieldTerminator() {
        return fieldTerminator;
    }

    public void setFieldTerminator(String fieldTerminator) {
        this.fieldTerminator = fieldTerminator;
    }

    public boolean isTemp() {
        return isTemp;
    }

    public void setTemp(boolean temp) {
        isTemp = temp;
    }

    @Override
    public String toString() {
        return "--DataType--\nName:" + name + "\nLocation: " + tableLocation + "\nField Terminator: " + fieldTerminator;
    }
}

