public class Book implements Comparable<Book>{
    private String bookName;
    private int pageNumber;
    private String author;
    private String release;

    public Book(String bookName, int pageNumber, String author, String release) {
        this.bookName = bookName;
        this.pageNumber = pageNumber;
        this.author = author;
        this.release = release;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }


    @Override
    public int compareTo(Book o) {
        return this.bookName.compareTo(o.bookName);
    }
}
