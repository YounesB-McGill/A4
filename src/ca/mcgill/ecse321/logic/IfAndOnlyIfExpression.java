package ca.mcgill.ecse321.logic;

import java.util.List;

public class IfAndOnlyIfExpression extends BinaryExpression implements TLExpression {

	public IfAndOnlyIfExpression(TLExpression leftExpr, TLExpression rightExpr) {
		super(leftExpr, rightExpr);
	}

	@Override
	public boolean evaluate(List<? extends State> trajectory) {
		if ((leftExpression != null) && (rightExpression != null)){
			boolean left = leftExpression.evaluate(trajectory);
			boolean right = rightExpression.evaluate(trajectory);
			if ( left || right){
				return left && right;
			} else {
				return true;
			}
		} else {
			return false;
		}
	}

}
