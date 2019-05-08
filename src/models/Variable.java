package models;

import java.util.HashMap;

public class Variable extends ScopeSymbol {

    public Variable(String name, String type) {
        super(name, type);
    }

    @Override
    public boolean checkOccurrence(Scope scope) {
        for (HashMap.Entry<String, ScopeSymbol> entry : scope.getSymbolTable().entrySet()) {
            if (entry.getValue().getName().equalsIgnoreCase(getName())) {
                return true;
            }
        }
        return false;
    }
}
