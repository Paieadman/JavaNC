import java.util.Arrays;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public Book(String name, Author[] authors, double price) {
        this(name, authors, price, 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }

    public String getAuthorNames(){
        String str = "";
        for(int i = 0; i< authors.length; i++){
            str+= authors[i].getName()+ ",";
        }
        return  str;
    }

    public int hashCode() {
        int result = 17;
        result = result*31 + name.hashCode();
        result = 31 * result + Arrays.hashCode(authors);
        result = 31*result+ (int)(Double.doubleToLongBits(price)^(Double.doubleToLongBits(price))>>32);
        result = 31*result + qty;
        return result;
    }

    public boolean equals(Book book){
        if(book.hashCode() == this.hashCode())
        {return true;}
        else{
            return false;
        }
    }

}
