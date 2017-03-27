package ca.mcgill.ecse321.logic;

import java.util.List;

public class AtomicExpression implements TLExpression {

	private String predicate;
	
	public AtomicExpression(String aPredicate) {
		this.predicate = aPredicate;
	}

	public boolean evaluate(List<? extends State> trajectory) {
		State currentState = trajectory.get(0);
		if (currentState == null) {
			return false;
		} else {
			return currentState.isValid(predicate);
		}		
	}

}
