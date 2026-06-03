

import java.io.FileNotFoundException;

import edu.mit.csail.sdg.alloy4.A4Reporter;
import edu.mit.csail.sdg.parser.CompModule;
import edu.mit.csail.sdg.parser.CompUtil;
import parser.ast.nodes.Body;
import parser.ast.nodes.ExprOrFormula;
import parser.ast.nodes.ModelUnit;
import parser.ast.nodes.Predicate;
// import parser.ast.visitor.PrettyStringTypeAnnotatedVisitor;


public class DemostrateType {
	
	
	public static void main (String [] args) throws FileNotFoundException {
		

        //Which granularity of templates
        PrettyStringTypeAnnotatedVisitor type_inline = new PrettyStringTypeAnnotatedVisitor();

        CompModule module = CompUtil.parseEverything_fromFile(A4Reporter.NOP, null, "courses-v1.als");
	 	assert module != null;
	 	ModelUnit mu = new ModelUnit(null, module);

	 	for(Predicate pred : mu.getPredDeclList()) {
	 		Body body = pred.getBody();
	 		ExprOrFormula body_expr = body.getBodyExpr();	 	
	 		System.out.println(pred.getName());
	 		System.out.println(type_inline.visit(body_expr, null));
	 	}
	}
}
