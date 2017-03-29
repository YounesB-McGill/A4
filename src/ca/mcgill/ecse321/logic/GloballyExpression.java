package ca.mcgill.ecse321.logic;

import java.util.List;

public class GloballyExpression extends UnaryExpression implements TLExpression {

	public GloballyExpression(TLExpression expr) {
		super(expr);
	}
	
	@Override
	public boolean evaluate(List<? extends State> trajectory) {
		TLExpression expression = this.getExpression();
		if (expression != null) {
			if (!(expression.evaluate(trajectory))) {
				return false;
			} else {
				return true;
			}
		} else {
			return true;
		}
	}
}
