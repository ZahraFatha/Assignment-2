
/**
 * @author Aanisha Newaz
 * @author Zahra Fatha
 * @version 1.0
 */

package expressionTree;

public class ValueNode implements TreeNode {

    //instance variable to store value to return as a node
    double value;

    /**
     * Class constructor for ValueNode
     * Will be used to store the value passed from the main driver. This value will be used as a value node
     *
     * @param value         Value for operation
     */

    public ValueNode(float value){

        this.value = value;
    }

    /**
     * toString function that will print the value in its position based on the operation and depth
     *
     * @param depth         Depth of the leaf
     */
    public void print(int depth) {

        //Based on the depth of the tree/current root, print tabs
        for(int i =0; i < depth; i++){

            System.out.print("\t");
        }

        //print value after setting up the depth
        System.out.println(value);

    }

    /**
     * Method used to evaluate the expression. The method will only evaluate the value as a number in this class
     *
     * @return              Value that was sent from the main driver
     */
    public double evaluate() {
        return value;
    }

}
