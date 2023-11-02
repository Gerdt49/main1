package HW_30.Library.dao;
 //создаем интерфейс Library с методами:
//    добавить книгу;
//    удалить книгу;
//    найти книгу;
//    кол-во книг;
//    напечатать список книг.

public interface Library {
    boolean addBook(Book book); // добавить
    Book removeBook(long isbn); //  удалить
    Book findBook(long isbn); // найти
    int quantity();  // кол-во
    void printBook(); // напечатать список  книг.

}
