package ca.mcgill.ecse321.logic;

abstract public class UnaryExpression {

	protected TLExpression expression;

	public UnaryExpression() {
		super();
	}

	public UnaryExpression(TLExpression expr) {
		this.expression = expr;
	}
	
	public TLExpression getExpression() {
		return expression;
	}
}