package ca.mcgill.ecse321.logic;

import java.util.List;

public class GloballyExpression extends UnaryExpression implements TLExpression {

	public GloballyExpression(TLExpression expr) {
		super(expr);
	}
	
	@Override
	public boolean evaluate(List<? extends State> trajectory) {
		TLExpression subExpression = this.getExpression();
		
		// if the expression is null, return false
		if (subExpression == null) {
			return false;
		}
		else {
			// determine the value of the trajectory
			boolean base = subExpression.evaluate(trajectory);
			int length = trajectory.size();
			
			// check if the value of the trajectory is equal throughout each subtrajectory
			for (int i = 0; i < length; i++) {
				List<? extends State> subTrajectory = trajectory.subList(i, length);
				
				// if not, return false (does not hold somewhere along the trajectory)
				if (subExpression.evaluate(subTrajectory) != base) {
					return false;
				}
			}
			
			// if so, return true (holds globally)
			return true;
		}
	}

}
