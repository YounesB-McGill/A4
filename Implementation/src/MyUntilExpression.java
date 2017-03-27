import java.util.List;

import ca.mcgill.ecse321.logic.BinaryExpression;
import ca.mcgill.ecse321.logic.State;
import ca.mcgill.ecse321.logic.TLExpression;

public class MyUntilExpression extends BinaryExpression implements TLExpression {

	public MyUntilExpression(TLExpression leftExpr, TLExpression rightExpr) {
		super(leftExpr, rightExpr);
	}
	
	@Override
	public boolean evaluate(List<? extends State> trajectory) {
		// TODO Create this method
		// Not Done
		return false;
	}

}