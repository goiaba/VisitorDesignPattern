package edu.luc.cs.spring2015.comp473.project4.visitorpattern.visitor;

import static org.junit.Assert.assertEquals;
import static edu.luc.cs.spring2015.comp473.project4.visitorpattern.Fixtures.*;
import org.junit.Test;

public class EvaluatorTest {

	@Test
	public void testEvaluateSimpleConstExpr() {
		Double res = Evaluator.getInstance().evaluate(constExpr1);
		assertEquals(20d, res.doubleValue(), 0);
	}
	
	@Test
	public void testEvaluateUMinusExpr() {
		Double resExpected = Evaluator.getInstance().evaluate(constExpr4);
		Double resEvaluated = Evaluator.getInstance().evaluate(uMinusExpr);
		assertEquals(-1 * resExpected, resEvaluated, 0);
	}
	
	@Test
	public void testEvaluateDivExpr() {
		Double res = Evaluator.getInstance().evaluate(divExpr);
		assertEquals(10d, res.doubleValue(), 0);
	}
	
	@Test
	public void testEvaluateTimesExpr() {
		Double res = Evaluator.getInstance().evaluate(timesExpr1);
		assertEquals(-12d, res.doubleValue(), 0);
	}
	
	@Test
	public void testEvaluateComplexExpr1() {
		Double res = Evaluator.getInstance().evaluate(complexExpr1);
		assertEquals(-2d, res.doubleValue(), 0);
	}
	
	@Test
	public void testEvaluateComplexExpr2() {
		Double res = Evaluator.getInstance().evaluate(complexExpr2);
		assertEquals(-12d, res.doubleValue(), 0);
	}

}
