public class LinkedL {

  private Node head;
  private Node tail;
  private int size;

  public static void main(String[] args) {
    LinkedL l = new LinkedL();
    l.insertFirst(5);
    l.insertFirst(2);
    l.insertFirst(1);
    l.insertLast(99);
    l.insert(777 , 3);
    l.deleteLast();
    System.out.println(l.deleteFirst());
    l.display();
  }

  public LinkedL() {
    this.size = 0;
  }

  private class Node {
    private int val;
    private Node next;

    public Node(int val) {
      this.val = val;
      this.next = null;
    }

    public Node(int val , Node next){
      this.val = val;
      this.next = next;
    }
  }

  public void insertFirst(int val) {
    Node newNode = new Node(val);
    newNode.next = head;
    head = newNode;
    if (tail == null) {
      tail = head;
    }
    size++;
  }

  public void insert(int val , int index) {
    if(index == 0) {
      insertFirst(val);
      return;
    }
    if(index == size) {
      insertLast(val);
      return;
    }

    Node temp = head;
    for(int i = 0 ; i < index - 1 ; i++) {
      temp = temp.next;
    }

    Node newNode = new Node(val , temp.next);
    temp.next =  newNode;
    size++;
  }

  public int delete(int index) {
    if(index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("Index out of range");
    }
    if(index == 0) return deleteFirst();
    if(index == size - 1) return deleteLast();
    
    Node prev = get(index - 1); 
    int val  = prev.next.val;
    prev.next = prev.next.next;
    size--;
    return val;
  }

  public void insertLast(int val) {
    if(tail == null) {
      insertFirst(val);
      return;
    }
    Node node = new Node(val);
    tail.next = node;
    tail = node;
    size++;
  }

  public Node find(int val){
    Node node = head;
    while (node != null) {
      if(node.val == val){
        return node;
      }
      node = node.next;
    }
    return null;
  }

  public Node get(int index){
    Node n = head;
    for(int i = 0 ; i < index ; i++) {
      n = n.next;
    }
    return n;
  }

  public int deleteFirst() {
    if (head == null) return -1;
    int val = head.val;
    head = head.next;
    if(head == null) tail = null;
    size--;
    return val;
  }

  public int deleteLast() {
    if(size <= 1) return deleteFirst();
    Node prev = get(size - 2);
    int val = prev.next.val;
    prev.next = null;
    tail = prev;
    size--;
    return val;
  }

  public void display() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.val + " -> ");
      temp = temp.next;
    }
    System.out.println("END");
  }
}

