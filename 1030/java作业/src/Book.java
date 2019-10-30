public class Book {
    private String ISBN = "";
    private String name = "";
    private String writer = "";
    private String publishing = "";
    private int price = 0;
    private int pages = 0;

    public Book() {}

    public Book(String ISBN, String name, String writer, String publishing, int price, int pages) {
        this.ISBN = ISBN;
        this.name = name;
        this.writer = writer;
        this.publishing = publishing;
        this.price = price;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "ISBN:" + ISBN + " 图书名称: " + name + " 作者:" + writer + " 出版社:"
                + publishing + " 价格:" + price + " 页码:" + pages;
    }
}
