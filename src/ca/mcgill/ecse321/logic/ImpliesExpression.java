package ca.mcgill.ecse321.logic;

import java.util.List;

public class ImpliesExpression extends BinaryExpression implements TLExpression {

	public ImpliesExpression(TLExpression leftExpr, TLExpression rightExpr) {
		super(leftExpr, rightExpr);
	}

	public boolean evaluate(List<? extends State> trajectory) {
		// TODO Complete this method
		TLExpression leftExpr = this.getLeftExpression();
		TLExpression rightExpr = this.getRightExpression();
		if (leftExpr == null || rightExpr == null) {
			return false;
		} else {
			return (!(leftExpr.evaluate(trajectory)) || rightExpr.evaluate(trajectory));
		}
	}

}
