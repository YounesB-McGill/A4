package ca.mcgill.ecse321.logic;

import java.util.List;

public class GloballyExpression extends UnaryExpression implements TLExpression {

	public GloballyExpression(TLExpression expr) {
		super(expr);
	}
	
	@Override
	public boolean evaluate(List<? extends State> trajectory) {
		boolean global=true;
		for ( int i=0;i<trajectory.size();i++){
			if(trajectory.get(i)!=false){
				global=false;
			}
		}

		return global;
	}

}
