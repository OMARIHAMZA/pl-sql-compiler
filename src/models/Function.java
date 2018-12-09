package models;

import java.util.ArrayList;

public class Function extends ScopeSymbol {

    private ArrayList<Variable> variables;

    public Function(String name, String type) {
        super(name, type);
    }

    public Function(String name, String type, ArrayList<Variable> variables) {
        super(name, type);
        this.variables = variables;
    }

    public ArrayList<Variable> getVariables() {
        return variables;
    }

    public void setVariables(ArrayList<Variable> variables) {
        this.variables = variables;
    }
}
