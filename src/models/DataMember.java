package models;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Data member class of a certain type
 */
public class DataMember {

    private final String name;
    private final String type;

    public DataMember(String name, String type) {
        this.name = name;
        this.type = type;
    }



    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public JSONObject toJSON(){
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("name", this.name);
            jsonObject.put("type", this.type);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jsonObject;
    }

}
