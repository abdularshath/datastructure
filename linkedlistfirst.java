class Node {
    int data;
    Node next;
}

class LinkedList {
    Node head;


    public void insertAtBeginning(int data) {
        Node nn = new Node();
        nn.data = data;
        nn.next = head;
        head = nn; 
    }
    public void insertAtposition(int data,int pos){
        Node nn=new Node();
        Node t=head;
        nn.data=data;
        for(int i=1;i<pos-2;i++){
            t=t.next;
        }
        t=t.next;
        nn.next=t.next;
        t.next=nn;
    }
    
    public void insertAtend(int data){
        Node nn=new Node();
        Node t=head;
        nn.data=data;
        while(t.next!=null){
            t=t.next;
        }
        t.next=nn;
        nn.next=null;
    }
    public void deleteAtposition(int pos){
        Node t=head;
        for(int i=1;i<pos-1;i++){
            t=t.next;
        }
        t.next=t.next.next;
    }
    
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.print("Null");
        System.out.println("");
    }
    
    public void delete(int data){
        Node t=head;
       
    
        while(t.next!=null){
            if(head.data==data){
                head=head.next;
        }
        else{
            if(t.next.data==data){
            t.next=t.next.next;
            }
        }
        t=t.next;
    
    }
    
 }
}

public class Main {
    public static void main(String[] args) {
        LinkedList ls = new LinkedList();


        ls.insertAtBeginning(30);
        ls.display();
        ls.insertAtend(54);
        ls.display();
        ls.insertAtend(56);
        ls.display();
        ls.insertAtend(57);
        ls.display();
        ls.insertAtBeginning(20);
        ls.display();
        ls.insertAtBeginning(20);
        ls.display();
        ls.deleteAtposition(3);
        ls.display();
        ls.insertAtposition(20,2);
        ls.display();
        ls.delete(20);


        ls.display();
    }
}
