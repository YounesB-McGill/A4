package ca.mcgill.ecse321.logic;

import java.util.List;

public class OrExpression extends BinaryExpression implements TLExpression {

	public OrExpression(TLExpression leftExpr, TLExpression rightExpr) {
		super(leftExpr,rightExpr);
	}
	
	@Override
	public boolean evaluate(List<? extends State> trajectory) {
		// TODO Complete this method
		return false;
	}

}
