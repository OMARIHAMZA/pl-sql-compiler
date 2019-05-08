package models;

import java.util.HashMap;

public class Scope {

    private HashMap<String, ScopeSymbol> symbolTable;

    public Scope() {
        symbolTable = new HashMap<>();
    }

    public void addSymbol(ScopeSymbol symbol) {
        if (symbol instanceof Function){
            StringBuilder name = new StringBuilder(symbol.getName());
            for (Variable variable: ((Function) symbol).getParameters()){
                name.append(variable.getType());
            }
            symbolTable.put(name.toString(), symbol);
        }else {
            symbolTable.put(symbol.getName(), symbol);
        }
    }

    public void copySymbols(HashMap<String, ScopeSymbol> symbolTable) {
        this.symbolTable.putAll(symbolTable);
    }

    public HashMap<String, ScopeSymbol> getSymbolTable() {
        return symbolTable;
    }

    public boolean containsSymbol(String symbolName){
        return symbolTable.containsKey(symbolName);
    }
}
