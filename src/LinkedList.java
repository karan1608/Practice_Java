import sun.awt.image.ImageWatched;

public class LinkedList {
    class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    public void insert(int data)
    {
        Node newnode = new Node(data);
        if(head == null)
        {
            head = newnode;
        }else{
            newnode.next = head;
            head = newnode;
        }
    }
    public void deleteFirst()
    {
        head = head.next;
    }

    public void deleteLast()
    {
        Node temp = head;
        while(temp.next.next!=null)
        {
            temp = temp.next;
        }
        temp.next = null;
    }

    public void insertLast(int data)
    {
        Node newnode1 = new Node(data);
        Node temp = head;
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        temp.next = newnode1;
    }
    public void display()
    {
        while(head!=null)
        {
            System.out.print(head.data+ "->");
            head = head.next;
        }
        System.out.println("Null");
    }

    public void insertAt(int data,int pos)
    {
        Node newnode2 = new Node(data);
        Node temp = head;
        if(pos==0 && head!=null)
        {
            newnode2.next = head;
            head = newnode2;
        }
        else{
            while(--pos>=1)
            {
                temp = temp.next;
            }
            newnode2.next = temp.next;
            temp.next = newnode2;
        }
    }

    public void middle()
    {
        Node slow = head;
        Node Fast = head;

        while(Fast!=null && Fast.next!=null)
        {
            slow = slow.next;
            Fast = Fast.next.next;
        }
        System.out.println(slow.data);
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insert(12);
        ll.insert(13);
        ll.insert(14);
        ll.insertLast(15);
        ll.insertAt(16,0);
        ll.middle();
        //ll.deleteFirst();
        ll.display();
    }
}
