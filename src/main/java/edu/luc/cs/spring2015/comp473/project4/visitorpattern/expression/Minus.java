package edu.luc.cs.spring2015.comp473.project4.visitorpattern.expression;

import edu.luc.cs.spring2015.comp473.project4.visitorpattern.visitor.Visitor;

public class Minus extends BinaryExpr {

	public Minus(Expr left, Expr right) { super(left, right); }

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}

}
