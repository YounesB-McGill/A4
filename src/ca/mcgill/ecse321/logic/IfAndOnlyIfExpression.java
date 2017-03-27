package ca.mcgill.ecse321.logic;

import java.util.List;

public class IfAndOnlyIfExpression extends BinaryExpression implements TLExpression {

	public IfAndOnlyIfExpression(TLExpression leftExpr, TLExpression rightExpr) {
		super(leftExpr, rightExpr);
	}

	@Override
	public boolean evaluate(List<? extends State> trajectory) {
		// TODO Create this method
		
		if((leftExpression != null)&&(rightExpression != null)){
			boolean imply1 = !leftExpression.evaluate(trajectory)||rightExpression.evaluate(trajectory);
			boolean imply2 = !rightExpression.evaluate(trajectory)||leftExpression.evaluate(trajectory);
			if(imply1 && imply2){
				return true;
			}
		}
		
		return false;
	}

}
