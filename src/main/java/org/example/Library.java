package org.example;

import javax.print.DocFlavor;
import java.util.*;

public class Library {
    private ArrayList<Reader> logReader=new ArrayList<>();
    private  ArrayList<Reader> readers = new ArrayList();
    private ArrayList<Book> books = new ArrayList();
    private HashMap<Book , Reader> readerBook=new HashMap<>();

    Registration reg;
    public Library(ArrayList readers,ArrayList books,HashMap readerBook){
        this.books=books;
        this.readers=readers;
        this.readerBook=readerBook;
         reg =new Registration();
    }

    public void toStringBooks(){
        for(Book book: books){
            System.out.println(book.toString()+'\n'+"----------------------------------------------"+'\n');
        }

    }

    public void regReader(){
        readers.add(reg.regReader());
    }

    public boolean logCheck(String answer){
        for (Reader reader: readers) {
            if (answer.equals(reader.getLogin())){
                return true;
            }
        }
        return false;
    }

    public boolean passCheck(String answer){
        for (Reader reader: readers) {
            if (answer.equals(reader.getPassword())){
                logReader.add(reader);
                return true;
            }
        }
        return false;
    }

    public void bookListReader(){
        Set<Map.Entry<Book,Reader>> entrySet= readerBook.entrySet();

        for(Map.Entry<Book,Reader> pair:entrySet){
            if (logReader.get(0).equals(pair.getValue())){
                System.out.println(pair.getKey()+""+'\n'+"----------------------------------------------"+'\n');
            }
        }
    }

    public void giveBook(int answerChoose){
        readerBook.put(getBooks().get((answerChoose-1)),getLogReader().get(0));

        System.out.println("you received book "+getBooks().get((answerChoose-1)));
    }

    public void takeBook(String answer){
        Set<Map.Entry<Book,Reader>> entrySet= readerBook.entrySet();

        for(Map.Entry<Book,Reader> pair:entrySet){
            if (answer.equals(pair.getKey())){
                books.add(pair.getKey());
                readerBook.remove(pair.getKey());
            }
        }

    }

    public void addReader(Reader reader){
        readers.add(reader);
        System.out.println("Reader has been added!");
    }

    public  void addBook(String name, String author) {
        books.add(new Book(name,author));
        System.out.println("Book been added "+name);

    }


    public ArrayList<Reader> getLogReader() {
        return logReader;
    }

    public void setLogReader(ArrayList<Reader> logReader) {
        this.logReader = logReader;
    }
    public ArrayList<Reader> getReaders(){
        return readers;
    }
    public void setReaders(ArrayList readers){
    this.readers=readers;
    }
    public ArrayList<Book> getBooks(){
        return books;
    }
    public void setBooks(ArrayList books){
    this.books=books;
    }
    public HashMap<Book,Reader> getReadersBook(){
        return readerBook;
    }
    public void setReadersBooks(HashMap readerBook){
    this.readerBook=readerBook;
    }


}
