package ca.mcgill.ecse321.logic;

import java.util.List;

public class ImpliesExpression extends BinaryExpression implements TLExpression {

	public ImpliesExpression(TLExpression leftExpr, TLExpression rightExpr) {
		super(leftExpr,rightExpr);
	}

	// 746205 mod 6 = 3, hence this method is implemented
	public boolean evaluate(List<? extends State> trajectory) {
		TLExpression leftExp = this.getLeftExpression(); 
		TLExpression rightExp = this.getRightExpression(); 
		
		// avoiding to call evaluate on a null object
		if(leftExp == null || rightExp == null) {
			return false; 
		} else {
			// (a implies b) reduces to (not(a) or b)
			return (!(leftExp.evaluate(trajectory)) || rightExp.evaluate(trajectory));
		}
	}

}
