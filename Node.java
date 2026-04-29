public class Node{
    char elemento;
    Node pai;
    Node esq;
    Node dir;

    Node(char elemento){
        this.elemento = elemento;
        pai = esq = dir = null;

    }
    public void mostrarNo(){
        System.out.print(elemento + " ");
    }
}