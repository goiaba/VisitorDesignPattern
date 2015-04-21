package edu.luc.cs.spring2015.comp473.project4.visitorpattern.visitor;

import edu.luc.cs.spring2015.comp473.project4.visitorpattern.expression.Const;
import edu.luc.cs.spring2015.comp473.project4.visitorpattern.expression.Div;
import edu.luc.cs.spring2015.comp473.project4.visitorpattern.expression.Expr;
import edu.luc.cs.spring2015.comp473.project4.visitorpattern.expression.Minus;
import edu.luc.cs.spring2015.comp473.project4.visitorpattern.expression.Mod;
import edu.luc.cs.spring2015.comp473.project4.visitorpattern.expression.Plus;
import edu.luc.cs.spring2015.comp473.project4.visitorpattern.expression.Times;
import edu.luc.cs.spring2015.comp473.project4.visitorpattern.expression.UMinus;

public class Evaluator implements Visitor<Double> {

	private static Evaluator instance;
	
	private Evaluator() {}
	
	public static Evaluator getInstance() {
		if (null == instance)
			instance = new Evaluator();
		return instance;
	}
	
	public Double evaluate(Expr expr) {
		return expr.accept(this);
	}
	
	@Override
	public Double visit(Const constant) {
		return constant.getValue();
	}

	@Override
	public Double visit(UMinus uminus) {
		return -evaluate(uminus.getExpr());
	}

	@Override
	public Double visit(Plus plus) {
		return evaluate(plus.getLeftHand()) + evaluate(plus.getRightHand());
	}

	@Override
	public Double visit(Minus minus) {
		return evaluate(minus.getLeftHand()) - evaluate(minus.getRightHand());
	}

	@Override
	public Double visit(Times times) {
		return evaluate(times.getLeftHand()) * evaluate(times.getRightHand());
	}

	@Override
	public Double visit(Div div) {
		return evaluate(div.getLeftHand()) / evaluate(div.getRightHand());
	}

	@Override
	public Double visit(Mod mod) {
		return evaluate(mod.getLeftHand()) % evaluate(mod.getRightHand());
	}

}
