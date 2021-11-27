
/**
 * @author Aanisha Newaz
 * @author Zahra Fatha
 * @version 1.0
 */

package expressionTree;

public class OpNode implements TreeNode{

    //store value or operation node on the left side of current operation
    TreeNode left;
    //store operator
    String operation;
    //store value or operation node on the right side of current operation
    TreeNode right;

    /**
     * Constructor for storing operation values.
     * This constructor will be used for operation case 1, where we receive 2 values and an operator to evaluate.
     *
     * @param left          Left ValueNode for value passed from main driver
     * @param operation     String passed from driver to operate on values
     * @param right         Right ValueNode for value passed from main driver
     */
    public OpNode(ValueNode left, String operation, ValueNode right){
        this.left = left;
        this.operation = operation;
        this.right = right;
    }

    /**
     * Constructor for storing operation values.
     * This constructor will be used for operation case 2, where we receive 1 value, one operation and an operator to evaluate.
     *
     * @param left          Left ValueNode for value passed from main driver
     * @param operation     String passed from driver to operate on values
     * @param right         Right OpNode for previously evaluated operation passed from main driver
     */
    public OpNode(ValueNode left, String operation, OpNode right){
        this.left = left;
        this.operation = operation;
        this.right = right;
    }

    /**
     * Constructor for storing operation values.
     * This constructor will be used for operation case 3, where we receive 1 value, one operation and an operator to
     * evaluate (right and left are switched).
     *
     * @param left          Left OpNode for previously evaluated operation passed from main driver
     * @param operation     String passed from driver to operate on values
     * @param right         Right ValueNode for value passed from main driver
     */
    public OpNode(OpNode left, String operation, ValueNode right){
        this.left = left;
        this.operation = operation;
        this.right = right;
    }

    /**
     * Constructor for storing operation values.
     * This constructor will be used for operation case 4, where we receive 2 previously evaluated operations
     * and an operator to evaluate.
     *
     * @param left          Left OpNode for previously evaluated operation passed from main driver
     * @param operation     String passed from driver to operate on values
     * @param right         Right OpNode for previously evaluated operation passed from main driver
     */
    public OpNode(OpNode left, String operation, OpNode right){
        this.left = left;
        this.operation =operation;
        this.right = right;
    }

    /**
     * Method used to evaluate the operation.
     * The result variable will be initialized to 0 by default and will be returned after an operation is done
     *
     * @return          Result from operation
     */
    public double evaluate() {
        double result = 0;

        //Add both values/operations if the string for operation is "+"
        if(operation == "+"){
            result = right.evaluate() + left.evaluate();
        }

        //Find the difference between both values/operations if the string for operation sent is "-"
        else if(operation =="-"){
            result = right.evaluate() - left.evaluate();
        }

        //Find the product of both values/operations if the string for operation sent is "*"
        else if(operation =="*") {
            result = right.evaluate() * left.evaluate();
        }
        //Find the quotient of both values/operations if the string for operation sent is "/"
        else if(operation =="/"){
            result = left.evaluate() / right.evaluate();
        }

        //return result after operation
        return result;
    }

    /**
     * Method for printing AVL tree based on depth of each root/leaf
     *
     * @param depth     Depth of tree that will be used to print roots and leaves of the evaluation tree
     */
    public void print(int depth) {

        //Add depth if the right node is not null
        if(this.right != null){
            this.right.print(depth + 1);
        }

        //Add tabs to illustrate tree depth
        for (int i = 0; i < depth; i++){
            System.out.print("\t");
        }

        //Print operation (could be value or operator)
        System.out.println("" + operation);

        //Add depth for left node
        if(this.left != null){
            this.left.print(depth + 1);
        }
    }

}
