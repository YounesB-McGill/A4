package ca.mcgill.ecse321.logic;

import java.util.List;

public class GloballyExpression extends UnaryExpression implements TLExpression {

	public GloballyExpression(TLExpression expr) {
		super(expr);
	}
	
	@Override
	public boolean evaluate(List<? extends State> trajectory) {
		TLExpression expression = this.getExpression();
		
		// if the expression is null, the expression cannot hold
		if (expression == null) {
			return false;
		}
		else {
			int length = trajectory.size();
			
			// check if the expression holds for each subtrajectory
			for (int i = 0; i < length; i++) {
				// get the subtrajectory to check
				List<? extends State> subTrajectory = trajectory.subList(i, i + 1);
				
				// if it fails in some subtrajectory, it must not hold globally
				if (!expression.evaluate(subTrajectory)) {
					return false;
				}
			}
			
			// if it doesn't fail, it must hold globally
			return true;
		}
	}

}
