package ca.mcgill.ecse321.logic;

import java.util.List;

public class FinallyExpression extends UnaryExpression implements TLExpression {

	public FinallyExpression(TLExpression expr) {
		super(expr);
	}
	
	@Override
	public boolean evaluate(List<? extends State> trajectory) {
		int i = 0;
		while(i < trajectory.size()){
			
			if (this.getExpression().evaluate(trajectory.subList(i, trajectory.size()))){
				return true;
			}
			else{
				i++;
			}
			
		}
		return false;

	}

}
