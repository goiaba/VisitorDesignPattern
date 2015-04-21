package edu.luc.cs.spring2015.comp473.project4.visitorpattern.visitor;

import static edu.luc.cs.spring2015.comp473.project4.visitorpattern.Fixtures.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.luc.cs.spring2015.comp473.project4.visitorpattern.Fixtures;

public class PrettyPrinterTest {

	@Test
	public void testPrintSimpleConstExpr() {
		String res = PrettyPrinter.getInstance().print(constExpr1);
		assertEquals(constExpr1Print, res);
	}
	
	@Test
	public void testPrintUMinusExpr() {
		String resPrint = PrettyPrinter.getInstance().print(uMinusExpr);
		assertEquals(uMinusExprPrint, resPrint);
	}
	
	@Test
	public void testPrintDivExpr() {
		String res = PrettyPrinter.getInstance().print(divExpr);
		assertEquals(divExprPrint, res);
	}
	
	@Test
	public void testPrintTimesExpr() {
		String res = PrettyPrinter.getInstance().print(timesExpr1);
		assertEquals(timesExpr1Print, res);
	}
	
	@Test
	public void testPrintComplexExpr1() {
		String res = PrettyPrinter.getInstance().print(Fixtures.complexExpr1);
		assertEquals(complexExpr1String, res);
	}
	
	@Test
	public void testPrintComplexExpr2() {
		String res = PrettyPrinter.getInstance().print(Fixtures.complexExpr2);
		assertEquals(complexExpr2String, res);
	}

}
