package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Registration {

    Scanner sc = new Scanner(System.in);
    String answer;
    public Reader regReader(){
        System.out.println("Please enter your login : ");
        String log=sc.nextLine();
        System.out.println("Please enter your pass : ");
        String pass=sc.nextLine();
        System.out.println("Please enter your name : ");
        String name=sc.nextLine();
        System.out.println("Please enter your last name : ");
        String lastName=sc.nextLine();
        System.out.println("Please enter your faculty : ");
        String fac=sc.nextLine();
        System.out.println("Please enter your birth date : ");
        int birth=Integer.parseInt(sc.nextLine());
        System.out.println("Please enter your mobile number : ");
        int num=Integer.parseInt(sc.nextLine());

       return  new Reader (log,pass,name,lastName,fac,birth,num);

    }


}
