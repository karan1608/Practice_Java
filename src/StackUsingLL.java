public class StackUsingLL {

    class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = next;
        }
    }

    Node top = null;

    public void push(int data)
    {
        Node newnode1 = new Node(data);
        if(top==null)
        {
            top = newnode1;
        }else{
            newnode1.next = top;
            top = newnode1;
        }
    }
    public void pop()
    {
        //System.out.println(top.data);
        top = top.next;
    }

    public int peek()
    {
        return top.data;
    }

    public void display()
    {
        while(top!=null)
        {
            System.out.print(top.data+"->");
            top = top.next;
        }
        System.out.print("Null");
    }

    public static void main(String[] args) {
        StackUsingLL SL = new StackUsingLL();
        SL.push(15);
        SL.push(20);
        SL.push(65);
        //SL.display();
        //SL.pop();
        System.out.println(SL.peek());
        SL.display();
    }

}
