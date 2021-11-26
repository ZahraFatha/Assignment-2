package expressionTree;

public class OpNode implements TreeNode{

    String operation;
    TreeNode left;
    TreeNode right;

    public OpNode(ValueNode left, String operation, ValueNode right){
        this.left = left;
        this.operation = operation;
        this.right = right;
    }

    public OpNode(ValueNode left, String operation, OpNode right){
        this.left = left;
        this.operation = operation;
        this.right = right;
    }

    public OpNode(OpNode left, String operation, ValueNode right){
        this.left = left;
        this.operation = operation;
        this.right = right;
    }

    public OpNode(OpNode left, String operation, OpNode right){
        this.left = left;
        this.operation =operation;
        this.right = right;
    }
    @Override
    public void print(int depth) {
        if (this.right != null) {
            System.out.println(this.right.evaluate());
        }
        for(int i = 0; i < depth; i++ ){
            System.out.print("\t");
        }
        for(int i =0;i<depth-1; i++ ){
            System.out.print(" ");
        }

        System.out.println(operation);

        if (this.left !=  null) {
            System.out.println(this.left.evaluate());
        }

        for(int i =0; i<depth;i ++){
            System.out.print(" ");
        }
            for(int i =0; i<depth; i++){
                System.out.print(" ");
            }
            System.out.println(right.evaluate());

            for(int i =0; i<depth-1; i++){
                System.out.print(" ");
            }
            System.out.println(operation);

            for(int i =0; i<depth; i++){
                System.out.print(" ");
            }
            System.out.println(left.evaluate());

        }

    @Override
    public double evaluate() {
        double result = 0;

        if(operation == "+"){
            result = right.evaluate() + left.evaluate();
        }else if(operation =="-"){
            result = right.evaluate() - left.evaluate();
        }else if(operation =="*"){
            result = right.evaluate() * left.evaluate();
        }else if(operation =="/"){
            if (right != null && left != null) {
                result = left.evaluate() / right.evaluate();
            }
        }
        return result;
    }

}