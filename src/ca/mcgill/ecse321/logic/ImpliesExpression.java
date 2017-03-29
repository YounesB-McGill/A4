package ca.mcgill.ecse321.logic;

import java.util.List;

public class ImpliesExpression extends BinaryExpression implements TLExpression {

	public ImpliesExpression(TLExpression leftExpr, TLExpression rightExpr) {
		super(leftExpr,rightExpr);
	}

	public boolean evaluate(List<? extends State> trajectory) {
		System.out.println("Hi this is filler code because I don't understand temporal logic.");
		return false;
	}

}
