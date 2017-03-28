package ca.mcgill.ecse321.logic;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestLinearTemporalLogic {

	List<TrafficLightState> trajectory;
	
	/**
	 * A sample trajectory of a traffic light consists of four states
	 *   State 1: only atomic predicate "red" holds
	 *   State 2: atomic predicates "red" and "yellow" hold
	 *   State 3: only atomic predicate "green" holds
	 *   State 4: only atomic predicate "yellow" holds
	 *  
	 * This trajectory is used for each test case below
	 */
	@Before
	public void setUp() throws Exception {
		LinearTemporalLogic<TrafficLightState> ltl = 
				LinearTemporalLogic.create(TrafficLightState.class);
		String[] stateStrings = {"r", "ry", "g", "y"}; 
		try {
			trajectory = ltl.createTrajectory(stateStrings);
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testLTLTrajectory() {
		assertEquals(4, trajectory.size());
		assertEquals("R", trajectory.get(0).printState());
		assertEquals("RY", trajectory.get(1).printState());
		assertEquals("G", trajectory.get(2).printState());
		assertEquals("Y", trajectory.get(3).printState());
	}

	@Test
	public void testAtomicExpression() {
		TLExpression expr = new AtomicExpression("red");
		assertEquals(true, expr.evaluate(trajectory));
	}

	@Test
	public void testNotExpression() {
		TLExpression left1 = new AtomicExpression("green"); 
		TLExpression expr1 = new NotExpression(left1);
		assertEquals(true, expr1.evaluate(trajectory));
		TLExpression left2 = new AtomicExpression("red"); 
		TLExpression expr2 = new NotExpression(left2);
		assertEquals(false, expr2.evaluate(trajectory));
	}

	@Test
	public void testAndExpression() {
		TLExpression left = new AtomicExpression("red"); 
		TLExpression right = new AtomicExpression("red"); 
		TLExpression expr = new AndExpression(left, right);
		assertEquals(true, expr.evaluate(trajectory));
		TLExpression right2 = new AtomicExpression("green"); 
		TLExpression expr2 = new AndExpression(left, right2);
		assertEquals(false, expr2.evaluate(trajectory));
	}

	@Test
	public void testOrExpression() {
		TLExpression left1 = new AtomicExpression("red"); 
		TLExpression right = new AtomicExpression("green"); 
		TLExpression expr = new OrExpression(left1, right);
		assertEquals(true, expr.evaluate(trajectory));
		TLExpression left2 = new AtomicExpression("yellow"); 
		TLExpression expr2 = new OrExpression(left2, right);
		assertEquals(false, expr2.evaluate(trajectory));
	}

	@Test
	public void testImpliesExpression() {
		TLExpression left = new AtomicExpression("green"); 
		TLExpression right = new AtomicExpression("red"); 
		TLExpression expr1 = new ImpliesExpression(left, right);
		assertEquals(true, expr1.evaluate(trajectory));
		TLExpression expr2 = new ImpliesExpression(right, left);
		assertEquals(false, expr2.evaluate(trajectory));
	}

	@Test
	public void testIfAndOnlyIfExpression() {
		TLExpression left = new AtomicExpression("red"); 
		TLExpression right = new AtomicExpression("red"); 
		TLExpression expr1 = new IfAndOnlyIfExpression(left, right);
		assertEquals(true, expr1.evaluate(trajectory));
		TLExpression right2 = new AtomicExpression("green"); 
		TLExpression expr2 = new ImpliesExpression(left, right2);
		assertEquals(false, expr2.evaluate(trajectory));
	}

	@Test
	public void testFinallyExpression() {
		TLExpression green = new AtomicExpression("green"); 
		TLExpression expr1 = new FinallyExpression(green);
		assertEquals(true, expr1.evaluate(trajectory));
	}

	@Test
	public void testGloballyExpression() {
		TLExpression green = new AtomicExpression("green"); 
		TLExpression red = new AtomicExpression("red");
		TLExpression andExpr = new AndExpression(red, green);
		TLExpression notExpr = new NotExpression(andExpr); 
		TLExpression expr1 = new GloballyExpression(notExpr);
		assertEquals(true, expr1.evaluate(trajectory));
	}

	@Test
	public void testUntilExpression() {
		TLExpression red = new AtomicExpression("red");
		TLExpression green = new AtomicExpression("green"); 
		TLExpression expr1 = new UntilExpression(red, green);
		assertEquals(true, expr1.evaluate(trajectory));
	}

	@Test
	public void testNextExpression() {
		TLExpression yellow = new AtomicExpression("yellow"); 
		TLExpression expr1 = new NextExpression(yellow);
		assertEquals(true, expr1.evaluate(trajectory));
	}

	
}
