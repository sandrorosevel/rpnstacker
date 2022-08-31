public class Stack {
    private Node top;
    private int size;

    public Stack() {
        size = 0;
    }

    public Stack(double[] dataArray){
        Arrays.stream(dataArray).forEach(data -> push(data));
        size = dataArray.length;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void push(double data){
        if(top == null)
            top = new Node(data);
        else
        {
            Node current = new Node(data,top);
            top = current;
        }
        size++;
    }
 
    public double peekTop() {
        return top.getData();
    }
  
    public double pop() {
        final double data = top.getData();
        top = top.getNext();
        size--;
        return data;
    }
   
    public void print() {
        if(top == null)
            System.out.println("The stack is empty");

        Node current = top;
        System.out.println(current.getData() + " <--");
        current = current.getNext();

        while(current != null)
        {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }
}