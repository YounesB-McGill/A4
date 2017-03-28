package ca.mcgill.ecse321.logic;


public abstract class State {
	
	public boolean isValid(String atomicPredicate) {
		return false;
	}
	
	public abstract void setState(String stateString);
	public abstract String printState();

}
