package expressionTree;

public class ExpressionTree{
    OpNode root;

    public ExpressionTree(OpNode root){
        this.root = root;
    }

    public double evaluate() {
        double value = root.evaluate();
        return value;
    }

    public void print() { // I think it's something like this
        int depth = 0;

        root.print(depth);
    }

}
