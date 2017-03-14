package ca.mcgill.ecse321.logic;

import java.util.List;

public class NotExpression extends UnaryExpression implements TLExpression {

	public NotExpression(TLExpression expr) {
		super(expr);
	}
	
	public boolean evaluate(List<? extends State> trajectory) {
		// TODO Complete this method
		return false;
	}

}
