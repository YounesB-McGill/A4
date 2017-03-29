package ca.mcgill.ecse321.logic;

import java.util.List;

public class NotExpression extends UnaryExpression implements TLExpression {

	public NotExpression(TLExpression expr) {
		super(expr);
	}
	
	public boolean evaluate(List<? extends State> trajectory) {
		TLExpression subExpr = this.getExpression();
		if (subExpr == null) {
			return false;
		} else {
			if (subExpr.evaluate(trajectory)) {
				return false;
			} else {
				return true;
			}
		}
	}

}
