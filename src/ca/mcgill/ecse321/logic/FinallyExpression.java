package ca.mcgill.ecse321.logic;

import java.util.List;

public class FinallyExpression extends UnaryExpression implements TLExpression {

	public FinallyExpression(TLExpression expr) {
		super(expr);
	}
	
	@Override
	public boolean evaluate(List<? extends State> trajectory) {
		int length = trajectory.size(); 
		if(expression == null){
			return false;
		}else{
			for(int i = 0 ; i < length ; ++i){
				List<? extends State> subTraj = trajectory.subList(i, length);
				if(expression.evaluate(subTraj)){
					return true;
				}
		}
		return false;
	}
	}

}
