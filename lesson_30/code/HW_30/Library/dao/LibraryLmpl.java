package HW_30.Library.dao;

import Company.company.model.model.Employee;

public class LibraryLmpl implements Library {
    private Book[] books;
    private int size;

    public LibraryLmpl(int capacity){
      books = new Book[capacity];
    }

    public boolean addBook(Book book) {
           if(book == null || size == books.length  || findBook(book.getIsbn()) != null) {
              return  false;
          }
           books[size] = book;
          size++;
          return true;
    }

    @Override
    public Book removeBook(long isbn) {
            for (int i = 0; i < size; i++) {
                if(books[i].getIsbn() == isbn){
                    Book victim = books[i]; // ubrali element v peremenuj
                    books[i] =books[size-1]; // na mesto najdenogo postavili poslednego
                    books[size-1] = null; // obnulili poslednego
                    size--;
                    return victim;
                }
            }
            return null;

    }

    @Override
    public Book findBook(long isbn) {
        for (int i = 0; i < size; i++) {
            if(books[i].getIsbn() == isbn ){    // naschelsy element massiva s isbn
                return books[i]; //  vernuli rabotnika tipa Employee
            }
        }
        return null;
    }

    @Override
    public int quantity() {
        return size;
    }


    @Override
    public void printBook() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }

    }

}
