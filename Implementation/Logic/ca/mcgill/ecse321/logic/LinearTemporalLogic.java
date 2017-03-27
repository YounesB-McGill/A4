package ca.mcgill.ecse321.logic;

import java.util.ArrayList;
import java.util.List;

public class LinearTemporalLogic<T extends State> {

	public static <T extends State> LinearTemporalLogic<T> create(Class<T> cls) {
		return new LinearTemporalLogic<T>(cls);
	}
	
	Class<T> c = null;

    public LinearTemporalLogic(Class<T> c) {
        super();
        this.c = c;
    }

    public T createState()
            throws InstantiationException,
            IllegalAccessException {
        return c.newInstance();
    }

	
	public List<T> createTrajectory(String[] stateStrings) 
			throws InstantiationException, IllegalAccessException {
		List<T> trajectory = new ArrayList<T>();
		for (int i = 0; i < stateStrings.length; i++) {
			T state;
			state = createState();
			state.setState(stateStrings[i]);
			trajectory.add(state);
		}
		return trajectory;
	}
	
}
