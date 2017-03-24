package ca.mcgill.ecse321.logic;

import java.util.List;

public class ImpliesExpression extends BinaryExpression implements TLExpression {

	public ImpliesExpression(TLExpression leftExpr, TLExpression rightExpr) {
		super(leftExpr,rightExpr);
	}

	public boolean evaluate(List<? extends State> trajectory) {
	    NotExpression notLeft = new NotExpression(this.leftExpression);
	    OrExpression orExpr = new OrExpression(notLeft, this.rightExpression);
        if(orExpr.evaluate(trajectory)){
            return true;
        } else {
            return false;
        }
	}

}
