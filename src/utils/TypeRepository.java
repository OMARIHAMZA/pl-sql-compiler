package utils;

import models.DataMember;
import models.DataType;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class TypeRepository {

    public static HashMap<String, DataType> typeHashMap = new HashMap<>();

    public static void addDataType(DataType dataType) {
        typeHashMap.put(dataType.getName(), dataType);
        writeDataToFile("output.txt");
    }

    public static JSONArray getMember(String name) throws JSONException {
        HashMap<String, DataMember> dataMembers = typeHashMap.get(name).getMembers();
        JSONArray jsonArray = new JSONArray();
        for (HashMap.Entry<String, DataMember> entry : dataMembers.entrySet()) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("name", entry.getKey());
            jsonObject.put("type", entry.getValue().getType());
            jsonArray.put(jsonObject);
        }
        return jsonArray;
    }

    public static void writeDataToFile(String filePath) {
        JSONArray jsonArray = new JSONArray();
        for (HashMap.Entry<String, DataType> entry : typeHashMap.entrySet()) {
            //name:string, members:array
            //member:object -> name:string, type:string
            JSONObject jsonObject = new JSONObject();
            try {
                JSONArray membersJSONArray = new JSONArray();
                for (HashMap.Entry<String, DataMember> entry1 : entry.getValue().getMembers().entrySet()) {
                    JSONObject member = new JSONObject();
                    member.put("name", entry1.getKey());
                    member.put("type", entry1.getValue().getType());
                    membersJSONArray.put(member);
                }
                jsonObject.put("name", entry.getKey());
                jsonObject.put("members", membersJSONArray);
                jsonArray.put(jsonObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        try {
            PrintWriter printWriter = new PrintWriter(filePath);
            printWriter.write((jsonArray.toString()).replaceAll("\\\\", ""));
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void readDataFromFile(String filePath) {
        try {
            JSONArray jsonArray = new JSONArray(new Scanner(new FileInputStream(filePath)).useDelimiter("\\Z").next());
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject currentJSONObject = jsonArray.getJSONObject(i);
                HashMap<String, DataMember> dataMembers = new HashMap<>();
                JSONArray membersJSONArray = currentJSONObject.getJSONArray("members");
                for (int j = 0; j < membersJSONArray.length(); j++) {
                    JSONObject currentMember = membersJSONArray.getJSONObject(j);
                    dataMembers.put(currentMember.getString("name"),
                            new DataMember(currentMember.getString("name"),
                                    currentMember.getString("type")));
                }
                DataType type = new DataType(currentJSONObject.getString("name"), dataMembers);
                typeHashMap.put(type.getName(), type);
            }
        } catch (JSONException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void test(String typeName) {
        DataType dataType = typeHashMap.get(typeName);
        for (HashMap.Entry<String, DataMember> entry : dataType.getMembers().entrySet()) {
            System.out.println(entry.getKey());
        }
    }

    public static String flatten(String typeName) {
        DataType dataType = typeHashMap.get(typeName);
        StringBuilder result = new StringBuilder();
        JSONArray jsonArray = new JSONArray();

        for (HashMap.Entry<String, DataMember> entry : dataType.getMembers().entrySet()) {
            if (isPrimitive(entry.getValue().getType())) {
                try {
                    jsonArray.put(new JSONObject()
                            .put("name", entry.getValue().getName())
                            .put("type", entry.getValue().getType()));

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            } else {
               /* JSONArray recursiveJSONArray = new JSONArray(flatten(entry.getValue().getType()));
                //Add every object of deep (recursive) arrays to result array
                for (Object member : recursiveJSONArray) {
                    jsonArray.put(member);
                }*/

            }
        }

        result.append(jsonArray);

        return result.toString();
    }

    private static boolean isPrimitive(String type) {
        return type.equalsIgnoreCase("int")
                || type.equalsIgnoreCase("real")
                || type.equalsIgnoreCase("boolean")
                || type.equalsIgnoreCase("string");
    }

}
