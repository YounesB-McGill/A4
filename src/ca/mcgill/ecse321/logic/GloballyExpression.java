package ca.mcgill.ecse321.logic;

import java.util.List;

public class GloballyExpression extends UnaryExpression implements TLExpression {

	public GloballyExpression(TLExpression expr) {
		super(expr);
	}
	
	@Override
	public boolean evaluate(List<? extends State> trajectory) {
		// TODO Create this method
		if ( expression != null ) {
			return expression.evaluate(trajectory);
		}
		else{
		return false;
		}
		
	}

}

