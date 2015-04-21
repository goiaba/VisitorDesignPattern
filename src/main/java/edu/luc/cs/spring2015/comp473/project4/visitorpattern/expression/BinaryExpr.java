package edu.luc.cs.spring2015.comp473.project4.visitorpattern.expression;


public abstract class BinaryExpr implements Expr {
	
	private Expr leftHand;
	private Expr rightHand;
	
	public BinaryExpr(Expr left, Expr right) {
		this.leftHand = left;
		this.rightHand = right;
	}
	
	public Expr getLeftHand() { return leftHand; }
	
	public Expr getRightHand() { return rightHand; }

}
