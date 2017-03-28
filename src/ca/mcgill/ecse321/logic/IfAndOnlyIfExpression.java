package ca.mcgill.ecse321.logic;

import java.util.List;

public class IfAndOnlyIfExpression extends BinaryExpression implements TLExpression {

	public IfAndOnlyIfExpression(TLExpression leftExpr, TLExpression rightExpr) {
		super(leftExpr, rightExpr);
	}

	@Override
	public boolean evaluate(List<? extends State> trajectory) {
		// (a <-> b) = (a -> b) AND (b -> a)
		TLExpression left = this.getLeftExpression();
		TLExpression right = this.getRightExpression();
		if(left != null && right != null){
			if(left.evaluate(trajectory) && right.evaluate(trajectory)){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
	}

}
