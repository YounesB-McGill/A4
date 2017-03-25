package ca.mcgill.ecse321.logic;

import java.util.List;

public class FinallyExpression extends UnaryExpression implements TLExpression {

	public FinallyExpression(TLExpression expr) {
		super(expr);
	}
	
	@Override
	public boolean evaluate(List<? extends State> trajectory) {
		if(expression != null){
			for(int i = 0 ; i < trajectory.size() ; ++i){
				List<? extends State> subTraj = trajectory.subList(i, trajectory.size());
				if(expression.evaluate(subTraj)){
					return true;
				}
			}
		}
		return false;
	}

}
