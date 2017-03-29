package ca.mcgill.ecse321.logic;

import java.util.List;

public class IfAndOnlyIfExpression extends BinaryExpression implements TLExpression {

	public IfAndOnlyIfExpression(TLExpression leftExpr, TLExpression rightExpr) {
		super(leftExpr, rightExpr);
	}
	//L <==> R == (L => R) AND (R => L)
	@Override
	public boolean evaluate(List<? extends State> trajectory) {
		// TODO Create this method
		TLExpression leftExpr = this.getLeftExpression();
		TLExpression rightExpr = this.getRightExpression();
		if(imply(leftExpr, rightExpr, trajectory) && imply(rightExpr, leftExpr, trajectory)){
			return true;
		} else 
			return false;		
	}

	public boolean imply(TLExpression leftExpr, TLExpression rightExpr, List<? extends State> trajectory) {
		NotExpression notLeftExpr = new NotExpression(leftExpr);
		OrExpression implies = new OrExpression(notLeftExpr, rightExpr);
		
		return implies.evaluate(trajectory);
	}
}
