package ca.mcgill.ecse321.logic;

import java.util.List;

public interface TLExpression {
	public boolean evaluate(List<? extends State> trajectory);

}
