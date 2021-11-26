package expressionTree;

public class ValueNode implements TreeNode {
    double value;

    public ValueNode(float value){
        this.value = value;
    }

    public void print(int depth) {
        for(int i =0; i<depth; i++){
            System.out.print(" ");
        }
        System.out.println(value);

    }

    @Override
    public double evaluate() {
        return value;
    }

}