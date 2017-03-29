package ca.mcgill.ecse321.logic;

import java.util.List;

public class FinallyExpression extends UnaryExpression implements TLExpression {

	public FinallyExpression(TLExpression expr) {
		super(expr);
	}
	
	@Override
	public boolean evaluate(List<? extends State> trajectory) {
		// This is the method I am supposed to implement
		// I do not have the time so I will be skipping the
		// implementation but still doing the rest of the assignment
		// as mentioned as an option on MyCourses
		return false;
	}

}
