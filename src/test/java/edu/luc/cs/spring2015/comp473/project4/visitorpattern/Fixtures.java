package edu.luc.cs.spring2015.comp473.project4.visitorpattern;

import edu.luc.cs.spring2015.comp473.project4.visitorpattern.expression.Const;
import edu.luc.cs.spring2015.comp473.project4.visitorpattern.expression.Div;
import edu.luc.cs.spring2015.comp473.project4.visitorpattern.expression.Expr;
import edu.luc.cs.spring2015.comp473.project4.visitorpattern.expression.Minus;
import edu.luc.cs.spring2015.comp473.project4.visitorpattern.expression.Mod;
import edu.luc.cs.spring2015.comp473.project4.visitorpattern.expression.Plus;
import edu.luc.cs.spring2015.comp473.project4.visitorpattern.expression.Times;
import edu.luc.cs.spring2015.comp473.project4.visitorpattern.expression.UMinus;

public class Fixtures {
	
	public static final Expr constExpr1 = new Const(20d);
	public static final String constExpr1Print = "20.0";
	
	public static final Expr constExpr2 = new Const(2d);
	
	public static final Expr constExpr3 = new Const(3d);
	
	public static final Expr constExpr4 = new Const(4d);
	
	public static final Expr uMinusExpr = new UMinus(constExpr4);
	public static final String uMinusExprPrint = "-4.0";
	
	public static final Expr divExpr = new Div(constExpr1, constExpr2);
	public static final String divExprPrint = "(20.0 / 2.0)"; 
	
	public static final Expr timesExpr1 = new Times(constExpr3, uMinusExpr);
	public static final String timesExpr1Print = "(3.0 * -4.0)";
	
	public static final Expr timesExpr2 = new Times(constExpr3, constExpr4);
	
	public static final Expr complexExpr1 = new Plus(divExpr, timesExpr1);
	public static final String complexExpr1String = "((20.0 / 2.0) + (3.0 * -4.0))"; 
	
	public static final Expr modExpr = new Mod(constExpr1, constExpr2);
	
	public static final Expr complexExpr2 = new Minus(modExpr, timesExpr2);
	public static final String complexExpr2String = "((20.0 % 2.0) - (3.0 * 4.0))";

}
