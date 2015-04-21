package edu.luc.cs.spring2015.comp473.project4.visitorpattern.expression;

import edu.luc.cs.spring2015.comp473.project4.visitorpattern.visitor.Visitor;

/**
 * A Expr implementation representing a constant value
 *  
 * @author bruno
 *
 */
public class Const implements Expr {

	private Double value;
	
	public Const(Double value) { this.value = value; }
	
	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}
	
	public Double getValue() { return this.value; }

}
