package ca.mcgill.ecse321.logic;

import java.util.List;

public class IfAndOnlyIfExpression extends BinaryExpression implements TLExpression {

	public IfAndOnlyIfExpression(TLExpression leftExpr, TLExpression rightExpr) {
		super(leftExpr, rightExpr);
	}

	@Override
	public boolean evaluate(List<? extends State> trajectory) {
	    ImpliesExpression implLeft = new ImpliesExpression(this.leftExpression, this.rightExpression);
	    ImpliesExpression implRight = new ImpliesExpression(this.rightExpression, this.leftExpression);
	    AndExpression andExpr = new AndExpression(implLeft, implRight);
        if(andExpr.evaluate(trajectory)){
            return true;
        } else {
            return false;
        }
	}

}
