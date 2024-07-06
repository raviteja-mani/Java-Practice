package Interface;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Node implements Iterable<Node>,Iterator<Node> {
    private int data;
    private Node next;

    public Node(int data, Node next){
        this.data = data;
        this.next = next;
    }


    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Node next() {
        return null;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }

    @Override
    public void forEachRemaining(Consumer<? super Node> action) {
        Iterator.super.forEachRemaining(action);
    }

    @Override
    public Iterator<Node> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Node> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<Node> spliterator() {
        return Iterable.super.spliterator();
    }
}
