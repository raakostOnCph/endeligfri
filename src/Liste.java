public class Liste
{

    Node head = null;
    Node tail = null;


    boolean isEmpty()
    {

        return head == null && tail == null;
    }

    boolean onlyOne() {

        return  head == tail;
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

    public Node removeFromHead()
    {

        if (isEmpty()) {
            return null;
        }
        if (onlyOne()) {

            Node res = head;

            head = null;
            tail = null;

            return res;
        }

        // der er flere elementer i listen
        Node res = head;

        head = head.next;
        head.previous.next = null;
        head.previous = null;

       return res;
    }
}
