package ca.mcgill.ecse321.logic;

public class TrafficLightState extends State {

	private boolean red;
	private boolean yellow;
	private boolean green;
	
	@Override
	public void setState(String stateString) {
		this.red = stateString.contains("r");
		this.yellow = stateString.contains("y");
		this.green = stateString.contains("g");
	}
	
	@Override
	public String printState() {
		String result = "";
		if (this.red) {
			result += "R";
		}
		if (this.yellow) {
			result += "Y";
		}
		if (this.green) {
			result += "G";
		}
		return result;
	}
	
	@Override
	public boolean isValid(String atomicPredicate) {
		if ("red".equals(atomicPredicate)) {
			return red;
		} else if ("yellow".equals(atomicPredicate)) {
			return yellow;
		} else if ("green".equals(atomicPredicate)) {
			return green;
		}
		return false;
	}

}
