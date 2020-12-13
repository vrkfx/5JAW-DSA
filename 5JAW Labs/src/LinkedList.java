
import static javafx.scene.input.KeyCode.T;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vrkfx
 * 
 */
public class LinkedList<T> {
    
    Node<T> head;
    Node<T> tail;
    int count =0;

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public Node<T> getTail() {
        return tail;
    }

    public void setTail(Node<T> tail) {
        this.tail = tail;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    public void addFirst(Node<T> node) {
        //save off the head node so we dont loose it
        Node<T> temp = head;
        //point head node to new Node
        head = node;
        //insert the rest of the list behind the head
        head.next = temp;
        count++;
        
        if(count == 1) {
            tail = head;
        }
    }
    
    public void addLast(Node<T> node) {
        if (count == 0) { //node
            head = node;
        }
        else {
            tail.next = node;
        }
        tail = node;
        count++;
    }
    
    public void removeFirst() {
        if(count != 0) {
            //before: head -> 3 -> 5
            //after Head -> 3 -> null
            
            head = head.next;
            count--;
            if(count == 0) {
                tail = null;
            }
        }
        
    }
    
    public boolean contains(T item) {
        Node<T> current = head;
        while(current!=null) {
            if(current.value.equals(item)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    
    public void removeLast() {
        if(count != 0){
            if(count ==1) {
                head = null;
                tail = null;
            } else {
                //Before: head -> 3 -> 5 -> 7
                //   tail = 7
                //After: head -> 3 -> 5 -> null
                //   tail = 5
                
                Node<T> current = head;
                while(current.next != tail) {
                    current = current.next;
                }
                current.next = null;
                tail = current;
            }
            count --;
        }
    }
    
    public static void printList(Node node) {
        while(node != null) {
            System.out.println(node.getValue());
            node = node.getNext();
        }
    }
    
    
    
}
