package ca.mcgill.ecse321.logic;

import java.util.List;

public class IfAndOnlyIfExpression extends BinaryExpression implements TLExpression {

	public IfAndOnlyIfExpression(TLExpression leftExpr, TLExpression rightExpr) {
		super(leftExpr, rightExpr);
	}

	@Override
	public boolean evaluate(List<? extends State> trajectory) {
		TLExpression leftExp = getLeftExpression();
		TLExpression rightExp = getRightExpression();
		if(leftExp != null && rightExp != null){
			if(leftExp.evaluate(trajectory) == true && rightExp.evaluate(trajectory) == true){
				return true;
			}
			return false;
		}
		return false;
	}

}
