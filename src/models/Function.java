package models;

import java.util.ArrayList;

public class Function extends ScopeSymbol {

    private ArrayList<Variable> parameters;

    public Function(String name, String type) {
        super(name, type);
        parameters = new ArrayList<>();
    }

    public Function(String name, String type, ArrayList<Variable> parameters) {
        super(name, type);
        this.parameters = parameters;
    }

    public ArrayList<Variable> getParameters() {
        return parameters;
    }

    public void setParameters(ArrayList<Variable> parameters) {
        this.parameters = parameters;
    }
}
