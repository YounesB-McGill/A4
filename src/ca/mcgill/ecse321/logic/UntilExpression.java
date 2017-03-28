package ca.mcgill.ecse321.logic;

import java.util.List;

public class UntilExpression extends BinaryExpression implements TLExpression {

	public UntilExpression(TLExpression leftExpr, TLExpression rightExpr) {
		super(leftExpr, rightExpr);
	}
	
	@Override
	public boolean evaluate(List<? extends State> trajectory) {
		Boolean poop = true;
		if (poop)
			return poop;
		else
			return false;
	}

}
