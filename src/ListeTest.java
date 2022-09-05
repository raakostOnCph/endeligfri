import org.junit.jupiter.api.Test;

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

        liste.head = node1;
        liste.tail = node3;

        assertEquals("hej med dig", liste.printFromhead());





    }

    @Test
    void isEmpty()
    {
        assertEquals(true, liste.isEmpty());
        liste.insetFromHead(new Node("palle"));
        assertEquals(false, liste.isEmpty());
    }

    @Test
    void insetFromHead()
    {
        liste.insetFromHead(new Node("1"));
        assertEquals("1", liste.printFromhead());
        liste.insetFromHead(new Node("2"));
        liste.insetFromHead(new Node("3"));
        liste.insetFromHead(new Node("4"));

        assertEquals("4 3 2 1", liste.printFromhead());



    }

    @Test
    void hansemand_lückter()
    {
        liste.insetFromHead(new Node("1"));
        liste.insetFromHead(new Node("2"));
        liste.insetFromHead(new Node("3"));
        liste.insetFromHead(new Node("4"));

        liste.removeFromHead();
        assertEquals("3 2 1", liste.printFromhead());
        liste.removeFromHead();
        liste.removeFromHead();
        liste.removeFromHead();
        assertEquals("", liste.printFromhead());



    }
}