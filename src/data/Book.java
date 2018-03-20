package data;

public class Book
{
    String title;
    String author;
    int releaseDate;
    int pages;
    String publisher;
    String isbn;

    public Book (String title, String author, int relaseDate, int pages, String publisher, String isbn)
    {
        this.title = title;
        this.author = author;
        this.releaseDate = relaseDate;
        this.pages = pages;
        this.publisher = publisher;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    Book (Book book)
    {
        this(book.title, book.author, book.releaseDate, book.pages, book.publisher, book.isbn);
    }

    public void bookInfo()
    {
        System.out.println("Tytul ksiazki to: " + title);
        System.out.println("Autor ksiazki to: " + author);
        System.out.println("Data wydania ksiazki to: " + releaseDate);
        System.out.println("Strony ksiazki to: " + pages);
        System.out.println("Wydawca ksiazki to: " + publisher);
        System.out.println("Isbn ksiazki to: " + isbn);
        System.out.println();
    }
}
