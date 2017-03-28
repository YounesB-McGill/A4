package ca.mcgill.ecse321.logic;

import java.util.List;

public class ImpliesExpression extends BinaryExpression implements TLExpression {

	public ImpliesExpression(TLExpression leftExpr, TLExpression rightExpr) {
		super(leftExpr,rightExpr);
	}

	public boolean evaluate(List<? extends State> trajectory) {
		
		if(this.leftExpression.evaluate(trajectory) && !(this.rightExpression.evaluate(trajectory))){
			return false;
		}
		return true;
	}

}
