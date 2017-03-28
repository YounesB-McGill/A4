package ca.mcgill.ecse321.logic;

import java.util.List;

public class FinallyExpression extends UnaryExpression implements TLExpression {

	public FinallyExpression(TLExpression expr) {
		super(expr);
	}
	
	@Override
	public boolean evaluate(List<? extends State> trajectory) {
		if(!this.getExpression().evaluate(trajectory)) return true;
		if (this.getExpression().evaluate(trajectory.subList(1, trajectory.size()))) {
			return true;
		} else return false;
	}

}
