package edu.uta.cse.scope.macros;

// This class encodes quantified variables
// invariants: variables are up to De Bruijn indices, but still have names; most importantly, encoding types. 
public class QuantiVar {
    private int id;
    private String name;
    private String type;
    public QuantiVar(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof QuantiVar)) return false;
        QuantiVar qv = (QuantiVar) o;
        return this.id == qv.id;
    }
    public boolean sameType(QuantiVar qv) {
        return this.type.equals(qv.type);
    }
    public String toString() {
        // in JSON form
        return "{\"id\": " + id + ", \"name\": \"" + name + "\", \"type\": \"" + type + "\"}";
    }
}
