package ca.mcgill.ecse321.logic;

import java.util.List;

public class ImpliesExpression extends BinaryExpression implements TLExpression {

	public ImpliesExpression(TLExpression leftExpr, TLExpression rightExpr) {
		super(leftExpr,rightExpr);
	}

	public boolean evaluate(List<? extends State> trajectory) {
		// TODO Create this method
		//last 6 digits of student ID = 637353 rem mod 6 = 3
		
		TLExpression leftExpr = this.getLeftExpression();
		TLExpression rightExpr = this.getRightExpression();

		if(leftExpr==null || rightExpr==null){ // take inconsideration null case
			return false;
		} else {
			// A implies B is also (not A) or B
			return(!(leftExpr.evaluate(trajectory)) || rightExpr.evaluate(trajectory));
		}
	}
}
