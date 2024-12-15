public class DLL {
  public static void main(String[] args) {
  
  }

  private Node head;


  // tail.next == null && head.prev == null ;
  private class Node {
    int val;
    Node next;
    Node prev;

    public Node(int val){
      this.val = val;
      this.prev = null;
      this.next = null;
    }

    public Node(int val , Node  prev , Node next){
      this.val = val;
      this.prev = prev;
      this.next = next;
    }
  }




  public void delete(int val){
    if(head == null) System.out.println("DLL is Empty");

    Node temp = head;
    while(temp != null && temp.val != val){
      temp = temp.next; 
    }

    if(temp == null) System.out.println("Not found !! ");
    if(temp == head){
      head = temp.next;
      if(head != null){
        head.prev = null;
      }else{
        tail = null;
      }
    }else if( temp == tail){
      tail = temp.prev;
      if(tail != null){
        tail.next = null;
      }
    }else{

      temp.prev.next = temp.next;
      temp.next.prev = temp.prev;
    }
    System.out.println("Node Deleted !! ");
  }

  public void insert(Node afterMe , int val){
    if(head == null) System.out.println("DLL is Empty");
    Node temp = head;
    while(temp != null && temp != afterMe){
      temp = temp.next;
    }

    if(temp == null) System.out.println("Element Not found in DLL");
    Node newNode = new Node(val);
    newNode.next  = temp.next;
    newNode.prev = temp;
    if(temp.next != null){
      temp.next.prev = newNode;
    }else{
      tail = newNode;
    }
    temp.next = newNode;
  }


  public void insertFirst(int val){
    Node n  = new Node(val);
    if(head == null){
      head = n; 
      tail = n; 
    }else{
      n.next = head;
      head.prev = n;
      head = n;
    }

  public void insertLast(int val){
      Node n = new Node(val);
      if(tail == null ){
        head = n; 
        tail = n; 
      }else{
        tail.next = n;
        n.prev = tail;
        n.next = null;
        tail = n;
      }
  }


  public void display(){
    Node temp = head;

    while(temp != null){
        System.out.println(node.val + "->");
        temp   = temp.next;
      }
      System.out.println("END");
  }

  public void revDisplay(){
    Node temp = tail;
    while(temp != null){
        System.out.println("<-" + node.val);
        temp  = temp.prev; 
      }
      System.out.println("END");
  }
}
