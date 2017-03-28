package ca.mcgill.ecse321.logic;

import java.util.List;

public class GloballyExpression extends UnaryExpression implements TLExpression {

	public GloballyExpression(TLExpression expr) {
		super(expr);
	}
	
	@Override
	public boolean evaluate(List<? extends State> trajectory) {
		for(int i=0; i<trajectory.size();i++){
			if(!expression.evaluate(trajectory.subList(i, i+1))){
				return false;
			}
		}
		return true;
	}

}
