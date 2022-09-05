import static org.junit.jupiter.api.Assertions.*;

class ListeTest
{

    Liste liste = new Liste();



    @org.junit.jupiter.api.Test
    void printFromhead()
    {
        Node node1 = new Node("hej");
        Node node2 = new Node("med");
        Node node3 = new Node("dig");

        node1.next = node2;
        node2.next = node3;

        node3.previous = node2;
        node2.previous = node1;

        assertEquals("hej med dig", liste.printFromhead(node1));





    }
}