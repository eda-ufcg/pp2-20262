import java.util.NoSuchElementException;

public class LinkedList {

    private Node head;
    private Node tail;
    private int size;
    
    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
   
    public boolean isEmpty() {
        return this.head == null;
    }

    // retorna a posição da primeira ocorrência do valor passado como parâmetro.
    public int indexOf(int value) {
        Node aux = this.head;
        int index = 0;
        while (aux != null) { 
            if(aux.value == value)
                return index;
            aux = aux.next;
            index += 1;
        }
        
        return -1;
    }

    public void addFirst(int valor) {
        Node newNode = new Node(valor);
        
        if (isEmpty()) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.next = this.head;
            this.head.prev = newNode;
            this.head = newNode;
        }
        
        size += 1;
    }

    public void addLast(int valor) {
        Node newNode = new Node(valor);
        
        if(isEmpty()) {
            this.head = newNode;
            this.tail = head;
        } else {
            this.tail.next = newNode;
            newNode.prev = tail;
            this.tail = newNode;
        }
        this.size += 1;
    }

    public int getFirst() {
        if (isEmpty()) throw new NoSuchElementException();
        return this.head.value;
    }

    public int getLast() {
        if (isEmpty()) throw new NoSuchElementException();
        return this.tail.value;
    }

    // deve lançar exceção caso a fila esteja vazia.
    public int removeFirst() {
        if (isEmpty()) throw new NoSuchElementException();
        
        int v = this.head.value;
        
        if (this.head.next == null) {
            this.head = null;
            this.tail = null;
        } else {
            this.head = this.head.next;
            this.head.prev = null;
        }
        
        size -= 1;
        return v;
    }

    // deve lançar exceção caso a fila esteja vazia.
    public int removeLast() {
        if (isEmpty()) throw new NoSuchElementException();
        
        int v = this.tail.value;
        
        if (this.head.next == null) {
            this.head = null;
            this.tail = null;
        } else {
            this.tail = this.tail.prev;
            this.tail.next = null;
        }           
        
        size -= 1;
        return v;
    }


    // remove o valor no índice passado como parâmetro. retorna o valor removido.
    // lançar exceção IndexOutOfBoundsException se o índice não for válido.
    public int remove(int index) {
        return -1;
    }

    public int size() {
        return this.size;
    }
}

class Node {

    int value;
    Node prev;
    Node next;

    Node(int v) {
        this.value = v;
    }

}
