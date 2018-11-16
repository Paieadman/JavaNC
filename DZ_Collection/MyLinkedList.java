import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Consumer;


public class MyLinkedList<E> {
    private Node data;

    public MyLinkedList(E element){
        this.data = new Node(element);
    }

    public MyLinkedList(){
        this.data = new Node();
    }


    public void add(E element){
        MyIterator it = new MyIterator(this.data);
        if(data.getElement()!= null) {
            while (it.hasNext()) {
                it.setDataIterible(it.next());
            }
            it.getDataIterible().setNextNode(new Node(element));
        } else {
            this.data.setElement(element);
        }

    }

    public void add(int index, E element){
        MyIterator it = new MyIterator(this.data);
        if(index != 0) {
            while (it.hasNext() && index > 1) {
                it.setDataIterible(it.next());
                index--;
            }
            Node tmp = it.getDataIterible().getNextNode();
            it.getDataIterible().setNextNode(new Node(element, tmp));
        } else {
            if(index == 0){
                Node tmp = it.getDataIterible().getNextNode();
                it.getDataIterible().setNextNode(new Node(it.getDataIterible().getElement(), tmp));
                it.getDataIterible().setElement(element);
            }
        }
    }

    public E get(int index){
        MyIterator it = new MyIterator(this.data);
        while(it.hasNext() && index!=0){
            it.setDataIterible(it.next());
            index--;
        }


        if(!it.hasNext()){
            System.out.println("next element doesn't exist");
            return null;
        } else {
            return (E)it.getDataIterible().getElement();
        }
    }

    public  int indexOf(E element){
        MyIterator it = new MyIterator(this.data);
        int i = 0;
        while (it.hasNext() && it.getDataIterible().getElement()!= element){
            it.setDataIterible(it.next());
            i++;
        }


        if(!it.hasNext() && element!=null){
            System.out.println("next element doesn't exist");
            return -1;
        } else {
            return i;
        }
    }

    public E set(int index, E element){
        MyIterator it = new MyIterator(this.data);
        while(it.hasNext() && index!=0){
            it.setDataIterible(it.next());
            index--;
        }

        E tmp = (E) it.getDataIterible().getElement();
        it.getDataIterible().setElement(element);
        return tmp;
    }

    public int size(){
        MyIterator it = new MyIterator(this.data);
        int i = 0;
        while(it.hasNext()){
            it.setDataIterible(it.next());
            i++;
        }
        return ++i;
    }

    public E remove(int index){
        MyIterator it = new MyIterator(this.data);

        while (it.hasNext() && index >1){
            it.setDataIterible(it.next());
        }

        Node tmp = it.getDataIterible();
        it.setDataIterible(it.next());
        tmp.setNextNode(it.getDataIterible().getNextNode());
        return (E)it.getDataIterible().getElement();
    }

    public String toString(){
        String str = "[";
        MyIterator it = new MyIterator(this.data);
        str+= "["+ it.getDataIterible().getElement()+"]";
        while(it.hasNext()){
            it.setDataIterible(it.next());
            str+= "["+ it.getDataIterible().getElement()+"]";
        }

        str+= "]";
        return str;
    }

    public Object[] toArray(){
        MyIterator it = new MyIterator(this.data);
        Object[] arr = new Object[this.size()];
        arr[0] = it.getDataIterible().getElement();
        int i = 1;
        while (it.hasNext()){
            it.setDataIterible(it.next());
            arr[i] = it.getDataIterible().getElement();
            i++;
        }
        return arr;
    }
    /*public Node getData() {
        return data;
    }

    public void add(int index, E element){
        data.add(index, element);
    }

    public void clear(){
        data.setNextNode(null);
        data.setElement(null);
    }


    public E get(int index){
        return 0;
    }
    public  int indexOf(E element){
        return 0;
    }
    public E remove(int index);
    public E set(int index, E element);
    public int size();
    public E[] toArray();
    public String toString();*/
}
