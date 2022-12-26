package belhard.com.homework4;

import java.util.Scanner;

public class Task2 {
    public static void main (String [] args){
        Scanner scanner=new Scanner(System.in);
        int action;
        Reader[] readers=new Reader[10];

        do {
            System.out.println("1--добавить нового читателя");
            System.out.println("2--читатель хочет взять книгу");
            System.out.println("3--читатель хочет вернуть книгу");
            System.out.println("4--вывести статус читателя");
            System.out.println("5--вывести статус всех читателей");
            System.out.println("6--выйти из программы");
            System.out.println("Введите номер действия");
            action=scanner.nextInt();
            scanner.nextInt(); // scanner.nextInt(); в ни куда,чтобы не пропускать следующий ввод

            switch (action){
                case 1:{
                    boolean isFull=true; //true если в массиве нет места
                    for (int i=0; i< readers.length-1;i++) {
                        if (readers[i] == null) {
                            Reader reader=createReader();
                            readers[i]=reader;
                            isFull=false;
                            break;
                        }
                        }
                        if (isFull) {
                            System.out.println("Количество читателей уже максимальное");
                        }
                        break;
                    }
                case 2:{
                    System.out.println("Введите название книги ");
                    String bookName=scanner.next();
                    System.out.println("Введите название автора ");
                    String authorName=scanner.next();
                    Book b1=new Book();
                    b1.setName(bookName);
                    b1.setAuthorName(authorName);
                    System.out.println("введите номер читательского билета");
                    int number= scanner.nextInt();
                    scanner.nextInt();
                    boolean found=false; //true если в массиве нет места
                    for (int i=0; i< readers.length-1;i++) {
                        if (readers[i] != null && readers[i].getNumber()==number) {
                            Reader r=readers[i];
                            r.takeBook(b1);
                           found=true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Такого пользователя нет");
                    }
                    break;
                }
                case 3:{
                    System.out.println("Введите название книги ");
                    String bookName=scanner.next();
                    System.out.println("Введите номер читательского билета ");
                    int number= scanner.nextInt();
                    scanner.nextInt();
                    boolean found=false; //true если в массиве нет места (если мы нашли такого читателя)
                    for (int i=0; i< readers.length-1;i++) {
                        if (readers[i] != null && readers[i].getNumber()==number) {
                            Reader r=readers[i];
                            r.returnBook(bookName);
                            found=true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Такого пользователя нет");
                    }
                    break;

                }
                case 4:{
                    System.out.println("Введите номер читательского билета ");
                    int number= scanner.nextInt();
                    scanner.nextInt();
                    boolean found=false; //true если в массиве нет места
                    for (int i=0; i< readers.length-1;i++) {
                        if (readers[i] != null && readers[i].getNumber()==number) {
                            Reader r=readers[i];
                            r.printStatus();
                            found=true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Такого пользователя нет");
                    }
                    break;
                }
                case 5: {
                    for (Reader r:readers) {
                        if (r !=null && r.getBooks()!=null) {
                             r.printStatus();
                        }
                    }
                }
                case 6:{
                    System.out.println("Завершаем программу");
                    break;
                }
                default:{
                    System.out.println("Нет такой команды");
                }
                }
            } while (action!=6);



        }
        private static Reader createReader (){
            Scanner scanner=new Scanner(System.in);
            System.out.println("введите имя нового читателя");
            String readerName=scanner.next();
            System.out.println("введите номер читательского билета");
            int readerNumber=scanner.nextInt();
            Reader r=new Reader();
            r.setSurnameName(readerName);
            r.setNumber(readerNumber);
            return r;
        }

    }

