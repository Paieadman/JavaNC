import java.util.Iterator;

public class MyIterator implements java.util.Iterator {
    private Node dataIterible;

    public Node getDataIterible() {
        return dataIterible;
    }

    public void setDataIterible(Node dataIterible) {
        this.dataIterible = dataIterible;
    }

    public MyIterator(Node data) {
        this.dataIterible = data;
    }

    public boolean hasNext(){
        if (dataIterible.getNextNode() == null){
            return false;
        }
        else{
            return true;
        }
    }


    public Node next(){
        if(dataIterible.getNextNode()!= null){
            return dataIterible.getNextNode();
        } else {
            System.out.println("next element doesn't exist");
            return null;
        }

    }


    public void remove() {

    }

}
