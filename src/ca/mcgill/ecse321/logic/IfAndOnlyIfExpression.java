package ca.mcgill.ecse321.logic;

import java.util.List;

public class IfAndOnlyIfExpression extends BinaryExpression implements TLExpression {

	public IfAndOnlyIfExpression(TLExpression leftExpr, TLExpression rightExpr) {
		super(leftExpr, rightExpr);
	}

	@Override
	public boolean evaluate(List<? extends State> trajectory) {
		if ((leftExpression != null) && (rightExpression != null)) {
			return ((!leftExpression.evaluate(trajectory) && !rightExpression.evaluate(trajectory)) || (leftExpression.evaluate(trajectory) && rightExpression.evaluate(trajectory)));
		}
		return false;
	}

}
