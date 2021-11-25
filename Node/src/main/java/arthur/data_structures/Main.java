package arthur.data_structures;

public class Main {
    public static void main(String[] args) {
        Node n1 = new Node("n1 content");
        Node n2 = new Node("n2 content");

        n1.setNextNode(n2);

        Node n3 = new Node("n3 content");
        n2.setNextNode(n3);

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n1.getNextNode());
    }
}
