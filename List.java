
package conferencefinallab;

public class List {
    private Node head;
    
    public List() { 
        head = null;
    }
    
    public boolean isEmpty() {
        return head == null;
    }
    
    public int Size() { 
        int cnt = 0;
        
        if(isEmpty()) 
            return 0;
        
        Node current = head;
        while(current != null) {
            cnt++;
        current = current.getNext();
       
    }
        
   return cnt;     
}
  
    
    public void insertAtFront(Conference con ) { 
        
        Node newNode = new Node(con) ;
        newNode.setNext(head);
        head = newNode;
    }
    public void insertAtBack(Conference con) { 
        Node newNode = new Node(con) ;
        
        if(isEmpty())
            head = newNode;
        else { 
            Node current = head;
            while(current.getNext()!=null)
                current = current.getNext();
        
        current.setNext(newNode);
       
    }
    }
        
        public Conference removeFromFront() { 
            if(isEmpty())
                return null;
            Conference temp = head.getData();
            head = head.getNext();
            return temp;
            
            
        }
        public Conference removeFromBack() { 
           //first case
            if(isEmpty())
                return null;
            //second case 
            Node current = head;
            if(current.getNext() == null) {
                head = null;
                return current.getData();
                
        }
          
                Node prev = null;
                while(current.getNext() != null){
                prev =current ;
                current = current.getNext();
                }
                prev.setNext(null);
               
                return current.getData();
        }
        
        public Conference[] cheapConferences() { 
          
            if(isEmpty() == true )
                return null;
            
            Conference[] list = new Conference[Size()];
            int j = 0;
            
            Node current = head;
            while(current!= null) {
            if(current.getData().getFee() < 1000)
             list[j++] = current.getData();
                current = current.getNext();
            }
            return list;
        }
        
        
        
        
        
            
}

