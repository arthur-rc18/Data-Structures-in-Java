package arthur.data_structures;

public class Stack {
    private Node refNodeEntryStack;

    public Stack(){
        this.refNodeEntryStack = null;
    }

    public void push(Node newNode){
        Node refAuxiliar = refNodeEntryStack;
        refNodeEntryStack = newNode;
        refNodeEntryStack.setNextNode(refAuxiliar);
    }

    public Node pop(){
        if(!isEmpty()){
            Node noPoped = refNodeEntryStack;
            refNodeEntryStack = refNodeEntryStack.getNextNode();
            return noPoped;
        }
        return null;
    }

    public Node top(){
        return refNodeEntryStack;
    }

    public boolean isEmpty(){

        return refNodeEntryStack == null ? true : false;
    }

    @Override
    public String toString(){
        String stringRetorno = "-------------\n";
        stringRetorno += "     Pilha\n";
        stringRetorno += "-------------\n";

        Node nodeAuxiliar = refNodeEntryStack;

        while(true){
            if(nodeAuxiliar != null){
                stringRetorno += "[Node{data= " + nodeAuxiliar.getData() + "}]\n";
                nodeAuxiliar = nodeAuxiliar.getNextNode();
            } else{
                break;
            }
        }
        stringRetorno += "=============\n";
        return stringRetorno;
    }

}