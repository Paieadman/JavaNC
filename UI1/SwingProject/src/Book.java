public class Book {
    private int ISBN;
    private String name;
    private Boolean paper;

    @Override
    public String toString() {
        return "Book{" +
                "ISBN=" + ISBN +
                ", name='" + name + '\'' +
                ", paper=" + paper +
                '}';
    }

    public Book(int ISBN, String name, Boolean paper) {
        this.ISBN = ISBN;
        this.name = name;
        this.paper = paper;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getPaper() {
        return paper;
    }

    public void setPaper(Boolean paper) {
        this.paper = paper;
    }
}
