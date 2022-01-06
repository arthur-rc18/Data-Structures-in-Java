package arthur.data_structures;

public class Queue<T> {
    private Node<T> refEntry;

    public Queue(){
        this.refEntry = null;
    }

    public boolean isEmpty(){
        return this.refEntry == null? true : false;
    }

    public void enqueue(T obj){
        Node newNode = new Node(obj);
        newNode.setRefNode(refEntry);
        refEntry = newNode;
    }

    public T first(){
        if(!this.isEmpty()){
            Node firstNode = refEntry;
            while (true){
                if(firstNode.getRefNode() != null){
                    firstNode = firstNode.getRefNode();
                }else{
                    break;
                }
            }
            return (T) firstNode.getObject();
        }
        return null;
    }

    public T dequeue(){
        if(!this.isEmpty()){
            Node firstNode = refEntry;
            Node nodeAuxiliar = refEntry;
            while (true){
                if(firstNode.getRefNode() != null){
                    nodeAuxiliar = firstNode;
                    firstNode = firstNode.getRefNode();
                }else{
                    nodeAuxiliar.setRefNode(null);
                    break;
                }
            }
            return (T) firstNode.getObject();
        }
        return null;
    }

    @Override
    public String toString() {
        String stringReturn = "";
        Node nodeAuxiliar = refEntry;

        if(refEntry != null){
            while (true){
                stringReturn += "[Node{object= " + nodeAuxiliar.getObject() + "}]---->";
                if(nodeAuxiliar.getRefNode() != null){
                    nodeAuxiliar = nodeAuxiliar.getRefNode();
                }else{
                    stringReturn += "null";
                    break;
                }
            }
        }else{
            stringReturn = "null";
        }

        return stringReturn;
    }
}
