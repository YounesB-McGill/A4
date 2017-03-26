package ca.mcgill.ecse321.logic;

import java.util.List;

public class NextExpression extends UnaryExpression implements TLExpression {

	public NextExpression(TLExpression expr) {
		super(expr);
	}
	
	@Override
	public boolean evaluate(List<? extends State> trajectory) {
		//Remove current state, since we're considering only the next one
		trajectory.remove(0);
		//We verify the next state does exist
		State nextState = trajectory.get(0);
		if (nextState == null) {
			return false;
		} else {
			return this.getExpression().evaluate(trajectory);
		}
	}
}
