package ca.mcgill.ecse321.logic;

import java.util.List;

public class FinallyExpression extends UnaryExpression implements TLExpression {

	public FinallyExpression(TLExpression expr) {
		super(expr);
	}

	@Override
	public boolean evaluate(List<? extends State> trajectory) {
		if (expression != null){
			for(int i = 0; i < trajectory.size(); i++){
				if(expression.evaluate(trajectory.subList(i, trajectory.size()-1))){
					return true;
				}
			}

		}
		return false;
	}
}
