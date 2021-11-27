
/**
 * @author Aanisha Newaz
 * @author Zahra Fatha
 * @version 1.0
 */

package expressionTree;

public interface TreeNode {

    /**
     * Abstract method that will be used by ValueNode and OpNode to evaluate the expression
     *
     * @return          Result after evaluation of operation
     */
    public abstract double evaluate();

    /**
     * Abstract method that will be used by ValueNode and OpNode to print the AVL tree based on the depth provided
     *
     * @param depth     Depth of tree that will be used to print roots and leaves of the evaluation tree
     */
    public abstract void print(int depth);
}
