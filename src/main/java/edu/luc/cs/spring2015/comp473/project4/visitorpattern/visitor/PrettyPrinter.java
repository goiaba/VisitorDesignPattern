package edu.luc.cs.spring2015.comp473.project4.visitorpattern.visitor;

import edu.luc.cs.spring2015.comp473.project4.visitorpattern.expression.*;

/**
 * 
 * @author bruno
 *
 * A visitor responsible for print expressions
 * 
 * Since we do not have state in this class we implement
 *  it as a singleton.
 *
 */
public class PrettyPrinter implements Visitor<String> {

	private static PrettyPrinter instance;
	
	private PrettyPrinter() {}
	
	public static PrettyPrinter getInstance() {
		if (null == instance)
			instance = new PrettyPrinter();
		return instance;
	}
	
	public void printToStdOut(Expr expr) {
		System.out.print(print(expr));
	}
	
	/**
	 * Method responsible for passing this <code>Visitor</code>
	 *  to the specified <code>Expr</>. After that the expr
	 *  knows which visit method to call (based in its argument
	 *  type).
	 *  
	 * @param expr
	 * @return
	 */
	public String print(Expr expr) {
		return expr.accept(this);
	}
	
	@Override
	public String visit(Const constant) {
		return constant.getValue().toString();
	}

	@Override
	public String visit(UMinus uminus) {
		StringBuilder sB = new StringBuilder("-");
		sB.append(print(uminus.getExpr()));
		return sB.toString();
	}

	@Override
	public String visit(Plus plus) {
		return printBinaryExpr(plus, "+");
	}

	@Override
	public String visit(Minus minus) {
		return printBinaryExpr(minus, "-");
	}

	@Override
	public String visit(Times times) {
		return printBinaryExpr(times, "*");
	}

	@Override
	public String visit(Div div) {
		return printBinaryExpr(div, "/");
	}

	@Override
	public String visit(Mod mod) {
		return printBinaryExpr(mod, "%");
	}
	
	private String printBinaryExpr(BinaryExpr expr, String operator) {
		StringBuilder sB = new StringBuilder();
		sB.append("(");
		sB.append(print(expr.getLeftHand()));
		sB.append(" " + operator + " ");
		sB.append(print(expr.getRightHand()));
		sB.append(")");
		return sB.toString();
	}

}
