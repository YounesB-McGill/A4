package ca.mcgill.ecse321.logic;

import java.util.List;

public class IfAndOnlyIfExpression extends BinaryExpression implements TLExpression {

	public IfAndOnlyIfExpression(TLExpression leftExpr, TLExpression rightExpr) {
		super(leftExpr, rightExpr);
	}

	@Override
public boolean evaluate(List<? extends State> trajectory) {
	// TODO Create this method

	if (rightExpression != null && leftExpression != null) {

		boolean term1 = !leftExpression.evaluate(trajectory) || rightExpression.evaluate(trajectory);
		boolean term2 = !rightExpression.evaluate(trajectory) || leftExpression.evaluate(trajectory);

		if(term1 && term2)
			return true;
	}
	
	return false;
}

}
