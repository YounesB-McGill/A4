package ca.mcgill.ecse321.logic;

import java.util.List;

public class OrExpression extends BinaryExpression implements TLExpression {

	public OrExpression(TLExpression leftExpr, TLExpression rightExpr) {
		super(leftExpr,rightExpr);
	}
	
	@Override
	public boolean evaluate(List<? extends State> trajectory) {
		if ( (leftExpression != null) && (rightExpression != null) ) {
			return leftExpression.evaluate(trajectory) || rightExpression.evaluate(trajectory);
		} else {
			return false;		
		}
	}

}
