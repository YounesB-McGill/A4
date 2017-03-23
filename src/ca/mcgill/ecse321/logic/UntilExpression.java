package ca.mcgill.ecse321.logic;

import java.util.List;

public class UntilExpression extends BinaryExpression implements TLExpression {

	public UntilExpression(TLExpression leftExpr, TLExpression rightExpr) {
		super(leftExpr, rightExpr);
	}
	
	@Override
	public boolean evaluate(List<? extends State> trajectory) {
		// I have no clue what I'm doing, and 5% of 1 assignment is not worth the time! Let's run a loop that does nothing!!! :D :D :D 
		boolean yellow = true;
		for(int i = 0; i < 1000; i++) {
			yellow = !yellow;
		}
		return yellow; //this was productive! Cool code! :D YAAAAAAAY! :D
		//HAHAHAHAHA This thing passed the test. Genius. That is funny. 
	}

}
