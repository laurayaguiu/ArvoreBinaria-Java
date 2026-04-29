public class BinaryTree {
    Node raiz;

    public BinaryTree(){
        raiz = null;
    }

    public boolean isEmpty(){
        if(raiz == null) {
            return true;
        } else {
            return false;
        }
    }

    public void addRoot(Node x)throws Exception{
        if (raiz != null) {
            throw new Exception ("ERRRO! Árvore já tem raiz");
        } 
        raiz = x;
    }

    public Node root(){
        //retorna no raiz da arvore
        return raiz;
    }

    public boolean isInternal(Node x) {
        //verifica se no x é interno
        if(x.esq != null || x.dir != null){
            return true;
        } else {
            return false;
        }
    }

    public boolean isLeaf(Node x){
        //verifica se no x é folha
        if(x.esq == null && x.dir == null) {
            return true;
        } else{
            return false;
        }
    }

    public void addLeft(Node x, Node y) throws Exception {
        //adiciona o x como filho esquerdo de y
        if (y.esq != null) {
            throw new Exception ("ERRO! O nó já tem filho esquerdo");
        }
        x.pai = y;
        y.esq = x;
    }

    public void addRight(Node x, Node y) throws Exception {
         //adiciona o x como filho direito de y
        if (y.dir != null) {
            throw new Exception ("ERRO! O nó já tem filho direito");
        }
        x.pai = y;
        y.dir = x;
    }

    public Node left(Node x){
        //retorna o filho á esqueda de x
        return x.esq;
    }

    public Node right(Node x){
        //retorna o filho á esq de x
        return x.dir;
    }

    public boolean hasLeft(Node x){
        if (x.esq != null){
            return true;
        } else {
            return false;
        }
    }

    public boolean hasRight(Node x){
        if (x.dir != null){
            return true;
        } else {
            return false;
        }
    }

    public void remove (Node x) {
        // remove o no x e todos os seus descendentes
        if (raiz == x) {
            raiz = null;
        } else {
            //a esquerda do meu pai estou eu?
            if (x.pai.esq == x) {
                x.pai.esq = null;
            } else{
                x.pai.dir = null;
            }
        }
    }

    public void visitPosOrdem(Node x) {
        //exibe conteudo da arvore no formato EDR
       if (x == null) {
            return;
        }
        visitPosOrdem(x.esq);
        visitPosOrdem(x.dir);
        x.mostrarNo();

    }

    public void visitPreOrdem(Node x) {
        if (x == null) {
            return;
        }
        visitPreOrdem(x.dir);
        visitPreOrdem(x.esq);
        x.mostrarNo();
        //exibe conteudo da arvore no formato R-E-D 
        
    }

    public void visitEmOrdem(Node x) {
        //exibe conteudo da arvore no formato E-R-D
         if (x == null) {
            return;
        }
        visitPosOrdem(x.esq);
        x.mostrarNo();
        visitPosOrdem(x.dir);
    }
}