package ca.mcgill.ecse321.logic;

import java.util.List;

public class GloballyExpression extends UnaryExpression implements TLExpression {

	public GloballyExpression(TLExpression expr) {
		super(expr);
	}
	
	@Override
	public boolean evaluate(List<? extends State> trajectory) {
		// TODO Create this method
		
		int size = trajectory.size();
		TLExpression expr = this.getExpression();
		
		//To check if the expression holds globally, we go through each state and see if they all holds
		//If the expression exists
		if(expr != null){
		   for(int i=0; i<size; i++){
		    	if(!expr.evaluate(trajectory)){
		    		return false;
		    	}
		   }
		}
		
		return true;
	}
}
