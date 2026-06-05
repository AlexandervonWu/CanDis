package edu.uta.cse.scope.macros;

/**
 * This class represents a node in the slotted e-graph of the matrix of the normal form.
 * The e-graph is a graph representation of the formula, where each node represents a subformula, and edges represent the structure of the formula.
 * For example, for a formula like "P(x) and Q(y)", the e-graph would have a node for "P(x)", a node for "Q(y)", and an edge between them representing the "and" operator. 
 * The e-graph shall be used to make the distance minimal, to capture the symmetry, associativity, commutativity, and other properties of the formula, 
 * which can help to make the distance calculation more accurate and efficient.
 * TODO: define the structure of the e-graph, and how to generate it from the original formula using the Normal Form Visitor.
 */
public class EGraphNode {
    
}
