package by.belhard;

import by.belhard.model.Book;
import by.belhard.model.Reader;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main (String [] args) { // точка входа в приложение
        Book book1=new Book();
        book1.setName("name 1");
        book1.setAuthorName("Avtor1");
        book1.setText("Text1");

        Book book2=new Book();
        book2.setName("name 2");
        book2.setAuthorName("Avtor2");
        book2.setText("Text2");

        Book book3=new Book();
        book3.setName("name 3");
        book3.setAuthorName("Avtor3");
        book3.setText("Text 3");


        List<Book> books=new ArrayList<>();// создали пустой список
        books.add(book1);

        Reader reader1=new Reader();
        reader1.setSurnameName("setSurnameName1");
        reader1.setBooks(books);

        List<Book> books2=new ArrayList<>();// создали пустой список для Reader2
        books2.add(book1);
        books2.add(book2);

        Reader reader2=new Reader();
        reader2.setSurnameName("setSurnameName2");
        reader2.setBooks(books2);

        List <Reader> readers=new ArrayList<>();
        readers.add(reader1);
        readers.add(reader2);

        reader1.printStatus();
        reader1.takeBook( book3);

        reader1.returnBook("name 3");

        reader2.printStatus();
        reader2.takeBook( book3);

        reader2.returnBook("name 3");


    }
}



