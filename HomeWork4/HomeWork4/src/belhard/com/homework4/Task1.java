package belhard.com.homework4;

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


        Book [] books=new Book[10];
        books [0]=book1;
        books [1]=book2;
        books [2]=book3;

        Reader reader1=new Reader();
        reader1.setSurnameName("setSurnameName1");
        reader1.setBooks(books);

        reader1.printStatus();
        reader1.takeBook( book3);

        reader1.returnBook("name 3");



    }
}
