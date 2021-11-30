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


}
