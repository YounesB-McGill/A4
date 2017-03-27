package ca.mcgill.ecse321.logic;

import java.util.List;

public class FinallyExpression extends UnaryExpression implements TLExpression {

	public FinallyExpression(TLExpression expr) {
		super(expr);
	}
	
	@Override
	public boolean evaluate(List<? extends State> trajectory) {
		while (!trajectory.isEmpty()){
			if (this.getExpression().evaluate(trajectory)){
				return true;
			} else {
				trajectory.remove(0);
			}
		}
		return false;
	}

}
