package ca.mcgill.ecse321.logic;

import java.util.List;

public class AndExpression extends BinaryExpression implements TLExpression {

	public AndExpression(TLExpression leftExpr, TLExpression rightExpr) {
		super(leftExpr,rightExpr);
	}
	
	public boolean evaluate(List<? extends State> trajectory) {
		// TODO Complete this method
		return false;
	}

}
