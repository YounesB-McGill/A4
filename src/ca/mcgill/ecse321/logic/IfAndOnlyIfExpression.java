package ca.mcgill.ecse321.logic;

import java.util.List;

public class IfAndOnlyIfExpression extends BinaryExpression implements TLExpression {

	public IfAndOnlyIfExpression(TLExpression leftExpr, TLExpression rightExpr) {
		super(leftExpr, rightExpr);
	}

	//L <==> R == (L => R) AND (R => L)
	@Override
	public boolean evaluate(List<? extends State> trajectory) {
		TLExpression leftExpr = this.getLeftExpression();
		TLExpression rightExpr = this.getRightExpression();
		// Call a helper method that evaluates the 'implies' boolean logic operator
		// AND the returns of the two calls to obtain the if and only if boolean logic.
		if(imply(leftExpr, rightExpr, trajectory) && imply(rightExpr, leftExpr, trajectory)){
			return true;
		} else 
			return false;		
	}

	// L => R == (!L) OR R
	public boolean imply(TLExpression leftExpr, TLExpression rightExpr, List<? extends State> trajectory) {
		NotExpression notLeftExpr = new NotExpression(leftExpr);
		OrExpression implies = new OrExpression(notLeftExpr, rightExpr);
		// Return the not left or right
		return implies.evaluate(trajectory);
	}
}
