package edu.luc.cs.spring2015.comp473.project4.visitorpattern.expression;

import edu.luc.cs.spring2015.comp473.project4.visitorpattern.visitor.Visitor;

public class UMinus implements Expr {

	private Expr expr;
	
	public UMinus(Expr expr) { this.expr = expr; }
	
	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}
	
	public Expr getExpr() { return this.expr; }

}
