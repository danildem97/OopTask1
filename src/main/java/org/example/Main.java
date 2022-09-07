package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Phone Task

        /*Phone p1=new Phone(1,"p1",10);
        Phone p2=new Phone(2,"p2",20);
        Phone p3=new Phone(3,"p3",30);

        System.out.println("Phone1 = "+'\n'+p1.getNumber()+'\n'+p1.model+'\n'+p1.weight);
        System.out.println("Phone1 = "+'\n'+p2.getNumber()+'\n'+p2.model+'\n'+p2.weight);
        System.out.println("Phone1 = "+'\n'+p3.getNumber()+'\n'+p3.model+'\n'+p3.weight);

        p1.receiveCall("Max");
        p1.receiveCall("Max",12321);
        p1.sendMessage(123);*/

        //Library Task

//        Library lib =new Library(new ArrayList<>(),new ArrayList(),new HashMap());
//        lib.addBook("Idiot","dostaevski");
//        lib.addBook("Goblin","petrov");
//        lib.addBook("ogr","ivanov");
//        Book book=new Book("fds","fds");
//        Reader reader = new Reader("fds","fds","dfsf",432,4324);
//        lib.giveBook(reader,book);
//        lib.takeBook(book);
        Library lib =new Library(new ArrayList<>(),new ArrayList<>(),new HashMap<>());
        Scanner scanner=new Scanner(System.in);
        String answer;
        int answerChoose;
        lib.addBook("Idiot","Dostoevski");
        lib.addBook("Idi","Dostoev");
        lib.addBook("I","Dost");
        Reader reader = new Reader("danil","danildem","dan","nylo","dsad",321,33214);
        lib.addReader(reader);
        lib.toStringBooks();

        System.out.println("1 - Enter"+'\n'+
                           "2 - Leave1");
       switch (Integer.parseInt(scanner.nextLine())){
           case 1:

               for(int a =0;a<=1;a++){
                   System.out.println("Do you have account?");

                   answer=scanner.nextLine();
                   if (answer.equals("yes")){
                       System.out.println("Please write down your login : ");
                       answer=scanner.nextLine();
                       if (lib.logCheck(answer)){
                           System.out.println("Please write down your pass : ");
                           answer=scanner.nextLine();

                               if (lib.passCheck(answer)) {
                                   System.out.println("Login successfully completed!" + '\n');
                                   while (true) {
                                       System.out.println("Please select next option : " + '\n' +
                                               "1 - Take book." + '\n' +
                                               "2 - Return book.");
                                       answer = scanner.nextLine();
                                       if (answer.equals("1")) {
                                           System.out.println("Which book you want to take?"+'\n');
                                           lib.toStringBooks();
                                           answerChoose = Integer.parseInt(scanner.nextLine());
                                          lib.giveBook(answerChoose);

                                           if (lib.getBooks().size()==0){
                                               System.out.println("No more books left!");
                                           }
                                           System.out.println("Do you want something else?");
                                           answer = scanner.nextLine();
                                           if (answer.equals("no")) {

                                               System.out.println("Thank you for visiting! Good bye!");
                                               System.exit(0);
                                           }


                                       } else {
                                           System.out.println("Which book you want to return?");
                                           lib.bookListReader();
                                           answer = scanner.nextLine();
                                           lib.takeBook(answer);

                                       }
                                   }

                               }
                       }


                   }else {
                       System.out.println("Do you wanna register?");

                       String  answer2=scanner.nextLine();

                       if (answer2.equals("yes")){
                           lib.regReader();
                           System.out.println("You registered successfully");



                       }else {break;}
                   }
               }

           case 2:{
               System.out.println("Thank you for visiting! Good bye!");
           }

            }







    }
}