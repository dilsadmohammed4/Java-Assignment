package listpack;

public class LinkedList {

    public static  Node insert(int data)
    {
        if(head==null)
            return new Node(data);
        else
        {
            Node nxt = head;
            while(nxt!=null)
                nxt = nxt.next;
            nxt = new Node(data);
            return head;
        }
    }
    public static void display(Node head)
    {
        Node start = head;
        while(start != null)
        {
            System.out.print(start.data + " ");
            start = start.next;
        }


    }
}