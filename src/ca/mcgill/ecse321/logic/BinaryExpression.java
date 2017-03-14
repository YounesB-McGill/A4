package ca.mcgill.ecse321.logic;

abstract public class BinaryExpression {

	protected TLExpression leftExpression;
	protected TLExpression rightExpression;

	public BinaryExpression() {
		super();
	}
	
	public BinaryExpression(TLExpression leftExpr, TLExpression rightExpr) {
		this.leftExpression = leftExpr;
		this.rightExpression = rightExpr;
	}

}