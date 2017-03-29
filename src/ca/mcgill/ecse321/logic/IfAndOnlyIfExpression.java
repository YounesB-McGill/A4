package ca.mcgill.ecse321.logic;

import java.util.List;

public class IfAndOnlyIfExpression extends BinaryExpression implements TLExpression {

	public IfAndOnlyIfExpression(TLExpression leftExpr, TLExpression rightExpr) {
		super(leftExpr, rightExpr);
	}

	@Override
    public boolean evaluate(List<? extends State> trajectory)
    {
        TLExpression le = this.getLeftExpression();
        TLExpression re = this.getRightExpression();

        if (le != null && re != null)
        {
            if (!(le.evaluate(trajectory) ^ re.evaluate(trajectory)))
            {
                return true;
            }
        }

        return false;
    }

}
