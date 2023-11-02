package HW_30.Library.dao;

// создаем класс Book c полями ISBN, автор, название книги, год издания;
public class Book {

  private long isbn;
    private String author;
    private String title;
    private int yaerOfPublishing;

    public Book(long isbn, String author, String title, int yaerOfPublishing) {
        this.isbn = isbn;
        this.author = author;
        this.title = title;
        this.yaerOfPublishing = yaerOfPublishing;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYaerOfPublishing() {
        return yaerOfPublishing;
    }

    public void setYaerOfPublishing(int yaerOfPublishing) {
        this.yaerOfPublishing = yaerOfPublishing;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", yaerOfPublishing=" + yaerOfPublishing +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Book book = (Book) object;

        if (isbn != book.isbn) return false;
        if (yaerOfPublishing != book.yaerOfPublishing) return false;
        if (!author.equals(book.author)) return false;
        return title.equals(book.title);
    }

    @Override
    public int hashCode() {
        int result = (int) (isbn ^ (isbn >>> 32));
        result = 31 * result + author.hashCode();
        result = 31 * result + title.hashCode();
        result = 31 * result + yaerOfPublishing;
        return result;
    }
}
