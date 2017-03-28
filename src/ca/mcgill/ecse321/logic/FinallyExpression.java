package ca.mcgill.ecse321.logic;

import java.util.ArrayList;
import java.util.List;

public class FinallyExpression extends UnaryExpression implements TLExpression {

	public FinallyExpression(TLExpression expr) {
		super(expr);
	}
	
	@Override
	public boolean evaluate(List<? extends State> trajectory) {
		List<State> trajectory1 = new ArrayList<State>(trajectory);
		for(State s : trajectory){
			if(this.getExpression().evaluate(trajectory1)){
				return true;
			}
			trajectory1.remove(0);
		}
		return false;
	}

}
