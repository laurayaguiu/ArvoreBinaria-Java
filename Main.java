public class Main {
    public static void main(String [] args) throws Exception {
        //(a*b)+((x-y)/(c+e))
        //exibir em ordem, pos ordem e pre ordem
        BinaryTree formula = new BinaryTree();
        Node n1 = new Node('+');

        formula.addRoot(n1);
        Node n2 = new Node('*');
        formula.addLeft(n2, n1);
        Node n4 = new Node('a');
        formula.addLeft(n4, n2);
        Node n5 = new Node('b');
        formula.addRight(n5, n2);



        Node n3 = new Node('/');
        formula.addRight(n3, n1);
        Node n6 = new Node('-');
        formula.addLeft(n6, n3);
        Node n8 = new Node('x');
        formula.addLeft(n8, n6);
        Node n9 = new Node('y');
        formula.addRight(n9, n6);


        Node n7 = new Node('+');
        formula.addRight(n7, n3);
        Node n10 = new Node('c');
        formula.addLeft(n10, n7);
        Node n11 = new Node('e');
        formula.addRight(n11, n7);

        System.out.println("EM Ordem:");
        formula.visitEmOrdem(n1);
        System.out.println("");
        
        System.out.println("Pos Ordem:");
        formula.visitPosOrdem(n1);
        System.out.println("");
       
        System.out.println("Pre Ordem:");
        formula.visitPreOrdem(n1);
        System.out.println("");
        

    } 
}