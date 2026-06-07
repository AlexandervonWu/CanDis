package edu.uta.cse.scope.macros;

import java.util.List;
import java.util.Map;

/**
 * This class encodes the normal form of a formula or function, which consists of a quantification tree and a matrix e-graph representation of the formula. 
 * The quantification tree captures the structure of the quantifiers in the formula, while the matrix e-graph captures the structure of the formula itself. 
 * The normal form can be used for distance calculation, as well as for other analyses and transformations on the formula.
 * It is the locus of control for the visitor that generates the normal form from the original formula. 
 */
public class NormalForm {
    private QuantificationTreeNode quantificationTreeRoot;
    // matrix e-graph representation of the formula, where each node is a subformula, and edges represent the structure of the formula.
    private EGraphNode matrixEGraphRoot;
    private List<QuantiVar> matrixQuantiVars; // the quantified variables in the matrix, in the order they appear in the formula.
    private Map<QuantiVar, QuantificationTreeNode> correspondingQuantificationTreeNodes; // a mapping from quantified variables in the matrix to their corresponding quantification tree nodes, for easy access.
}
