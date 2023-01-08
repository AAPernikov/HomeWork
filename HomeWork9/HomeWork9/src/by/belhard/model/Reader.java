package by.belhard.model;

import java.util.LinkedList;
import java.util.List;

public class Reader {

    private String surnameName;
    private int librarycard;
    private String faculty;
    private int dataBirth;
    private int number;
    private List<Book> books=new LinkedList<>(); // создание  пустого списка

    public String getSurnameName() {
        return surnameName;
    }

    public void setSurnameName(String surnameName) {
        this.surnameName = surnameName;
    }

    public int getLibrarycard() {
        return librarycard;
    }

    public void setLibrarycard(int librarycard) {
        this.librarycard = librarycard;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getDataBirth() {
        return dataBirth;
    }

    public void setDataBirth(int dataBirth) {
        this.dataBirth = dataBirth;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<Book> getBooks() {  //новая генерация
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void printStatus(){
        System.out.print(surnameName);
        int count=0;
        String bookName = "";
        if (books!=null) {
            for(int i=0; i<books.size();i++) {
                Book book = books.get(i);
                if (book!=null) {
                    String value = book.getName();
                    bookName += value + ", ";//bookName=bookName+value+", "
                    count++;
                }
            }
            System.out.println(" взял "+count+" книг:"+bookName);
        }
    }
    public void takeBook (Book book) {
        int count=0;
        for(int i=0; i<books.size();i++) {
            Book book1 = books.get(i);
            if (book1!=null) {
                count++;
            }
        }
        books.add(book);
        System.out.println(surnameName+" взял книгу:"+ book.getName());
    }
    public void returnBook (String bookName){
        boolean isFound=false;
        for(int i=0; i<books.size();i++){
            Book book = books.get(i);
            if (book!=null && book.getName().equals( bookName)){
                deleteItemFromArray (i);
                isFound=true;
                System.out.println(surnameName+" вернул книгу:"+ bookName);
                break;
            }

        }
        if (!isFound){
            System.out.println(surnameName+" не хранит книгу:"+ bookName);
        }
    }
    private void deleteItemFromArray (int index) {
        for (int i = index; i < books.size() - 1; i++) {
            //выполняем перемещение элементов к началу, в результате чего пустая ячейка окажется в конце
            if (i > 0) {
                books.add((i-1), books.get(i));
            }
            books.add(i,null);
        }
    }
}
