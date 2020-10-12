package DataFrame;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * �������ݽṹ
 * @author Kylin
 *
 * @param <Item>
 */
public class Bag<Item> implements Iterable<Item> {
    private Node<Item> first;    // beginning of bag
    private int n;               // number of elements in bag

    // helper linked list class
    private static class Node<Item> {
        private Item item;
        private Node<Item> next;
    }

    /**
     * ��ʼ������Ϊ��
     */
    public Bag() {
        first = null;
        n = 0;
    }

    /**
     * �鿴�����Ƿ�Ϊ��
     */
    public boolean isEmpty() {
        return first == null;
    }

    /**
     * ���ر���Ԫ�ظ���
     */
    public int size() {
        return n;
    }

    /**
     * ���Ԫ��item�����������
     */
    public void add(Item item) {
        Node<Item> oldfirst = first;
        first = new Node<Item>();
        first.item = item;
        first.next = oldfirst;
        n++;
    }


    /**
     * Returns an iterator that iterates over the items in this bag in arbitrary order.
     *
     * @return an iterator that iterates over the items in this bag in arbitrary order
     */
    public Iterator<Item> iterator()  {
        return new LinkedIterator(first);  
    }

    // an iterator, doesn't implement remove() since it's optional
    private class LinkedIterator implements Iterator<Item> {
        private Node<Item> current;

        public LinkedIterator(Node<Item> first) {
            current = first;
        }

        public boolean hasNext()  { return current != null;                     }
        public void remove()      { throw new UnsupportedOperationException();  }

        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.next; 
            return item;
        }
    }

    /**
     * Unit tests the {@code Bag} data type.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        Bag<String> bag = new Bag<String>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < args.length; i++) {
        	String s = sc.next();
        	bag.add(s);
		}
        
        System.out.println("size of bag = " + bag.size());
   
        for (String s : bag) {
            System.out.println(s);
        }
    }

}