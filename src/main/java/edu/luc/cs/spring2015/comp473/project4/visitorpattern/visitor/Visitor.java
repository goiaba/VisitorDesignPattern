package edu.luc.cs.spring2015.comp473.project4.visitorpattern.visitor;

import edu.luc.cs.spring2015.comp473.project4.visitorpattern.expression.*;

/**
 * 
 * @author bruno
 *
 * @param <T> the return type of the visit methods
 * 
 * <code>Visitor</code> interface defines a visit method for each
 *  concrete class in the <code>Expr</code> structure. Each of these
 *  visit methods accepts a single argument that is a reference to
 *  a specific class in the Expr hierarchy.
 *  
 * Operations will be performed in the Expr subclasses by specific
 *  implementations of this interface. It is really simple to add
 *  new operations: we just need to create a new implementation of
 *  <code>Visitor</code> that performs what is needed. As an example,
 *  we can consider the <code>PrettyPrinter</code> that was add
 *  after <code>Evaluator</code> and no classes had to be modified.
 *  
 * On the other hand, if the hierarchy of <code>Expr</code> is not
 *  stable, add new subclasses to it will cause a lot of trouble
 *  to maintain the code, since the <code>Visitor</code> interface
 *  and all its implementations will have to be modified.
 */
public interface Visitor<T> {

	T visit(Const constant);

	T visit(UMinus uminus);

	T visit(Plus plus);

	T visit(Minus minus);

	T visit(Times times);

	T visit(Div div);

	T visit(Mod mod);

}
