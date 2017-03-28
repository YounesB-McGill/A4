package ca.mcgill.ecse321.logic;

import java.util.List;

public class NextExpression extends UnaryExpression implements TLExpression {

	public NextExpression(TLExpression expr) {
		super(expr);
	}
	
	@Override
	public boolean evaluate(List<? extends State> trajectory) {
		// Assume trajectory includes the current state
		// Then if we are in the final state, trajectory.size()==1


		// Check if we are at the final state
		if (trajectory.size()>1){
			List<? extends State> newTrajectory = trajectory.subList(1,trajectory.size());
			return this.getExpression().evaluate(newTrajectory);
		}
		else{
			return false;
		}
	}

}
