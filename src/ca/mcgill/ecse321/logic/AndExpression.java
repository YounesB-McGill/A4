package ca.mcgill.ecse321.logic;

import java.util.List;

public class AndExpression extends BinaryExpression implements TLExpression {

	public AndExpression(TLExpression leftExpr, TLExpression rightExpr) {
		super(leftExpr,rightExpr);
	}
	
	@Override
    public boolean evaluate(List<? extends State> trajectory) {
		// TODO Complete this method
	    
	    if(leftExpression!= null && rightExpression != null) {
	        return leftExpression.evaluate(trajectory) && rightExpression.evaluate(trajectory);
	    }else {
	        return false;
	    }
	}

}
