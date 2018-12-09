package models;

import java.util.HashMap;

public class Scope {

    private HashMap<String, ScopeSymbol> symbolTable;

    public Scope() {
        symbolTable = new HashMap<>();
    }

    public void addSymbol(ScopeSymbol symbol) {
        symbolTable.put(symbol.getName(), symbol);
    }

    public void copySymbols(HashMap<String, ScopeSymbol> symbolTable) {
        this.symbolTable.putAll(symbolTable);
    }

    public HashMap<String, ScopeSymbol> getSymbolTable() {
        return symbolTable;
    }
}
