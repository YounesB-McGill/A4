package ca.mcgill.ecse321.logic;

import java.util.List;

public class ImpliesExpression extends BinaryExpression implements TLExpression {

	public ImpliesExpression(TLExpression leftExpr, TLExpression rightExpr) {
		super(leftExpr,rightExpr);
	}

	public boolean evaluate(List<? extends State> trajectory) {
		// TODO Complete this method
		if(leftExpression != null && rightExpression != null) {
			if(!leftExpression.evaluate(trajectory) || rightExpression.evaluate(trajectory)) return true;
			return false;
		}
		return false;
	}

}
