// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент
// из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;

class MyQueue { private LinkedList elements = new LinkedList<>();

public MyQueue() {
}

public MyQueue(LinkedList  elements) {
    this.elements = elements;
}

public void enqueue(T element){
    elements.add(element);
}

public T dequeue(){
    T first = elements.getFirst();
    elements.removeFirst();
    return first;
}

public T first(){
    return elements.getFirst();
}

public LinkedList<T> getElements() {
    return elements;
}

public void setElements(LinkedList<T> elements) {
    this.elements = elements;
}
}

class Printer {
    public static void main(String[] args) {
        MyQueue queue;
        queue = new MyQueue<>();

        if (args.length == 0) {
            queue.enqueue(1);
            queue.enqueue(10);
            queue.enqueue(15);
            queue.enqueue(5);
        } else {
            queue.enqueue(Integer.parseInt(args[0]));
            queue.enqueue(Integer.parseInt(args[1]));
            queue.enqueue(Integer.parseInt(args[2]));
            queue.enqueue(Integer.parseInt(args[3]));
        }

        System.out.println(queue.getElements());

        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.getElements());

        System.out.println(queue.first());
    }
}

