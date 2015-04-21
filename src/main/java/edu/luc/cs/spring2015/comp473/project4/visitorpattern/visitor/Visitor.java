package edu.luc.cs.spring2015.comp473.project4.visitorpattern.visitor;

import edu.luc.cs.spring2015.comp473.project4.visitorpattern.expression.*;

public interface Visitor<T> {

	T visit(Const constant);

	T visit(UMinus uminus);

	T visit(Plus plus);

	T visit(Minus minus);

	T visit(Times times);

	T visit(Div div);

	T visit(Mod mod);

}
