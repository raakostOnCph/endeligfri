public class Liste
{

    Node head = null;
    Node tail = null;


    boolean isEmpty()
    {

        return head == null && tail == null;
    }


    public Node insetFromHead(Node node)
    {

        // liste er tom;
        if (isEmpty()) {

            head = node;
            tail = node;
            return head;


        }
        // listen er ikke tom;
        node.next = head;
        head.previous = node;
        head = head.previous;
        return head;
    }


    String printFromhead()
    {

        Node n = head;

        StringBuilder stringBuilder = new StringBuilder();

        while (n != null) {

            stringBuilder.append(n.data + " ");

            n = n.next;
        }
        return stringBuilder.toString().trim();
    }
}
