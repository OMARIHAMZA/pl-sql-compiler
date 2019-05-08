package models;

import java.util.ArrayList;
import java.util.HashMap;

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

    public String getSignature(){
        StringBuilder name = new StringBuilder(getName());
        for (Variable variable: parameters){
            name.append(variable.getType());
        }
        return name.toString();
    }

    @Override
    public boolean checkOccurrence(Scope scope) {
        for (HashMap.Entry<String, ScopeSymbol> entry : scope.getSymbolTable().entrySet()) {
            if (entry.getValue().getName().equalsIgnoreCase(getSignature())) {
                return true;
            }
        }
        return false;
    }
}
