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
		if(imply(leftExpr, rightExpr) && imply(leftExpr, rightExpr)){
			return true;
		} else 
			return false;		
	}

	public boolean imply(TLExpression leftExpr, TLExpression rightExpr) {
		if(/* leftExpre == TRUE && rightExpr == TRUE */){
			return true;
		} else if(/* leftExpre == TRUE && rightExpr == FALSE */){
			return false;
		} else if(/* leftExpre == FALSE && rightExpr == TRUE */){
			return true;
		} else if(/* leftExpre == FALSE && rightExpr == FALSE */){
			return true;
		} else {
			// throw new InvalidExpression();
		}

	}
}
