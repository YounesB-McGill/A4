package ca.mcgill.ecse321.logic;

import java.util.List;

public class UntilExpression extends BinaryExpression implements TLExpression {

	public UntilExpression(TLExpression leftExpr, TLExpression rightExpr) {
		super(leftExpr, rightExpr);
	}
	
	// For 0 until the time right is true - 1, left must be true
	@Override
	public boolean evaluate(List<? extends State> trajectory) {
		for(int i=0; i<trajectory.size();i++) {
			if(rightExpression.evaluate(trajectory.subList(i, trajectory.size()-1))) {
				// right has been reached and left was never false before that time
				return true;
			}
			if(!leftExpression.evaluate(trajectory.subList(i, trajectory.size()-1))) {
				// right has not been reached and left is false
				return false;
			}
		}
		// right is never reached and left is always true, so I guess we return true
		return true;
	}

}
