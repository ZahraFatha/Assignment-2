
/**
 * @author Aanisha Newaz
 * @author Zahra Fatha
 * @version 1.0
 */

package expressionTree;

public class ExpressionTree{
    
    //Stores expression and turns into a node
    OpNode root; 

    /**
     * Class constructor that takes in an expression node (root) to evaluate and print
     * 
     * @param root          Expression node of full operation sent from main driver class
     */
    
    public ExpressionTree(OpNode root){
        this.root = root;
    }

    /**
     * Method used to evaluate the operation/expression
     * The method calls the evaluate method from OpNode to run the evaluation for the operation
     * and stores it into a value (double) to return it.
     * 
     * @return              Value after evaluation of operation
     */
    
    public double evaluate() {
        double value = root.evaluate();
        return value;
    }
    
    /**
     * Method for printing AVL tree by calling OpNode evaluation method to print values and operations.
     * The method has a default depth (0) which is passed to OpNode's print method to print the expression tree.
     */
    public void print() { 
        int depth = 0;

        root.print(depth);
    }

}
