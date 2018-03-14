public class Book
{
    String title;
    String author;
    int releaseDate;
    int pages;
    String publisher;
    String isbn;

    Book (String title, String author, int relaseDate, int pages, String publisher, String isbn)
    {
        this.title = title;
        this.author = author;
        this.releaseDate = relaseDate;
        this.pages = pages;
        this.publisher = publisher;
        this.isbn = isbn;
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
