package edu.luc.cs.spring2015.comp473.project4.visitorpattern.expression;

import edu.luc.cs.spring2015.comp473.project4.visitorpattern.visitor.Visitor;

public interface Expr {

	<T> T accept(Visitor<T> visitor);

}
