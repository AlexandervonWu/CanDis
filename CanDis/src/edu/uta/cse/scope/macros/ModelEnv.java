package edu.uta.cse.scope.macros;

import java.util.Set;
import java.util.HashSet;

/*
 * Abstract Alloy Model Environment defined by a collection of predefined sets.
 * Consider a universal representation of the various Alloy models.
 * It would be editted by the visitor in those global declarations, and then used by the visitor in the local declarations and formulas.
 */
public class ModelEnv {
    private Set<String> sigs; // the set of signatures in the model
    private Set<String> fields; // the set of fields in the model
    private Set<String> globalBindings; // the set of global bindings in the model, including predicates, functions, facts, assertions, etc.
    public ModelEnv() {
        this.sigs = new HashSet<>();
        this.fields = new HashSet<>();
        this.globalBindings = new HashSet<>();
    }
    public void addSig(String sig) {
        this.sigs.add(sig);
    }
    public void addField(String field) {
        this.fields.add(field);
    }
    public void addGlobalBinding(String binding) {
        this.globalBindings.add(binding);
    }
    public boolean containsSig(String sig) {
        return this.sigs.contains(sig);
    }
    public boolean containsField(String field) {
        return this.fields.contains(field);
    }
    public boolean containsGlobalBinding(String binding) {
        return this.globalBindings.contains(binding);
    }
    public Set<String> getSigs() {
        return this.sigs;
    }
    public Set<String> getFields() {
        return this.fields;
    }
    public Set<String> getGlobalBindings() {
        return this.globalBindings;
    }
}
