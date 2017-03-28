package ca.mcgill.ecse321.logic;

import java.util.List;

public class NextExpression extends UnaryExpression implements TLExpression {

	public NextExpression(TLExpression expr) {
		super(expr);
	}
	
	@Override
	public boolean evaluate(List<? extends State> trajectory) {
		// TODO Create this method
		return false;
	}

}
