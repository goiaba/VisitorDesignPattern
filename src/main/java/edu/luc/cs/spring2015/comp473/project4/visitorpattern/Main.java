package edu.luc.cs.spring2015.comp473.project4.visitorpattern;

import edu.luc.cs.spring2015.comp473.project4.visitorpattern.expression.Const;
import edu.luc.cs.spring2015.comp473.project4.visitorpattern.expression.Div;
import edu.luc.cs.spring2015.comp473.project4.visitorpattern.expression.Expr;
import edu.luc.cs.spring2015.comp473.project4.visitorpattern.expression.Plus;
import edu.luc.cs.spring2015.comp473.project4.visitorpattern.expression.Times;
import edu.luc.cs.spring2015.comp473.project4.visitorpattern.expression.UMinus;
import edu.luc.cs.spring2015.comp473.project4.visitorpattern.visitor.Evaluator;
import edu.luc.cs.spring2015.comp473.project4.visitorpattern.visitor.PrettyPrinter;


public class Main {

	public static void main(String[] args) {
		
		Expr e = 
				new Plus(
					new Div(
						new Const(20d), 
						new Const(2d)
					), 
					new Times(
						new Const(3d), 
						new UMinus(
							new Const(4d)
						)
					)
				);
		
		Expr e2 = 
				new Plus(
					new Div(
						new Const(30d), 
						new Const(2d)
					), 
					new Times(
						new Const(30d), 
						new Const(45d)
					)
				);
		
		System.out.print("Expression: ");
		PrettyPrinter.getInstance().printToStdOut(e);
		System.out.print("\nEvaluates to: " + Evaluator.getInstance().evaluate(e));
		
		System.out.print("\n\nExpression: " + PrettyPrinter.getInstance().print(e2));
		System.out.print("\nEvaluates to: " + Evaluator.getInstance().evaluate(e2));
	
	}
	
}
