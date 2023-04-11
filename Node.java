
package conferencefinallab;

public class Node {
  private Conference data;
  private Node Next;
  
  public Node(Conference con) { 
      data = con;
      Next = null;
  }

    public Conference getData() {
        return data;
    }

    public void setData(Conference data) {
        this.data = data;
    }

    public Node getNext() {
        return Next;
    }

    public void setNext(Node Next) {
        this.Next = Next;
    }

    @Override
    public String toString() {
        return data.toString();
    }
  
  
}
