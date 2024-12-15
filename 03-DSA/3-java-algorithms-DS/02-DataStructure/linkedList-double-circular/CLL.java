public class CLL {

  private Node head; 
  private Node tail;


  public CLI(){
    this.head = null;
    this.tail = null;
  }


  public static void main(String[] args) {
    
  }


  private class Node {
    int val; 
    Node next;

    public Node(int val){
      this.val = val;
      this.next = null;
    }
  }


  public void insert(int val){
    Node n = new Node(val);
    if(head == null){
      head = n;
      tail = n;
      tail.next = head;
    }
    tail.next = n;
    n.next = head;
    tail = n; 
  }


  public void delete(int val){
    if(head == null) System.out.println("CLL is empty !!! ");
    Node temp = head;
    Node prev = null;
    do {
        if(temp.val == val) break;
        prev = temp; 
        temp = tem.next; 
    }while(temp != head);

    if(temp.val != val) System.out.println("Val not found !!!");
    if(temp == head && temp.next == head) head = null;
    if(temp == head){
      prev = head;
      while(prev.next != head){
        prev = prev.next;
      }
      head = head.next;
      prev.next = head;
    }else{
      prev.next = temp.next;
      if(temp == tail ){
        tail = prevl;
      }
    }
  }
}

